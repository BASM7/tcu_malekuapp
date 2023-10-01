package com.maleku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Chapter2Part8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h2p8);
    }

    public void goPrevious(View view){
        Intent a = new Intent(this, Chapter2Part8.class);
        startActivity(a);
    }
    public void go_h2p9(View view){
        Intent a = new Intent(this, Chapter2Part9.class);
        startActivity(a);
    }
}