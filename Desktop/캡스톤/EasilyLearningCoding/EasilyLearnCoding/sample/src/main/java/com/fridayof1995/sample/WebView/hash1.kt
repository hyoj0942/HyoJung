package com.fridayof1995.sample.WebView

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.*
import android.webkit.WebView
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import com.fridayof1995.sample.R
import kotlinx.android.synthetic.main.activity_hash1.*
import kotlinx.android.synthetic.main.activity_manager.*
import kotlinx.android.synthetic.main.activity_manager.view.*
import kotlinx.android.synthetic.main.activity_manager.view.textView

class hash1 : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hash1)
        val pyWebView: WebView = findViewById(R.id.WebView_hash1)
        var pyWebViewSettings = pyWebView.settings
        pyWebViewSettings.javaScriptEnabled = true
        pyWebViewSettings.useWideViewPort = true
        pyWebViewSettings.builtInZoomControls = true
        pyWebView.settings.domStorageEnabled = true;
        pyWebView.webViewClient = WebViewClient()
        pyWebView.loadUrl("https://programmers.co.kr/learn/courses/30/lessons/42576")

        val bracel = findViewById<Button>(R.id.bracel)
        val bracer = findViewById<Button>(R.id.bracer)
        val quot = findViewById<Button>(R.id.quot)
        val Semicolon = findViewById<Button>(R.id.Semicolon)
        val slash = findViewById<Button>(R.id.slash)
        val equal = findViewById<Button>(R.id.equal)
        val hide = findViewById<Button>(R.id.hide)
        val hashcode = findViewById<ConstraintLayout>(R.id.hashcode)


        hide.setOnClickListener {
            if (hide.text == "OFF") {
                hashcode.visibility = View.INVISIBLE
                hide.text = "ON"
            }
            else
            {
                hashcode.visibility = View.VISIBLE
                hide.text = "OFF"
            }
        }
        bracel.setOnClickListener{
        }
    }
}