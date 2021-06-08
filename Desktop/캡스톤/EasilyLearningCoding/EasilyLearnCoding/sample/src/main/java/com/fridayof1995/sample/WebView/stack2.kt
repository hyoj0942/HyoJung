package com.fridayof1995.sample.WebView

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.*
import android.webkit.WebView
import com.fridayof1995.sample.R

class stack2 : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stack2)
        val pyWebView:WebView = findViewById(R.id.WebView_stack2)
        var pyWebViewSettings = pyWebView.settings
        pyWebViewSettings.javaScriptEnabled = true
        pyWebViewSettings.useWideViewPort = true
        pyWebViewSettings.builtInZoomControls = true
        pyWebView.settings.domStorageEnabled = true;
        pyWebView.webViewClient = WebViewClient()
        pyWebView.loadUrl("https://programmers.co.kr/learn/courses/30/lessons/42583")
    }
}