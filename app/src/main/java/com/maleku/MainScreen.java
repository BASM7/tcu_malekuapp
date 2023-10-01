package com.maleku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;

public class MainScreen extends AppCompatActivity {
    private MediaPlayer mediaplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);
        mediaplayer = MediaPlayer.create(this, R.raw.titulo);
//        mediaplayer.setVolume(0,0);
        mediaplayer.start();
    }

    public void sonido_titulo(View view){
        mediaplayer.setVolume(100,100);
        mediaplayer = MediaPlayer.create(this, R.raw.titulo);
        mediaplayer.start();
    }

    public void go_h0p1(View view){
        if (mediaplayer.isPlaying()) {
            mediaplayer.stop();
        }
        Intent a = new Intent(this, Chapter0Part1.class);
        startActivity(a);
    }

    public void go_h1p1(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        Intent b = new Intent(this, Chapter1Part1.class);
        startActivity(b);
    }

    public void go_h2p1(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        Intent c = new Intent(this, Chapter2Part1.class);
        startActivity(c);
    }

    public void go_h3p1(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        Intent c = new Intent(this, Chapter3Part1.class);
        startActivity(c);
    }

    public void go_h4p1(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        Intent c = new Intent(this, Chapter4Part1.class);
        startActivity(c);
    }

    public void go_h5p1(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        Intent c = new Intent(this, Chapter5Part1.class);
        startActivity(c);
    }

    public void go_h6p1(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        Intent c = new Intent(this, Chapter6Part1.class);
        startActivity(c);
    }
}