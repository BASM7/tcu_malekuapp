package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter2Part11 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h2p11);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter2Part10.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter2Part12.class);
    }

    public void audio (View view) {
        play(R.raw.pag34_primerglobo);
    }

    public void audio2_1 (View view) {
        play(R.raw.pag34_segundoglobo_primeraparte);
    }

    public void audio2_2 (View view) {
        play(R.raw.pag34_segundoglobo_segundaparte);
    }
}