package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter5Part2 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h5p2);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter5Part1.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter5Part3.class);
    }

    public void audio (View view) {
        play(R.raw.pag53_recuadrosuperior_primeraparte);
    }

    public void audio2 (View view) {
        play(R.raw.pag53_primerglobo);
    }

    public void audio3 (View view) {
        play(R.raw.pag53_segundorecuadro);
    }

    public void audio4 (View view) {
        play(R.raw.pag53_tercerrecuadro);
    }

    public void audio5_1 (View view) {
        play(R.raw.pag53_segundoglobo_primeraparte);
    }

    public void audio5_2 (View view) {
        play(R.raw.pag53_segundoglobo_segundaparte);
    }
}