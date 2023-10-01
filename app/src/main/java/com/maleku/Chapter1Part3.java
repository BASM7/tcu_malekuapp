package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter1Part3 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h1p3);
    }

    public void audio1(View view){
        play(R.raw.pag12_recuadrosuperior);
    }

    public void audio2(View view){
        play(R.raw.pag12segundorecuadro);
    }

    public void audio3(View view){
        play(R.raw.pag12_hablalamujerconelsacoenlasmanos);
    }

    public void audio4(View view){
        play(R.raw.pag12_hablaelhombreconelcuchillo);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter1Part2.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter1Part4.class);
    }
}