package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter2Part12 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h2p12);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter2Part11.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter2Part13.class);
    }

    public void audio1 (View view) {
        play(R.raw.pag35_recuadro_primeraparte);
    }

    public void audio1_2 (View view) {
        play(R.raw.pag35_recuadro_segundaparte);
    }

    public void audio1_3 (View view) {
        play(R.raw.pag35_recuadro_terceraparte);
    }

    public void audio2 (View view) {
        play(R.raw.pag35_globo_primeraparte);
    }

    public void audio2_2 (View view) {
        play(R.raw.pag35_globo_segundaparte);
    }
}