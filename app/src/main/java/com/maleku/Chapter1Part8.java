package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter1Part8 extends MalekuCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h1p8);
    }

    public void audio1(View view){
        play(R.raw.pag17_recuadrosuperior_primeraparte);
    }

    public void audio1_5(View view){
        play(R.raw.pag17_recuadrosuperior_segundaparte);
    }
    public void audio2(View view){
        play(R.raw.pag17_primerglobo);
    }

    public void audio3(View view){
        play(R.raw.pag17_segundoglobo);
    }

    public void audio4(View view){
        play(R.raw.pag17_tercerglobo);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter1Part7.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter1Part9.class);
    }
}