package com.fridayof1995.sample.WebView

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.*
import android.webkit.WebView
import android.widget.Button
import com.fridayof1995.sample.R
import kotlinx.android.synthetic.main.activity_c.*
import kotlin.reflect.typeOf

class C : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        val pyWebView:WebView = findViewById(R.id.WebView_C)
        var pyWebViewSettings = pyWebView.settings
        pyWebViewSettings.javaScriptEnabled = true
        pyWebViewSettings.useWideViewPort = true
        pyWebViewSettings.builtInZoomControls = true
        pyWebView.settings.domStorageEnabled = true;
        pyWebView.webViewClient = WebViewClient()
        pyWebView.loadUrl("https://hashcode.co.kr/code_runners?language=c")

        val bracel =findViewById<Button>(R.id.bracel)
        val bracer =findViewById<Button>(R.id.bracer)
        val quot =findViewById<Button>(R.id.quot)
        val Semicolon =findViewById<Button>(R.id.Semicolon)
        val slash =findViewById<Button>(R.id.slash)
        val equal =findViewById<Button>(R.id.equal)

        bracel.setOnClickListener {
        }
    }
}