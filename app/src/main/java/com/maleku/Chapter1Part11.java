package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter1Part11 extends MalekuCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h1p11);
    }


    public void audio1(View view){
        play(R.raw.pag20_primerrecuadro_primeraparte);
    }

    public void audio1_5(View view){
        play(R.raw.pag20_primerrecuadro_segundaparte);
    }

    public void audio2(View view){
        play(R.raw.pag20_segundorecuadro_primeraparte);
    }

    public void audio2_5(View view){
        play(R.raw.pag20_segundorecuadro_segundaparte);
    }

    public void audio3(View view){
        play(R.raw.pag20_tercerrecuadro);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter1Part10.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter1Part12.class);
    }
}