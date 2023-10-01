package com.maleku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;

public class Chapter2Part11 extends AppCompatActivity {
    private MediaPlayer mediaplayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h2p11);
    }

    public void goPrevious(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        Intent a = new Intent(this, Chapter2Part10.class);
        startActivity(a);
    }

    public void go_h2p12(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        Intent a = new Intent(this, Chapter2Part12.class);
        startActivity(a);
    }

    public void audio (View view) {
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag34_primerglobo);
        mediaplayer.start();
    }

    public void audio2_1 (View view) {
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag34_segundoglobo_primeraparte);
        mediaplayer.start();
    }

    public void audio2_2 (View view) {
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag34_segundoglobo_segundaparte);
        mediaplayer.start();
    }
}