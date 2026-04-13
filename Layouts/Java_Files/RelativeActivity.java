package com.example.layoutmasterapp;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RelativeActivity extends AppCompatActivity {

    Button loginBtn, backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        loginBtn = findViewById(R.id.loginBtn);
        backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(v -> finish());
    }
}