package pucminas.br.primeiroapp.exemplo0;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import pucminas.br.primeiroapp.DebugCompat;
import pucminas.br.primeiroapp.R;

public class PrimeiraTelaActivity extends DebugCompat {

    EditText edtParametroSegundaTela;
    Button btnSegundaTela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira_tela);

        edtParametroSegundaTela = (EditText) findViewById(R.id.edtParametroSegundaTela);
        btnSegundaTela = (Button) findViewById(R.id.btnSegundaTela);


        btnSegundaTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor = edtParametroSegundaTela.getText().toString();
                Intent it = new Intent(view.getContext(), SegundaTelaActivity.class);
                it.putExtra("PARAM", valor);
                startActivity(it);
            }
        });
    }
}
