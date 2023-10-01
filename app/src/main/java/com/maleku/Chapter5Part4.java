package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter5Part4 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h5p4);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter5Part3.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter5Part5.class);
    }

    public void audio1_1 (View view) {
        play(R.raw.pag55_primerglobo_primeraparte);
    }

    public void audio1_2 (View view) {
        play(R.raw.pag55_primerglobo_segundaparte);
    }

    public void audio2_1 (View view) {
        play(R.raw.pag55_segundoglobo_primeraparte);
    }

    public void audio2_2 (View view) {
        play(R.raw.pag55_segundoglobo_segundaparte);
    }
}