package com.example.layoutmasterapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnLinear, btnRelative, btnFrame, btnConstraint, btnTable, btnGrid, btnScroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLinear = findViewById(R.id.btnLinear);
        btnRelative = findViewById(R.id.btnRelative);
        btnFrame = findViewById(R.id.btnFrame);
        btnConstraint = findViewById(R.id.btnConstraint);
        btnTable = findViewById(R.id.btnTable);
        btnGrid = findViewById(R.id.btnGrid);
        btnScroll = findViewById(R.id.btnScroll);

        btnLinear.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, LinearActivity.class)));

        btnRelative.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, RelativeActivity.class)));

        btnFrame.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, FrameActivity.class)));

        btnConstraint.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ConstraintActivity.class)));

        btnTable.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, TableActivity.class)));

        btnGrid.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, GridActivity.class)));

        btnScroll.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ScrollActivity.class)));
    }
}