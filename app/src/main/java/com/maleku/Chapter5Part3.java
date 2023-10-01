package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter5Part3 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h5p3);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter5Part2.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter5Part4.class);
    }

    public void audio1_1 (View view) {
        play(R.raw.pag54_primerrecuadro_primeraparte);
    }

    public void audio1_2 (View view) {
        play(R.raw.pag54_primerrecuadro_segundaparte);
    }

    public void audio1_3 (View view) {
        play(R.raw.pag54_primerrecuadro_terceraparte);
    }

    public void audio2_1 (View view) {
        play(R.raw.pag54_globo_primeraparte);
    }

    public void audio2_2 (View view) {
         play(R.raw.pag54_globo_segundaparte);
    }

    public void audio3 (View view) {
        play(R.raw.pag54_segundorecuadro);
    }

    public void audio4 (View view) {
        play(R.raw.pag54_tercerrecuadro);
    }
}