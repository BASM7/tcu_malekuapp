package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter1Part5 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h1p5);
    }

    public void audio1(View view){
        play(R.raw.pag14_recuadro_superior_primeraparte);
    }

    public void audio1_5(View view){
        play(R.raw.pag14_recuadrosuperior_segundaparte);
    }

    public void audio2(View view){
        play(R.raw.pag14_primer_globo);
    }

    public void audio3(View view){
        play(R.raw.pag14_segundo_globo);
    }

    public void audio4(View view){
        play(R.raw.pag14_segundorecuadro);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter1Part4.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter1Part6.class);
    }
}