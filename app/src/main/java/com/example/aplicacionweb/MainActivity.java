package com.example.aplicacionweb;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button(View view) {
        String genero;
        EditText txtNombre = (EditText)findViewById(R.id.editTextText);
        EditText txtApellido = (EditText)findViewById(R.id.editTextText3);
        RadioButton rbMasc = (RadioButton) findViewById(R.id.radioButton2);
        if (rbMasc.isChecked())
            genero="Estimado";
        else
            genero = "Estimada";

        Toast.makeText(this, "Hola"+ genero +txtNombre.getText().toString()+" "+txtApellido.getText().toString(), Toast.LENGTH_SHORT).show();
    }

}