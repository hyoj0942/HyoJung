package com.fridayof1995.sample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class ManagerActivity extends AppCompatActivity {

    private EditText Notice_title, Notice_content;
    private Button btn_Write, btn_Pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager);

        Notice_title = findViewById(R.id.Notice_title);
        Notice_content = findViewById(R.id.Notice_content);
        btn_Write = findViewById(R.id.btn_Write);
        btn_Pass = findViewById(R.id.btn_Pass);



        // 작성 버튼을 누를 시...
        btn_Write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 게시판의 제목과 내용을 취득
                String title = Notice_title.getText().toString();
                String content = Notice_content.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            boolean success = jsonObject.getBoolean("success");
                            if (success) {
                                Toast.makeText(getApplicationContext(), "게시글 작성이 완료되었습니다.", Toast.LENGTH_SHORT).show();

                            } else {
                                Toast.makeText(getApplicationContext(), "게시글 작성에 실패하였습니다.", Toast.LENGTH_SHORT).show();
                                return;
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };

                // 서버로 Volley를 이용해서 요청을 함
                ManagerWriteRequest bwr = new ManagerWriteRequest(title,content,responseListener);
                RequestQueue rq = Volley.newRequestQueue(ManagerActivity.this);
                rq.add(bwr);
            }
        });

        btn_Pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManagerActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
