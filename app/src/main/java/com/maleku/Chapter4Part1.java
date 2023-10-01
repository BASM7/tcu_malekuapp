package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter4Part1 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h4p1);
    }

    public void goPrevious(View view){
        switchActivity(this, AppMainScreen.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter4Part2.class);
    }

    public void audio (View view) {
        play(R.raw.pag46_titulo);
    }
}