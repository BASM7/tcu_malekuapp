package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter3Part3 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h3p3);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter3Part2.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter3Part4.class);
    }

    public void audio (View view) {
        play(R.raw.pag41_globo);
    }

    public void audio2 (View view) {
        play(R.raw.pag41_recuadro);
    }
}