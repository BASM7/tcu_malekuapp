package com.maleku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;

public class Chapter0Part1 extends MalekuCompatActivity {
    private MediaPlayer mediaplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h0p1);
    }

    public void goChapter0Part2(View view){
        if (mediaplayer.isPlaying()){
            mediaplayer.stop();
        }
        Intent a = new Intent(this, Chapter0Part2.class);
        startActivity(a);
    }

    public void goPrevious(View view){
        this.switchActivity(this, AppMainScreen.class);
    }

    public void audio1 (View view) {
        if (mediaplayer != null && mediaplayer.isPlaying()){
            mediaplayer.stop();
        }

        mediaplayer = MediaPlayer.create(this,
                this.getUriFromFile(R.raw.pag5primeraparte));
        mediaplayer.start();
    }

    public void audio2(View view) {
        if (mediaplayer != null && mediaplayer.isPlaying()){
            mediaplayer.stop();
        }

        mediaplayer = MediaPlayer.create(this,
                this.getUriFromFile(R.raw.pag5segundaparte));
        mediaplayer.start();
    }
}