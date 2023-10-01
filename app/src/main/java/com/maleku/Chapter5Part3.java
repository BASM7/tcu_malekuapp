package com.maleku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;

public class Chapter5Part3 extends AppCompatActivity {
    private MediaPlayer mediaplayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h5p3);
        mediaplayer = MediaPlayer.create(this, R.raw.titulo);
        mediaplayer.setVolume(0,0);
        mediaplayer.start();

    }

    public void goPrevious(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        Intent a = new Intent(this, Chapter5Part2.class);
        startActivity(a);
    }

    public void go_h5p4(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        Intent a = new Intent(this, Chapter5Part4.class);
        startActivity(a);
    }

    public void audio1_1 (View view) {
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag54_primerrecuadro_primeraparte);
        mediaplayer.start();
    }

    public void audio1_2 (View view) {
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag54_primerrecuadro_segundaparte);
        mediaplayer.start();
    }

    public void audio1_3 (View view) {
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag54_primerrecuadro_terceraparte);
        mediaplayer.start();
    }

    public void audio2_1 (View view) {
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag54_globo_primeraparte);
        mediaplayer.start();
    }

    public void audio2_2 (View view) {
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag54_globo_segundaparte);
        mediaplayer.start();
    }

    public void audio3 (View view) {
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag54_segundorecuadro);
        mediaplayer.start();
    }

    public void audio4 (View view) {
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag54_tercerrecuadro);
        mediaplayer.start();
    }
}