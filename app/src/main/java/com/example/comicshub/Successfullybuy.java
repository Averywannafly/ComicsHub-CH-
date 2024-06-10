package com.example.comicshub;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Successfullybuy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successfullybuy);

        // Button click listener
        findViewById(R.id.orderButton).setOnClickListener(v -> {
            // Navigate to HomePage
            Intent intent = new Intent(Successfullybuy.this, HomePage.class);
            startActivity(intent);
        });
    }
}
