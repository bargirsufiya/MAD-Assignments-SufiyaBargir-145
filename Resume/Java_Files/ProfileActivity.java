package com.example.profileappexplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    TextView phone, linkedin;
    Button backBtn, whatsappBtn, emailBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // IDs connect karo XML se
        phone = findViewById(R.id.phoneNumber);
        linkedin = findViewById(R.id.linkedin);   // ⚠️ XML me same id hona chahiye
        backBtn = findViewById(R.id.backBtn);
        whatsappBtn = findViewById(R.id.whatsappBtn);
        emailBtn = findViewById(R.id.emailBtn);

        // 📞 PHONE DIAL
        phone.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:7219503447"));
            startActivity(intent);
        });

        // 🔗 LINKEDIN OPEN
        linkedin.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.linkedin.com/in/"));
            startActivity(intent);
        });

        // 💬 WHATSAPP
        whatsappBtn.setOnClickListener(v -> {
            String number = "917219503447";
            String url = "https://wa.me/" + number;

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        });

        // 📧 EMAIL
        emailBtn.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:bargirsufiya17@gmail.com"));
            intent.putExtra(Intent.EXTRA_SUBJECT, "Hello Sufiya");
            startActivity(intent);
        });

        // 🔙 BACK
        backBtn.setOnClickListener(v -> finish());
    }
}