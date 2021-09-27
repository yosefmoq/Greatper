package com.app.greatper.activities

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import com.app.greatper.R
import android.webkit.WebViewClient
import android.widget.ProgressBar


class MainActivity : AppCompatActivity() {

    val url = "https://greatper.com/"
    lateinit var wv:WebView
    lateinit var progress:ProgressBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wv = findViewById(R.id.wv)
        progress = findViewById(R.id.progressBar)
        wv.webViewClient = object :WebViewClient(){
            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                view.loadUrl(url)
                return true
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                progress.visibility = View.GONE
            }

            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
                progress.visibility = View.VISIBLE

            }
        }
        wv.settings.loadsImagesAutomatically = true
        wv.settings.javaScriptEnabled = true
        wv.scrollBarStyle = View.SCROLLBARS_INSIDE_OVERLAY
        wv.loadUrl(url)


    }


}