package com.maleku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Chapter2Part13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h2p13);
    }

    public void goPrevious(View view){
        Intent a = new Intent(this, Chapter2Part12.class);
        startActivity(a);
    }

    public void go_main(View view){
        Intent a = new Intent(this, AppMainScreen.class);
        startActivity(a);
    }
}