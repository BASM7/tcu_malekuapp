package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter2Part10 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h2p10);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter2Part9.class);
    }
    public void goNext(View view){
        switchActivity(this, Chapter2Part11.class);
    }

    public void audio1_1 (View view) {
        play(R.raw.pag33_primerglobo_primeraparte);
    }

    public void audio1_2 (View view) {
        play(R.raw.pag33_primerglobo_segundaparte);
    }

    public void audio2 (View view) {
        play(R.raw.pag33_segundoglobo);
    }
}