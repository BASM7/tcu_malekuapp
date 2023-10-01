package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter2Part9 extends MalekuCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h2p9);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter2Part8.class);
    }
    public void goNext(View view){
        switchActivity(this, Chapter2Part10.class);
    }

    public void audio1_1 (View view) {
        play(R.raw.pag32_primerglobo_primeraparte);
    }

    public void audio1_2 (View view) {
        play(R.raw.pag32_primerglobo_segundaparte);
    }

    public void audio1_3 (View view) {
        play(R.raw.pag32_primerglobo_terceraparte);
    }

    public void audio2_1 (View view) {
        play(R.raw.pag32_segundoglobo_primeraparte);
    }

    public void audio2_2 (View view) {
        play(R.raw.pag32_segundoglobo_segundaparte);
    }

    public void audio2_3 (View view) {
        play(R.raw.pag32_segundoglobo_terceraparte);
    }

    public void audio2_4 (View view) {
        play(R.raw.pag32_segundoglobo_cuartaparte);
    }
}