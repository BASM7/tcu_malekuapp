package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter4Part3 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h4p3);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter4Part2.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter4Part4.class);
    }

    public void audio1 (View view) {
        play(R.raw.pag48_primerrecuadro_primeraparte);
    }

    public void audio1_2 (View view) {
        play(R.raw.pag48_primerrecuadro_segundaparte);
    }

    public void audio2_1 (View view) {
        play(R.raw.pag48_primerglobo);
    }

    public void audio3_1 (View view) {
        play(R.raw.pag48_segundorecuadro);
    }

    public void audio4_1 (View view) {
        play(R.raw.pag48_segundoglobo_primeraparte);
    }

    public void audio4_2 (View view) {
        play(R.raw.pag48_segundoglobo_segundaparte);
    }
}