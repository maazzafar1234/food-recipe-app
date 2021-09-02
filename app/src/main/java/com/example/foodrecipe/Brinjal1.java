package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class Brinjal1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brinjal1);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        WebView browser = (WebView) findViewById(R.id.webview);
        getLifecycle().addObserver(youTubePlayerView);
        browser.loadUrl("https://www.archanaskitchen.com/baingan-masala-recipe-in-hindi");
    }
}