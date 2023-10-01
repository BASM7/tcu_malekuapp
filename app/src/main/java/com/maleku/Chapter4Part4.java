package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter4Part4 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h4p4);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter4Part3.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter4Part5.class);
    }

    public void audio1_1 (View view) {
        play(R.raw.pag49_primerrecuadro_primeraparte);
    }

    public void audio1_2 (View view) {
        play(R.raw.pag49_primerrecuadro_segundaparte);
    }

    public void audio2 (View view) {
        play(R.raw.pag49_globo);
    }

    public void audio3 (View view) {
        play(R.raw.pag49_segundorecuadro);
    }
}