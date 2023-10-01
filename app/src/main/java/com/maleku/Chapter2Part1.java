package com.maleku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Chapter2Part1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h2p1);
    }

    public void goPrevious(View view){
        Intent a = new Intent(this, MainScreen.class);
        startActivity(a);
    }
    public void go_h2p2(View view){
        Intent a = new Intent(this, Chapter2Part2.class);
        startActivity(a);
    }
}