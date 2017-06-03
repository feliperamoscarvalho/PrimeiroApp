package pucminas.br.primeiroapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import pucminas.br.primeiroapp.exemplo0.PrimeiraTelaActivity;
import pucminas.br.primeiroapp.exemplo1.CalculadoraActivity;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnExemplo0 = (Button) findViewById(R.id.btnExemplo0);
        btnExemplo0.setOnClickListener(this);

        Button btnExemplo1 = (Button) findViewById(R.id.btnExemplo1);
        btnExemplo1.setOnClickListener(this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private void facaAlgo(String texto) {
        Toast.makeText(this, texto, Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.btnExemplo0)
            chamaPrimeiraTela();
        if (view.getId()==R.id.btnExemplo1)
            chamaExemploCalculadora();

    }

    private void chamaPrimeiraTela() {
        Intent it = new Intent(this, PrimeiraTelaActivity.class);
        startActivity(it);
    }

    private void chamaExemploCalculadora() {
        Intent it = new Intent(this, CalculadoraActivity.class);
        startActivity(it);
    }


}