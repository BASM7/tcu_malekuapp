package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter2Part8 extends MalekuCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h2p8);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter2Part8.class);
    }
    public void goNext(View view){
        switchActivity(this, Chapter2Part9.class);
    }
}