package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter6Part3 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h6p3);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter6Part2.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter6Part4.class);
    }

    public void audio2_1 (View view) {
        play(R.raw.pag60_globo_primeraparte);
    }

    public void audio2_2 (View view) {
        play(R.raw.pag60_globo_segundaparte);
    }

    public void audio2_3 (View view) {
        play(R.raw.pag60_globo_terceraparte);
    }

    public void audio3_1 (View view) {
        play(R.raw.pag60_segundorecuadro_primeraparte);
    }

    public void audio3_2 (View view) {
        play(R.raw.pag60_segundorecuadro_segundaparte);
    }

    public void audio4_1 (View view) {
        play(R.raw.pag60_tercerrecuadro_primeraparte);
    }

    public void audio4_2 (View view) {
        play(R.raw.pag60_tercerrecuadro_segundaparte);
    }
}