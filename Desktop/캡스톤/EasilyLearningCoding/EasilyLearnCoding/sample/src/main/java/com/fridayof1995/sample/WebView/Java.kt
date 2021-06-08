package com.fridayof1995.sample.WebView

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.*
import android.webkit.WebView
import com.fridayof1995.sample.R

class Java : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_java)
        val pyWebView:WebView = findViewById(R.id.WebView_Java)
        var pyWebViewSettings = pyWebView.settings
        pyWebViewSettings.javaScriptEnabled = true
        pyWebViewSettings.useWideViewPort = true
        pyWebViewSettings.builtInZoomControls = true
        pyWebView.settings.domStorageEnabled = true;
        pyWebView.webViewClient = WebViewClient()
        pyWebView.loadUrl("https://hashcode.co.kr/code_runners?language=java")
    }
}