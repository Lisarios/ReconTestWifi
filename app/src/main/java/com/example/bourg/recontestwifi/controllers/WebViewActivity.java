package com.example.bourg.recontestwifi.controllers;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.VideoView;

import com.example.bourg.recontestwifi.R;

public class WebViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        WebView browser = (WebView) findViewById(R.id.webView);
        //browser.setVideoPath("https://youtu.be/9nsKPursiPg");
        browser.loadUrl("https://soundcloud.com/tenaciousd/the-metal");
        //browser.loadUrl("file:///android_asset/Processes and Threads _ Android Developers.htm");
    }
}