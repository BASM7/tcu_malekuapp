package com.maleku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Chapter1Part1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h1p1);
    }

    public void goPrevious(View view){
        Intent a = new Intent(this, AppMainScreen.class);
        startActivity(a);
    }

    public void go_h1p2(View view){
        Intent a = new Intent(this, Chapter1Part2.class);
        startActivity(a);
    }

}