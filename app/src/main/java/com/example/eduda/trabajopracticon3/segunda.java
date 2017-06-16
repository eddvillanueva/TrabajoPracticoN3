package com.example.eduda.trabajopracticon3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class segunda extends AppCompatActivity {

    private TextView txtSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

   //  Bundle paramet extras = getIntent().getExtras();
   //  String user = paramet.getString("PASA_NOMBRE");
   //  String passw = paramet.getString("PASA_PASSW");

        txtSaludo = (TextView) findViewById(R.id.txtSaludo);
   //     txtSaludo.setText ("Bienvenido" + user);
    }


    }
