package com.example.assignment7;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    TextView tvRating, tvProgress;
    ProgressBar progressBar;
    Button btnIncrease;

    int progress = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.ratingBar);
        tvRating = findViewById(R.id.tvRating);
        progressBar = findViewById(R.id.progressBar);
        tvProgress = findViewById(R.id.tvProgress);
        btnIncrease = findViewById(R.id.btnIncrease);

        // ⭐ Rating Event
        ratingBar.setOnRatingBarChangeListener((ratingBar, rating, fromUser) -> {
            tvRating.setText("Rating: " + rating);
        });

        // 📊 Progress Event
        btnIncrease.setOnClickListener(v -> {
            progress += 10;
            if (progress <= 100) {
                progressBar.setProgress(progress);
                tvProgress.setText("Progress: " + progress + "%");
            }
        });
    }
}