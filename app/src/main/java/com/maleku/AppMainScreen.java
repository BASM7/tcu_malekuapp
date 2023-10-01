package com.maleku;

import android.os.Bundle;
import android.view.View;

public class AppMainScreen extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);
    }

    public void playTitle(View view){
        play(R.raw.titulo);
    }

    public void goChapter0Part1(View view){
        switchActivity(this, Chapter0Part1.class);
    }

    public void goChapter1Part1(View view){
        switchActivity(this, Chapter1Part1.class);
    }

    public void goChapter2Part1(View view){
        switchActivity(this, Chapter2Part1.class);
    }

    public void goChapter3Part1(View view){
        switchActivity(this, Chapter3Part1.class);
    }

    public void goChapter4Part1(View view){
        switchActivity(this, Chapter4Part1.class);
    }

    public void goChapter5Part1(View view){
        switchActivity(this, Chapter5Part1.class);
    }

    public void goChapter6Part1(View view){
        switchActivity(this, Chapter6Part1.class);
    }
}