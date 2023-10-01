package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter2Part2 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h2p2);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter2Part1.class);
    }
    public void goNext(View view){
        switchActivity(this, Chapter2Part3.class);
    }

    public void audio (View view) {
        play(R.raw.pag25_globo);
    }
}