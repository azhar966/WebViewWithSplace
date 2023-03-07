package com.zebdul.splacescreen2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.zebdul.splacescreen2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mywebview:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mywebview = findViewById<WebView>(R.id.mywebview)
        mywebview.loadUrl("https://live.cricket.com.au/match/fixture")
        var webViewSetting = mywebview.settings
        webViewSetting.javaScriptEnabled = true
    }
    override fun onBackPressed(){
if (mywebview.canGoBack()){
    mywebview.goBack()
}else {
    super.onBackPressed()
}     } }
