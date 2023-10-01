package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter0Part1 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h0p1);
    }

    public void goPrevious(View view){
        this.switchActivity(this, AppMainScreen.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter0Part2.class);
    }

    public void audio1 (View view) {
        play(R.raw.pag5primeraparte);
    }

    public void audio2(View view) {
        play(R.raw.pag5segundaparte);
    }
}