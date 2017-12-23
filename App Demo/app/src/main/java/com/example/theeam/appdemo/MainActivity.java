package com.example.theeam.appdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void loginClicked(View view){
        EditText username = findViewById(R.id.username); //recebe o username
        EditText password = findViewById(R.id.password); //recebe o password

        Log.i("username", username.getText().toString()); //printa no log o username
        Log.i("password", password.getText().toString()); //printa no log o password

        ImageView profilePic = findViewById(R.id.profilePic);
        profilePic.setImageResource(R.drawable.t1);

        Toast.makeText(this, "Welcome, " + username.getText().toString(), Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
