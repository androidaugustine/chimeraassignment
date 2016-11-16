package com.example.blackmonk.chimeraassignment;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

import javax.inject.Inject;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Inject
    Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        //textView = (TextView)findViewById(R.id.main_text);
        //webView = (WebView)findViewById(R.id.web_view);

        //RetroModule.builder().netModule(new RetroModule("http://www.google.com")).build().inject(this);
        DaggerRetroComponent.builder().retroModule(new RetroModule("http://airbnbapi.org/")).build().inject(this);

    }
}
