package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter4Part2 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h4p2);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter4Part1.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter4Part3.class);
    }

    public void audio (View view) {
        play(R.raw.pag47_primerrecuadro);
    }

    public void audio2 (View view) {
        play(R.raw.pag47_segundorecuadro);
    }

    public void audio3 (View view) {
        play(R.raw.pag47_tercerrecuadro);
    }

    public void audio4 (View view) {
        play(R.raw.pag47_globo);
    }
}