package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter2Part13 extends MalekuCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h2p13);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter2Part12.class);
    }

    public void goMain(View view){
        switchActivity(this, AppMainScreen.class);
    }
}