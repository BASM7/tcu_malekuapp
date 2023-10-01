package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter2Part1 extends MalekuCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h2p1);
    }

    public void goPrevious(View view){
        switchActivity(this, AppMainScreen.class);
    }
    public void goNext(View view){
        switchActivity(this, Chapter2Part2.class);
    }
}