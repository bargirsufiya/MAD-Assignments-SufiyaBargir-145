package com.example.layoutmasterapp;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ConstraintActivity extends AppCompatActivity {

    Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint);

        backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(v -> finish());
    }
}