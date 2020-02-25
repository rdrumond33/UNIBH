package com.example.teste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastrarContatoActivity extends AppCompatActivity {

    private Button btnSalvar;
    private EditText edittextNome, edittextEmail, edittextTelefone;
    private DataHelper db;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_contato);

        btnSalvar = findViewById(R.id.buttonSalvar);
        edittextNome = findViewById(R.id.editTextNome);
        edittextEmail = findViewById(R.id.editTextEmail);
        edittextTelefone = findViewById(R.id.editTextTelefone);

        db = new DataHelper(this);
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Salvar();
            }
        });

    }

public void Salvar(){

    try{
        db.Insert(edittextNome.getText().toString(),edittextEmail.getText().toString(),edittextTelefone.getText().toString());

    }catch (Exception e){
        e.printStackTrace();
    }finally {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
    }

}



