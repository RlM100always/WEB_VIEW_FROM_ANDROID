package com.example.myfirstwebview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

     private Button geeks ,du;
     Button google,facebook,youtube ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionBar();

        google = findViewById(R.id.google);
        geeks = findViewById(R.id.geeks);
        facebook=findViewById(R.id.facebook);
        youtube=findViewById(R.id.youtube);
        du =findViewById(R.id.du);

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,GoogleWebVIew.class);
                intent.putExtra("key","google");
                startActivity(intent);
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,GoogleWebVIew.class);
                intent.putExtra("key","facebook");
                startActivity(intent);
            }
        });

        du.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,GoogleWebVIew.class);
                intent.putExtra("key","du");
                startActivity(intent);
            }
        });

        geeks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,GoogleWebVIew.class);
                intent.putExtra("key","geeks");
                startActivity(intent);
            }
        });

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,GoogleWebVIew.class);
                intent.putExtra("key","youtube");
                startActivity(intent);
            }
        });


    }


    public void actionBar(){
        ActionBar actionBar = getSupportActionBar();

        // Set the title
        actionBar.setTitle("WEB VIEW APP");
        actionBar.setCustomView(R.layout.actionbarlogo);
        actionBar.setDisplayShowCustomEnabled(true);
    }



}