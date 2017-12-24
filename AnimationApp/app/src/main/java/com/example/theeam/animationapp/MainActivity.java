package com.example.theeam.animationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View View){
        ImageView lula = findViewById(R.id.lulaImg);
        ImageView bolso = findViewById(R.id.bolsoImg);

        lula.animate().alpha(0f).setDuration(2500);
        bolso.animate().alpha(1f).setDuration(2500);

        if(lula.getAlpha() == 0f){
            lula.animate().alpha(1f).setDuration(2500);
            bolso.animate().alpha(0f).setDuration(2500);}

    }

    public void translation(View view){
        ImageView lula = findViewById(R.id.lulaImg);
        ImageView bolso = findViewById(R.id.bolsoImg);

        bolso.animate().alpha(1f).setDuration(1000);
        lula.animate().translationXBy(1000f).setDuration(1500);
        lula.animate().translationYBy(2000f).setDuration(2500);
        bolso.animate().translationXBy(-1000f).setDuration(5000);
    }

    public void rotation(View view){
        ImageView lula = findViewById(R.id.lulaImg);
        ImageView bolso = findViewById(R.id.bolsoImg);

        lula.animate().rotation(180f).setDuration(2500);
    }

    public void scale(View view){
        ImageView lula = findViewById(R.id.lulaImg);
        ImageView bolso = findViewById(R.id.bolsoImg);

        lula.animate().scaleX(0.5f).scaleY(0.5f).setDuration(1500);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView lula = findViewById(R.id.lulaImg);
        lula.setTranslationX(-1000f);
    }
}
