package com.example.assignment8;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tvText;
    Button btnPopup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvText = findViewById(R.id.tvText);
        btnPopup = findViewById(R.id.btnPopup);

        // Context Menu register
        registerForContextMenu(tvText);

        // Popup Menu
        btnPopup.setOnClickListener(v -> {
            PopupMenu popupMenu = new PopupMenu(MainActivity.this, btnPopup);
            popupMenu.getMenu().add("Edit");
            popupMenu.getMenu().add("Delete");
            popupMenu.getMenu().add("Share");

            popupMenu.setOnMenuItemClickListener(item -> {
                Toast.makeText(MainActivity.this,
                        item.getTitle() + " clicked",
                        Toast.LENGTH_SHORT).show();
                return true;
            });

            popupMenu.show();
        });
    }

    // ⭐ Options Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("Settings");
        menu.add("Profile");
        menu.add("Logout");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this,
                item.getTitle() + " selected",
                Toast.LENGTH_SHORT).show();
        return true;
    }

    // ⭐ Context Menu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Context Menu");
        menu.add("Copy");
        menu.add("Paste");
        menu.add("Delete");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Toast.makeText(this,
                item.getTitle() + " selected",
                Toast.LENGTH_SHORT).show();
        return true;
    }
}