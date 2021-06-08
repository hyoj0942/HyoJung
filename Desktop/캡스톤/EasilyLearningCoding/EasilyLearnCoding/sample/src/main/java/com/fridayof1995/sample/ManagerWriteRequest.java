package com.fridayof1995.sample;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class ManagerWriteRequest extends StringRequest {

    // 서버 URL 설정 ( PHP 파일연동 )
    final static private String URL = "http://hyoj0942.dothome.co.kr/Board_Data_Insert.php/";
    private Map<String, String> map;


    public ManagerWriteRequest(String title, String content, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("title", title);
        map.put("content", content);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}
