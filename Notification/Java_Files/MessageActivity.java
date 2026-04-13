package com.example.assignment9;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MessageActivity extends AppCompatActivity {

    TextView tvFullMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        tvFullMsg = findViewById(R.id.tvFullMsg);

        String msg = getIntent().getStringExtra("msg");
        tvFullMsg.setText(msg);
    }
}