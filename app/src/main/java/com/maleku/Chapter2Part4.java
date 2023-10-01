package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter2Part4 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h2p4);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter2Part3.class);
    }
    public void goNext(View view){
        switchActivity(this, Chapter2Part5.class);
    }

    public void audio (View view) {
        play(R.raw.pag27_primerglobo);
    }

    public void audio2 (View view) {
        play(R.raw.pag27_segundoglobo_primeraparte);
    }

    public void audio2_5 (View view) {
        play(R.raw.pag27_segundoglobo_segundaparte);
    }
}