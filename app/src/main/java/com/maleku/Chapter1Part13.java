package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter1Part13 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h1p13);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter1Part12.class);
    }

    public void goMain(View view){
        switchActivity(this, AppMainScreen.class);
    }

    public void audio1(View view){
        play(R.raw.pag22_recuadro_primeraparte);
    }

    public void audio2(View view){
        play(R.raw.pag22_recuadro_segundaparte);
    }
}