package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter3Part2 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h3p2);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter3Part1.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter3Part3.class);
    }

    public void audio1 (View view) {
        play(R.raw.pag40_recuadrosuperior);
    }

    public void audio2 (View view) {
        play(R.raw.pag40_primerglobo);
    }

    public void audio3 (View view) {
        play(R.raw.pag40_segundorecuadro_primeraparte);
    }

    public void audio3_2 (View view) {
        play(R.raw.pag40_segundorecuadro_segundaparte);
    }

    public void audio3_3 (View view) {
        play(R.raw.pag40_segundorecuadro_terceraparte);
    }

    public void audio4 (View view) {
        play(R.raw.pag40_segundoglobo);
    }
}