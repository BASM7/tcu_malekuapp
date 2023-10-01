package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter2Part5 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h2p5);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter2Part4.class);
    }
    public void goNext(View view){
        switchActivity(this, Chapter2Part6.class);
    }

    public void audio (View view) {
        play(R.raw.pag28_primerglobo);
    }

    public void audio2 (View view) {
        play(R.raw.pag28_segundoglobo);
    }

    public void audio3 (View view) {
        play(R.raw.pag28_tercerglobo);
    }
}