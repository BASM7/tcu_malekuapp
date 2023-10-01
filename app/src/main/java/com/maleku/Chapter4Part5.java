package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter4Part5 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h4p5);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter4Part4.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter4Part6.class);
    }

    public void audio1 (View view) {
        play(R.raw.pag50_recuadrosuperior);
    }

    public void audio2 (View view) {
        play(R.raw.pag50_primerglobo);
    }

    public void audio3_1 (View view) {
        play(R.raw.pag50_segundoglobo_primeraparte);
    }

    public void audio3_2 (View view) {
        play(R.raw.pag50_segundoglobo_segundaparte);
    }

    public void audio4 (View view) {
        play(R.raw.pag50_recuadroinferior);
    }
}