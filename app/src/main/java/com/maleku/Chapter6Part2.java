package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter6Part2 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h6p2);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter6Part1.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter6Part3.class);
    }

    public void audio1_1 (View view) {
        play(R.raw.pag59_recuadro_primeraparte);
    }

    public void audio1_2 (View view) {
        play(R.raw.pag59_recuadro_segundaparte);
    }

    public void audio1_3 (View view) {
        play(R.raw.pag59_recuadro_terceraparte);
    }
    public void audio1_4 (View view) {
        play(R.raw.pag59_recuadro_cuartaparte);
    }
    public void audio2 (View view) {
        play(R.raw.pag59_globo);
    }

}