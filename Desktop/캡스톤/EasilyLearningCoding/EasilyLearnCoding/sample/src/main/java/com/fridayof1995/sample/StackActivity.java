package com.fridayof1995.sample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class StackActivity extends AppCompatActivity {

    private ImageButton stack1, stack2, stack3, stack4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack);

        stack1= findViewById(R.id.stack1);
        stack2= findViewById(R.id.stack2);
        stack3= findViewById(R.id.stack3);
        stack4= findViewById(R.id.stack4);

        stack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StackActivity.this, com.fridayof1995.sample.WebView.hash1.class);
                startActivity(intent);
            }
        });
        stack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StackActivity.this, com.fridayof1995.sample.WebView.hash2.class);
                startActivity(intent);
            }
        });
        stack3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StackActivity.this, com.fridayof1995.sample.WebView.hash3.class);
                startActivity(intent);
            }
        });
        stack4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StackActivity.this, com.fridayof1995.sample.WebView.hash4.class);
                startActivity(intent);
            }
        });
    }
}