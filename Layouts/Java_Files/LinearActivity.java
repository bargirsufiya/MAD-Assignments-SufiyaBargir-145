package com.example.layoutmasterapp;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LinearActivity extends AppCompatActivity {

    Button btn1, btn2, backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(v -> finish());
    }
}