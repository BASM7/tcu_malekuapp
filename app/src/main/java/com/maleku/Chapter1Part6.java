package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter1Part6 extends MalekuCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h1p6);
    }

    public void audio1(View view){
        play(R.raw.pag15_primerglobo);
    }
    public void audio2(View view){
        play(R.raw.pag15_primerrecuadro);
    }
    public void audio3(View view){
        play(R.raw.pag15_segundoglobo);
    }
    public void audio4(View view){
        play(R.raw.pag15_segundorecuadro);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter1Part5.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter1Part7.class);
    }
}