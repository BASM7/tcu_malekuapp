package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter0Part4 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h0p4);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter0Part3.class);
    }

    public void goMain(View view){
        switchActivity(this, AppMainScreen.class);
    }

    public void audio2(View view){
        play(R.raw.pag8recuadro);
    }

    public void audio1(View view){
        play(R.raw.pag8hablahombre);
    }
}