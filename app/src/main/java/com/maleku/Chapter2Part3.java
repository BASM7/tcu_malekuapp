package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter2Part3 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h2p3);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter2Part2.class);
    }
    public void goNext(View view){
        switchActivity(this, Chapter2Part4.class);
    }

    public void audio1 (View view) {
        play(R.raw.pag26_primerglobo_primeraparte);
    }

    public void audio1_5 (View view) {
        play(R.raw.pag26_primerglobo_segundaparte);
    }

    public void audio2 (View view) {
        play(R.raw.pag26_segundoglobo);
    }
}