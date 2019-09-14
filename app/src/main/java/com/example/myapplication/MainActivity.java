package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import android.webkit.WebChromeClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private WebView web1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        web1 =(WebView) findViewById(R.id.webview);

        WebSettings webSettings = web1.getSettings();
        webSettings.setJavaScriptEnabled(true);
        web1.loadUrl("http://alsoq.co/tablet");
        web1.setWebViewClient(new WebViewClient());


    }
    @Override
    public void onBackPressed() {
        if(web1.canGoBack()) {
            web1.goBack();
            Toast.makeText(MainActivity.this,"back pressed",Toast.LENGTH_LONG).show();
        } else {
            super.onBackPressed();
        }
    }




}
