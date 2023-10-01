package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter1Part12 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h1p12);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter1Part11.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter1Part13.class);
    }

    public void audio1(View view){
        play(R.raw.pag21_recuadro_);
    }
}