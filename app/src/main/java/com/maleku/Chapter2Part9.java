package com.maleku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;

public class Chapter2Part9 extends AppCompatActivity {
    private MediaPlayer mediaplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h2p9);
    }

    public void goPrevious(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        Intent a = new Intent(this, Chapter2Part8.class);
        startActivity(a);
    }
    public void go_h2p10(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        Intent a = new Intent(this, Chapter2Part10.class);
        startActivity(a);
    }

    public void audio1_1 (View view) {
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag32_primerglobo_primeraparte);
        mediaplayer.start();
    }

    public void audio1_2 (View view) {
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag32_primerglobo_segundaparte);
        mediaplayer.start();
    }

    public void audio1_3 (View view) {
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag32_primerglobo_terceraparte);
        mediaplayer.start();
    }

    public void audio2_1 (View view) {
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag32_segundoglobo_primeraparte);
        mediaplayer.start();
    }

    public void audio2_2 (View view) {
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag32_segundoglobo_segundaparte);
        mediaplayer.start();
    }

    public void audio2_3 (View view) {
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag32_segundoglobo_terceraparte);
        mediaplayer.start();
    }

    public void audio2_4 (View view) {
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag32_segundoglobo_cuartaparte);
        mediaplayer.start();
    }
}