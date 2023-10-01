package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter0Part2 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h0p2);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter0Part1.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter0Part3.class);
    }

    public void audio (View view) {
        play(R.raw.pag6);
    }
}