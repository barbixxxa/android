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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
