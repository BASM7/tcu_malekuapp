package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter1Part1 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h1p1);
    }

    public void goPrevious(View view){
        switchActivity(this, AppMainScreen.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter1Part2.class);
    }
}