package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter1Part4 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h1p4);
    }

    public void audio1(View view){
        play(R.raw.pag13_recuadro);
    }

    public void audio2(View view){
        play(R.raw.pag13_primerglobo);
    }

    public void audio3(View view){
        play(R.raw.pag13_segundoglobo);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter1Part3.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter1Part5.class);
    }
}