package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter5Part5 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h5p5);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter5Part4.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter5Part6.class);
    }

    public void audio1_1 (View view) {
        play(R.raw.pag56_globo_primeraparte);
    }

    public void audio1_2 (View view) {
        play(R.raw.pag56_globo_segundaparte);
    }
}