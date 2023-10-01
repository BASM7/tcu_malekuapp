package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter3Part6 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h3p6);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter3Part5.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter3Part7.class);
    }

    public void audio1 (View view) {
        play(R.raw.pag44_primerrecuadro);
    }

    public void audio2_1 (View view) {
        play(R.raw.pag44_segundorecuadro_primeraparte);
    }

    public void audio2_2 (View view) {
        play(R.raw.pag44_segundorecuadro_segundaparte);
    }

    public void audio2_3 (View view) {
        play(R.raw.pag44_segundorecuadro_terceraparte);
    }

    public void audio3 (View view) {
        play(R.raw.pag44_tercerrecuadro);
    }
}