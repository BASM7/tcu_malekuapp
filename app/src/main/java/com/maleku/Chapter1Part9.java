package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter1Part9 extends MalekuCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h1p9);
    }

    public void audio1(View view){
        play(R.raw.pag18_recuadrosuperior);
    }

    public void audio2(View view){
        play(R.raw.pag18_segundorecuadro);
    }

    public void audio3(View view){
        play(R.raw.pag18_globo);
    }

    public void audio4(View view){
        play(R.raw.pag18_tercerrecuadro);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter1Part8.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter1Part10.class);
    }
}