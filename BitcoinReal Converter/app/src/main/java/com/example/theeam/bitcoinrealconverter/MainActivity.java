package com.example.theeam.bitcoinrealconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText amountR$ = findViewById(R.id.amount); //recebe o valor inserido pelo user
        Double amountRs = Double.parseDouble(amountR$.getText().toString()); //transforma o valor em double
        Double cotacaoBTC = 57070.71; //valor da cotacao atual do BTC em R$
        Double btc = amountRs / cotacaoBTC; //multiplica o valor do BTC pelo valor em R$ para retornar a qtd de BTC correspondente ao valor em R$ inserido
        Toast.makeText(this, "Amount in BTC: " + String.format("%.8f", btc), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
