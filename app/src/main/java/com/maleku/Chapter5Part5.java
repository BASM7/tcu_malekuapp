package com.maleku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;

public class Chapter5Part5 extends AppCompatActivity {
    private MediaPlayer mediaplayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h5p5);
    }

    public void goPrevious(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        Intent a = new Intent(this, Chapter5Part4.class);
        startActivity(a);
    }

    public void go_h5p6(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        Intent a = new Intent(this, Chapter5Part6.class);
        startActivity(a);
    }

    public void audio1_1 (View view) {
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag56_globo_primeraparte);
        mediaplayer.start();
    }

    public void audio1_2 (View view) {
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag56_globo_segundaparte);
        mediaplayer.start();
    }
}