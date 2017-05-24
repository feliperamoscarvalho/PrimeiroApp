package pucminas.br.primeiroapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static pucminas.br.primeiroapp.R.id.btnExemplo1;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnExemplo0 = (Button) findViewById(R.id.btnExemplo0);
        /*btnExemplo0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                facaAlgo("Mensagem do botão Exemplo 0");
            }
        });*/
        btnExemplo0.setOnClickListener(this);
        Button btnExemplo1 = (Button) findViewById(R.id.btnExemplo1);
        btnExemplo1.setOnClickListener(this);
    }

    private void facaAlgo(String texto){
        Toast.makeText(this, texto, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnExemplo0){
            facaAlgo("Clicou no Exemplo 0");
        }else if(view.getId() == btnExemplo1){
            facaAlgo("Clicou no Exemplo 1");
        }
    }

    public void facaAlgoExemplo2 (View view){
        facaAlgo("Clicou no Exemplo 2");
    }
}
