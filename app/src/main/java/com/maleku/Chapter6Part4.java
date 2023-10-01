package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter6Part4 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h6p4);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter6Part3.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter6Part5.class);
    }

    public void audio (View view) {
        play(R.raw.pag61_primerrecuadro);
    }

    public void audio2 (View view) {
        play(R.raw.pag61_segundorecuadro);
    }
}