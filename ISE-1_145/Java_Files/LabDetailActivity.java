package com.example.ise1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class LabDetailActivity extends AppCompatActivity {

    ImageView labImage;
    TextView labNumber, labTitle, labDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_detail);

        labImage = findViewById(R.id.labImage);
        labNumber = findViewById(R.id.labNumber);
        labTitle = findViewById(R.id.labTitle);
        labDescription = findViewById(R.id.labDescription);

        int image = getIntent().getIntExtra("image",0);
        String number = getIntent().getStringExtra("number");
        String title = getIntent().getStringExtra("title");
        String desc = getIntent().getStringExtra("desc");

        labImage.setImageResource(image);
        labNumber.setText(number);
        labTitle.setText(title);
        labDescription.setText(desc);
    }

    public void goBack(View view){
        finish();
    }
}