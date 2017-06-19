package com.example.eduda.trabajopracticon3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtNombre;
    EditText edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNombre = (EditText) findViewById(R.id.editText2);
        edtPassword = (EditText) findViewById(R.id.editText4);
    }


     public  void validarLogin (View v) {

        String nombre = edtNombre.getText().toString();
        String clave = edtPassword.getText().toString();
         if((nombre.equals("ites") && clave.equals("1234")))

         abrirActividad();

        else

        Toast.makeText(this, "Datos Incorrectos", Toast.LENGTH_SHORT).show();

         edtNombre.setText(" ");  // PARA VACIAR
         edtPassword.setText("");
    }


    public void abrirActividad()
    {
        String nombre = edtNombre.getText().toString();
        String password = edtPassword.getText().toString();

        Intent i = new Intent(this,segunda.class);
        i.putExtra ("PASA_NOMBRE",nombre);
        i.putExtra ("PASA_PASSW",password);

        startActivity(i);
    }
}
