package pucminas.br.primeiroapp.exemplo1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import pucminas.br.primeiroapp.R;

public class CalculadoraActivity extends AppCompatActivity {

    LinearLayout linearPrincipal;
    LinearLayout linearResultado;
    EditText edtPrimeiroNumero;
    EditText edtSegundoNumero;
    TextView txtResultado;
    Button btnSoma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        linearPrincipal = (LinearLayout) findViewById(R.id.linearPrincipal);
        linearResultado = (LinearLayout) findViewById(R.id.linearResultado);
        edtPrimeiroNumero = (EditText) findViewById(R.id.edtPrimeiroNumero);
        edtSegundoNumero = (EditText) findViewById(R.id.edtSegundoNumero);
        txtResultado = (TextView) findViewById(R.id.txtSoma);
        btnSoma = (Button) findViewById(R.id.btnSomar);

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                somar();
            }
        });
    }

    private void somar() {
        String numero1 = edtPrimeiroNumero.getText().toString();
        String numero2 = edtSegundoNumero.getText().toString();

        if(!numero1.isEmpty() && !numero2.isEmpty()){
            linearResultado.setVisibility(View.VISIBLE);
            int soma = Integer.parseInt(numero1) + Integer.parseInt(numero2);
            txtResultado.setText(String.valueOf(soma));

        }
    }
}
