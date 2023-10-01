package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter1Part7 extends MalekuCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h1p7);
    }

    public void audio1(View view){
        play(R.raw.pag16_primerrecuadro);
    }

    public void audio2(View view){
        play(R.raw.pag16_segundorecuadro);
    }

    public void audio3(View view){
        play(R.raw.pag16_tercerrecuadro);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter1Part6.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter1Part8.class);
    }
}