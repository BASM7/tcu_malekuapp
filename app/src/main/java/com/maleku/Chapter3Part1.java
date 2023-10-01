package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter3Part1 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h3p1);
    }

    public void goPrevious(View view){
        switchActivity(this, AppMainScreen.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter3Part2.class);
    }

    public void audio (View view) {
        play(R.raw.pag38_titulo);
    }
}