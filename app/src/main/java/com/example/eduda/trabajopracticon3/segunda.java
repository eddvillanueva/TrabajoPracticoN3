package com.example.eduda.trabajopracticon3;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class segunda extends AppCompatActivity {

    private TextView txtSaludo;
    private Button btnMarcar;
    private EditText edtTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Bundle paramet  = getIntent().getExtras();
        String user = paramet.getString("PASA_NOMBRE");
        String passw = paramet.getString("PASA_PASSW");

        btnMarcar = (Button) findViewById(R.id.btnMarcar);
        edtTelefono = (EditText) findViewById(R.id.edtTelefono);
        txtSaludo = (TextView) findViewById(R.id.txtSaludo);
        txtSaludo.setText ("Bienvenido " + user);
    }


    public void marcarLlamada(View v) {
        String numero = edtTelefono.getText().toString();           // ACTION_CALL y uri, ver en espicifaciones de Android
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + numero));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

            // el if es para saber si esta la aplicacion disponble en el celular

            return;
        }
        startActivity(intent);

    }
    public void eventoFinalizar(View v){
        finish();
    }
    }
