package pucminas.br.primeiroapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import pucminas.br.primeiroapp.exemplo0.PrimeiraTelaActivity;
import pucminas.br.primeiroapp.exemplo1.CalculadoraActivity;

public class MainActivity extends AppCompatActivity {

    private ListView listViewExemplos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewExemplos = (ListView)findViewById(R.id.listMenu);
        String[] arrayItens = getResources().getStringArray(R.array.lista_exemplos);

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayItens);
        listViewExemplos.setAdapter(itemsAdapter);

        listViewExemplos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                switch (position){
                    case 0:
                        chamaPrimeiraTela();
                        break;
                    case 1:
                        chamaExemploCalculadora();
                        break;
                    case 2:
                        //trocar pra chamada do exemplo de layoutInflater
                        chamaPrimeiraTela();
                        break;

                }
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private void facaAlgo(String texto) {
        Toast.makeText(this, texto, Toast.LENGTH_SHORT).show();
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