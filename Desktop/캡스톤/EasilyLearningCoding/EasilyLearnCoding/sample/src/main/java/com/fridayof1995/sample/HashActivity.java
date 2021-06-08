package com.fridayof1995.sample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class HashActivity extends AppCompatActivity {
    private ImageButton hash1, hash2, hash3, hash4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hash);

        hash1= findViewById(R.id.hash1);
        hash2= findViewById(R.id.hash2);
        hash3= findViewById(R.id.hash3);
        hash4= findViewById(R.id.hash4);

        hash1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HashActivity.this, com.fridayof1995.sample.WebView.hash1.class);
                startActivity(intent);
            }
        });
        hash2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HashActivity.this, com.fridayof1995.sample.WebView.hash2.class);
                startActivity(intent);
            }
        });
        hash3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HashActivity.this, com.fridayof1995.sample.WebView.hash3.class);
                startActivity(intent);
            }
        });
        hash4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HashActivity.this, com.fridayof1995.sample.WebView.hash4.class);
                startActivity(intent);
            }
        });
    }
}