package com.example.jarellxml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MapActivity : AppCompatActivity() {
    lateinit var google:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        google=findViewById(R.id.map)

        google.webViewClient= WebViewClient()
        google.loadUrl("https://www.google.com/maps/@-1.2664224,36.7932159,14z?entry=ttu")
        google.settings.javaScriptEnabled=true
        google.settings.setSupportZoom(true)
    }
}