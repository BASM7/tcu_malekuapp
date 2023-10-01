package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter2Part6 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h2p6);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter2Part5.class);
    }
    public void goNext(View view){
        switchActivity(this, Chapter2Part7.class);
    }

    public void audio (View view) {
        play(R.raw.pag29_primerglobo);
    }

    public void audio2 (View view) {
        play(R.raw.pag29_segundoglobo);
    }
}