package com.maleku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;

public class Chapter1Part9 extends AppCompatActivity {
    private MediaPlayer mediaplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h1p9);
    }

    public void audio1(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag18_recuadrosuperior);
        mediaplayer.start();
    }

    public void audio2(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag18_segundorecuadro);
        mediaplayer.start();
    }

    public void audio3(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag18_globo);
        mediaplayer.start();
    }

    public void audio4(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag18_tercerrecuadro);
        mediaplayer.start();
    }

    public void goPrevious(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        Intent a = new Intent(this, Chapter1Part8.class);
        startActivity(a);
    }

    public void go_h1p10(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        Intent a = new Intent(this, Chapter1Part10.class);
        startActivity(a);
    }
}