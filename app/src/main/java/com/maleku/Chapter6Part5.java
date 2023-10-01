package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter6Part5 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h6p5);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter6Part4.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter6Part6.class);
    }

    public void audio1_1 (View view) {
        play(R.raw.pag62_recuadro_primeraparte);
    }

    public void audio1_2 (View view) {
        play(R.raw.pag62_recuadro_segundaparte);
    }

    public void audio2_1 (View view) {
        play(R.raw.pag62_globo_primeraparte);
    }

    public void audio2_2 (View view) {
        play(R.raw.pag62_globo_segundaparte);
    }
}