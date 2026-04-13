package com.example.file_handling;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    EditText etData;
    Button btnSave, btnRead;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etData = findViewById(R.id.etData);
        btnSave = findViewById(R.id.btnSave);
        btnRead = findViewById(R.id.btnRead);
        tvResult = findViewById(R.id.tvResult);

        // 🔥 SAVE DATA
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String data = etData.getText().toString();

                try {
                    FileOutputStream fos = openFileOutput("myfile.txt", MODE_PRIVATE);
                    fos.write(data.getBytes());
                    fos.close();

                    Toast.makeText(MainActivity.this,
                            "Data Saved",
                            Toast.LENGTH_SHORT).show();

                } catch (Exception e) {
                    Toast.makeText(MainActivity.this,
                            "Error Saving",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        // 🔥 READ DATA
        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    FileInputStream fis = openFileInput("myfile.txt");

                    int ch;
                    String data = "";

                    while ((ch = fis.read()) != -1) {
                        data += (char) ch;
                    }

                    fis.close();

                    tvResult.setText(data);

                } catch (Exception e) {
                    tvResult.setText("No Data Found");
                }
            }
        });
    }
}