package com.maleku;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Chapter2Part6 extends AppCompatActivity {
    private MediaPlayer mediaplayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h2p6);
        mediaplayer = MediaPlayer.create(this, R.raw.titulo);
        mediaplayer.setVolume(0,0);
        mediaplayer.start();
    }

    public void goPrevious(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        Intent a = new Intent(this, Chapter2Part5.class);
        startActivity(a);
    }
    public void go_h2p7(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        Intent a = new Intent(this, Chapter2Part7.class);
        startActivity(a);
    }

    public void audio (View view) {
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag29_primerglobo);
        mediaplayer.start();
    }

    public void audio2 (View view) {
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag29_segundoglobo);
        mediaplayer.start();
    }
}