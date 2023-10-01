package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter5Part6 extends MalekuCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h5p6);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter5Part5.class);
    }

    public void goMain(View view){
        switchActivity(this, AppMainScreen.class);
    }
}