package com.maleku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;

public class Chapter1Part5 extends AppCompatActivity {
    private MediaPlayer mediaplayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h1p5);
        mediaplayer = MediaPlayer.create(this, R.raw.titulo);
        mediaplayer.setVolume(0,0);
        mediaplayer.setLooping(true);
        mediaplayer.start();
    }

    public void audio1(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag14_recuadro_superior_primeraparte);
        mediaplayer.start();
    }

    public void audio1_5(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag14_recuadrosuperior_segundaparte);
        mediaplayer.start();
    }

    public void audio2(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag14_primer_globo);
        mediaplayer.start();
    }

    public void audio3(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag14_segundo_globo);
        mediaplayer.start();
    }

    public void audio4(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag14_segundorecuadro);
        mediaplayer.start();
    }

    public void goPrevious(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        Intent a = new Intent(this, Chapter1Part4.class);
        startActivity(a);
    }

    public void go_h1p6(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        Intent a = new Intent(this, Chapter1Part6.class);
        startActivity(a);
    }
}