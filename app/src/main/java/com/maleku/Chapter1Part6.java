package com.maleku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;

public class Chapter1Part6 extends AppCompatActivity {
    private MediaPlayer mediaplayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h1p6);
    }

    public void audio1(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag15_primerglobo);
        mediaplayer.start();
    }
    public void audio2(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag15_primerrecuadro);
        mediaplayer.start();
    }
    public void audio3(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag15_segundoglobo);
        mediaplayer.start();
    }
    public void audio4(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag15_segundorecuadro);
        mediaplayer.start();
    }

    public void goPrevious(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        Intent a = new Intent(this, Chapter1Part5.class);
        startActivity(a);
    }

    public void go_h1p7(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        Intent a = new Intent(this, Chapter1Part7.class);
        startActivity(a);
    }
}