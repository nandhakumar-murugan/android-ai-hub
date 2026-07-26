package com.example.aihub

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.webView)
        val urlInput = findViewById<EditText>(R.id.urlInput)
        val loadButton = findViewById<Button>(R.id.loadButton)

        // Enable JavaScript for better web page loading
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()

        // Load default website
        webView.loadUrl("https://www.google.com")

        // Load website from user input
        loadButton.setOnClickListener {
            val url = urlInput.text.toString()
            if (url.isNotEmpty()) {
                webView.loadUrl(url)
            }
        }
    }
}
