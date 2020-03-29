package com.example.kosis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView myWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myWeb=findViewById(R.id.web);
        WebSettings webSettings=myWeb.getSettings() ;
        webSettings.setJavaScriptEnabled(true);
        // URL enter
        myWeb.loadUrl("Your URl here");
        // to make it mobile friendly
        myWeb.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {
        if(myWeb.canGoBack()){
            myWeb.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}
