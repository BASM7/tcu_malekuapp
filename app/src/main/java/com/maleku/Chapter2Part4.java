package com.maleku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;

public class Chapter2Part4 extends AppCompatActivity {
    private MediaPlayer mediaplayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h2p4);
        mediaplayer = MediaPlayer.create(this, R.raw.titulo);
        mediaplayer.setVolume(0,0);
        mediaplayer.start();
    }

    public void goPrevious(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        Intent a = new Intent(this, Chapter2Part3.class);
        startActivity(a);
    }
    public void go_h2p5(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        Intent a = new Intent(this, Chapter2Part5.class);
        startActivity(a);
    }

    public void audio (View view) {
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag27_primerglobo);
        mediaplayer.start();
    }

    public void audio2 (View view) {
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag27_segundoglobo_primeraparte);
        mediaplayer.start();
    }

    public void audio2_5 (View view) {
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag27_segundoglobo_segundaparte);
        mediaplayer.start();
    }
}