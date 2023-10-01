package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter0Part3 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h0p3);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter0Part2.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter0Part4.class);
    }

    public void audio1(View view){
        play(R.raw.pag7recuadrosuperior);
    }

    public void audio2(View view){
        play(R.raw.pag7hablamujer);
    }
}