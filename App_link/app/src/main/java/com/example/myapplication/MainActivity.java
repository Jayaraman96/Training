package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to handle app links.
        Intent appLinkIntent = getIntent();
        String appLinkAction = appLinkIntent.getAction();
        Uri appLinkData = appLinkIntent.getData();

        if(appLinkData != null){
            String string = String.valueOf(appLinkData.getPath());
            String[] parts = string.split("/");

            if("movie".equals(parts[2])){
                Intent i = new Intent(this, Movie.class);
                startActivity(i);
            }else if("tv_show".equals(parts[2])){
                Intent i = new Intent(this, TvShows.class);
                startActivity(i);
            }
        }


    }
}