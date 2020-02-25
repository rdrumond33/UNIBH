package com.example.teste;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AlterarActivity extends AppCompatActivity {
private Button btnAlterar;
private EditText editTextAltNome,editTextAltEmail,editTextAltTelefone;
private DataHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alterar);
        btnAlterar = findViewById(R.id.buttonAlt);
        editTextAltNome = findViewById(R.id.editTextAltNome);
        editTextAltNome = findViewById(R.id.editTextAltEmail);
        editTextAltNome = findViewById(R.id.editTextAltTelefone);


        db = new DataHelper(this);


       // Cursor Dados = db.consulta("7");

        //editTextAltNome.setText(Dados.getString(Dados.getColumnIndex("nome")));


    }

    public void Update(){


    }
}
