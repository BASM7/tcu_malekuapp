package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter1Part10 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h1p10);
    }

    public void audio1(View view){
        play(R.raw.pag19_recuadro_superior_primeraparte);
    }

    public void audio2(View view){
        play(R.raw.pag19_recuadro_superior_segundaparte);
    }

    public void audio3(View view){
        play(R.raw.pag19_recuadro_inferior);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter1Part9.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter1Part11.class);
    }
}