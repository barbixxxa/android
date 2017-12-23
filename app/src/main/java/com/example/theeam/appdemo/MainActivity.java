package com.example.theeam.appdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void loginClicked(android.view.View){
        EditText username = findViewById(R.id.username); //recebe o username
        EditText password = (EditText) findViewById(R.id.password); //recebe o password

        Log.i("username", username.getText().toString()); //printa no log o username
        Log.i("password", password.getText().toString()); //printa no log o password
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
