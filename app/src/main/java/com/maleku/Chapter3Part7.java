package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter3Part7 extends MalekuCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h3p7);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter3Part6.class);
    }

    public void goMain(View view){
        switchActivity(this, AppMainScreen.class);
    }
}