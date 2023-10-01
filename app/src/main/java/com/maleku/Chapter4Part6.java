package com.maleku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Chapter4Part6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h4p6);
    }

    public void goPrevious(View view){
        Intent a = new Intent(this, Chapter4Part5.class);
        startActivity(a);
    }

    public void go_main(View view){
        Intent a = new Intent(this, MainScreen.class);
        startActivity(a);
    }
}