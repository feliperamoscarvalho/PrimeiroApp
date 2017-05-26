package pucminas.br.primeiroapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by Felipe on 26/05/2017.
 */

public class DebugCompat extends AppCompatActivity {

    protected static final String TAG = "CICLO";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, getClassName() + ".onCreate() chamado");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, getClassName() + ".onStart() chamado");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, getClassName() + ".onStop() chamado");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, getClassName() + ".onDestroy() chamado");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, getClassName() + ".onPause() chamado");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, getClassName() + ".onResume() chamado");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, getClassName() + ".onRestart() chamado");
    }

    private String getClassName() {
        String nome = getClass().getName().toString();
        return nome;
    }
}
