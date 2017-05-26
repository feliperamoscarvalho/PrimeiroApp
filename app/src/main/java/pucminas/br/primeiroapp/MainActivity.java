package pucminas.br.primeiroapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import pucminas.br.primeiroapp.exemplo0.PrimeiraTelaActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnExemplo0 = (Button) findViewById(R.id.btnExemplo0);
        btnExemplo0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(view.getContext(), PrimeiraTelaActivity.class);
                startActivity(it);
            }
        });
    }

    private void facaAlgo(String texto){
        Toast.makeText(this, texto, Toast.LENGTH_SHORT).show();
    }

}
