package com.maleku;

import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;

public class Chapter0Part1 extends AppCompatActivity {
    private MediaPlayer mediaplayer;
    private Uri titleSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h0p1);

        titleSound = Uri.parse(
                ContentResolver.SCHEME_ANDROID_RESOURCE + "://" +
                        getApplication().getApplicationContext().getPackageName() + "/" +
                        R.raw.titulo);

        mediaplayer = MediaPlayer.create(this, titleSound);
        mediaplayer.setVolume(0,0);
        mediaplayer.start();
    }

    public void go_h0p2(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        Intent a = new Intent(this, Chapter0Part2.class);
        startActivity(a);
    }

    public void goPrevious(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        Intent a = new Intent(this, MainScreen.class);
        startActivity(a);
    }

    public void audio1 (View view) {
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag5primeraparte);
        mediaplayer.start();
    }

    public void audio2(View view) {
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        mediaplayer = MediaPlayer.create(this, R.raw.pag5segundaparte);
        mediaplayer.start();
    }
}