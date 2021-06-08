package com.fridayof1995.sample;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import me.saket.inboxrecyclerview.InboxRecyclerView;

public class qnaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qna);

        InboxRecyclerView qna_recyclerview = findViewById(R.id.qna_recyclerview);

        findViewById(R.id.btn_Write).setOnClickListener((View.OnClickListener) this);
    }

}