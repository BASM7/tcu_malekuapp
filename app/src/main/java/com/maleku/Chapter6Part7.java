package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter6Part7 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h6p7);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter6Part6.class);
    }

    public void goMain(View view){
        switchActivity(this, AppMainScreen.class);
    }

    public void audio (View view) {
        play(R.raw.pag64_recuadro);
    }
}