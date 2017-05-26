package pucminas.br.primeiroapp.exemplo0;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import pucminas.br.primeiroapp.DebugCompat;
import pucminas.br.primeiroapp.R;

public class SegundaTelaActivity extends DebugCompat {

    TextView txtParametroRecebido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        txtParametroRecebido = (TextView) findViewById(R.id.txtParametroRecebido);

        Intent it = getIntent();
        String valor = it.getStringExtra("PARAM");

        txtParametroRecebido.setText(valor);
    }
}
