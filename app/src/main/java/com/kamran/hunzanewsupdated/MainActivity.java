package com.kamran.hunzanewsupdated;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
private String url;

private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
webView=findViewById(R.id.webview);

        url= getIntent().getStringExtra("url");

        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://hunzanews.net/");
//        binding.webView.setWebViewClient(new WebViewClient());
//        binding.webView.loadUrl(url);



    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();

        if (webView.canGoBack()){
            webView.goBack();
        }else{
            webView.goBack();
        }
    }
}