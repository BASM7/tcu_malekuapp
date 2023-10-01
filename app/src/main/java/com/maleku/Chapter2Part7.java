package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter2Part7 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h2p7);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter2Part6.class);
    }
    public void goNext(View view){
        switchActivity(this, Chapter2Part8.class);
    }

    public void audio (View view) {
        play(R.raw.pag30_primerglobo);
    }

    public void audio2_1 (View view) {
        play(R.raw.pag30_segundoglobo_primeraparte);
    }

    public void audio2_2 (View view) {
        play(R.raw.pag30_segundoglobo_segundaparte);
    }

    public void audio2_3 (View view) {
        play(R.raw.pag30_segundoglobo_terceraparte);
    }

    public void audio3 (View view) {
        play(R.raw.pag30_tercerglobo);
    }
}