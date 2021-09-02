package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class Potato4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potato4);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        WebView browser = (WebView) findViewById(R.id.webview);
        getLifecycle().addObserver(youTubePlayerView);
        browser.loadUrl("https://hindi.lifeberrys.com/hunger-struck/special-recipe-of-tangy-mint-potato-in-hindi-150511.html");
    }
}