package com.example.myfirstwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class GoogleWebVIew extends AppCompatActivity {

    private WebView webView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_web_view);


        Bundle bundle = getIntent().getExtras();
        String check= bundle.getString("key");

        if(bundle !=null){
            if(check.equals("google")){
                actionGoogleWebView();
            }
            else if(check.equals("youtube")){
                actionYoutubeView();
            }
            else if(check.equals("du")){
                actionDUView();
            }
            else if(check.equals("facebook")){
                actionFacebookView();
            }
            else if(check.equals("geeks")){
                actionGeeksView();
            }
        }




    }


    public void actionGoogleWebView(){
        webView1=findViewById(R.id.webView1);
        webView1.loadUrl("https://www.google.com/");
        WebSettings obj= webView1.getSettings();

        obj.setJavaScriptEnabled(true);
        webView1.setWebViewClient(new WebViewClient());
    }

    public void actionYoutubeView(){
        webView1=findViewById(R.id.webView1);
        webView1.loadUrl("https://www.youtube.com/");
        WebSettings obj= webView1.getSettings();

        obj.setJavaScriptEnabled(true);
        webView1.setWebViewClient(new WebViewClient());
    }

    public void actionDUView(){
        webView1=findViewById(R.id.webView1);
        webView1.loadUrl("https://www.du.ac.bd/");
        WebSettings obj= webView1.getSettings();

        obj.setJavaScriptEnabled(true);
        webView1.setWebViewClient(new WebViewClient());
    }

    public void actionGeeksView(){
        webView1=findViewById(R.id.webView1);
        webView1.loadUrl("https://www.geeksforgeeks.org/");
        WebSettings obj= webView1.getSettings();

        obj.setJavaScriptEnabled(true);
        webView1.setWebViewClient(new WebViewClient());
    }

    public void actionFacebookView(){
        webView1=findViewById(R.id.webView1);
        webView1.loadUrl("https://web.facebook.com/?_rdc=1&_rdr");
        WebSettings obj= webView1.getSettings();

        obj.setJavaScriptEnabled(true);
        webView1.setWebViewClient(new WebViewClient());
    }


    @Override
    public void onBackPressed() {
        if (webView1.canGoBack()){
            webView1.goBack();
        }else{
            super.onBackPressed();
        }
    }
}