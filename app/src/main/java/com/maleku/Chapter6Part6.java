package com.maleku;

import android.os.Bundle;
import android.view.View;

public class Chapter6Part6 extends MalekuCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h6p6);
    }

    public void goPrevious(View view){
        switchActivity(this, Chapter6Part5.class);
    }

    public void goNext(View view){
        switchActivity(this, Chapter6Part7.class);
    }

    public void audio (View view) {
        play(R.raw.pag63_recuadrosuperior);
    }

    public void audio2_1 (View view) {
        play(R.raw.pag63_globo_primeraparte);
    }

    public void audio2_2 (View view) {
        play(R.raw.pag63_globo_segundaparte);
    }

    public void audio3_1 (View view) {
        play(R.raw.pag63_recuadroinferior_primeraparte);
    }
    public void audio3_2 (View view) {
        play(R.raw.pag63_recuadroinferior_segundaparte);
    }
}