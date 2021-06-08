package com.fridayof1995.sample.WebView

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.*
import android.webkit.WebView
import com.fridayof1995.sample.R

class WebView : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        val myWebView:WebView = findViewById(R.id.WebView_Community)
        var myWebViewSettings = myWebView.settings
        myWebViewSettings.javaScriptEnabled = true
        myWebViewSettings.useWideViewPort = true
        myWebViewSettings.builtInZoomControls = true
        myWebView.webViewClient = WebViewClient()
        myWebView.loadUrl("http://hyoj0942.dothome.co.kr/bbs/board.php?bo_table=qa")
    }
}