package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter3Part4 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h3p4);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter3Part3.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter3Part5.class);
    }

    public void audio (View view) {
        play(R.raw.pag42_primerrecuadro);
    }

    public void audio2 (View view) {
        play(R.raw.pag42_segundorecuadro);
    }

    public void audio3 (View view) {
        play(R.raw.pag42_primerglobo);
    }

    public void audio4 (View view) {
        play(R.raw.pag42_segundoglobo);
    }

    public void audio5 (View view) {
        play(R.raw.pag42_tercerglobo);
    }

    public void audio6 (View view) {
        play(R.raw.pag42_cuartoglobo);
    }
}