package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter1Part2 extends MalekuCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h1p2);
    }

    public void audio1(View view){
        play(R.raw.pag11_recuadrosuperior);
    }

    public void audio2(View view){
        play(R.raw.pag11_hablaelhombre);
    }

    public void audio3(View view){
        play(R.raw.pag11_recuadroinferior);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter1Part1.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter1Part3.class);
    }
}