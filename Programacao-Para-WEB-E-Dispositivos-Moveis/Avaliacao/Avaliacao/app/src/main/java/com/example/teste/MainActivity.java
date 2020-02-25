package com.example.teste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button btnInsert,btnListarTodos,btnExcluir,btnAlterar;
    private TextView listaContatos;
    private DataHelper dB;
    private EditText editDeletar,editAlterar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dB = new DataHelper(this);


        btnInsert =  findViewById(R.id.buttonIserir);
        btnExcluir = findViewById(R.id.buttonExcluir);
        btnListarTodos = findViewById(R.id.buttonTodos);
        btnAlterar = findViewById(R.id.buttonAlterar);

        editDeletar = findViewById(R.id.editTextDeletar);
        editAlterar = findViewById(R.id.editTextAlterar);

        listaContatos = findViewById(R.id.textViewResultado);

        btnInsert.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Inserir();
            }
        });
        btnListarTodos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListarTodos();
            }
        });

        btnExcluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Excluir(editDeletar.getText().toString());
            }
        });

        btnAlterar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Alterar(editAlterar.getText().toString());
            }
        });
    }

    public void Inserir(){
        Intent intent = new Intent(this, CadastrarContatoActivity.class);
        startActivity(intent);


    }

    public void ListarTodos(){

        List<String> Contatos = dB.SelectAll();
        StringBuilder sb = new StringBuilder();
        sb.append("Contatos Cadastrados:\n");
        for (String Contato : Contatos) {
            sb.append(Contato + "\n");
        }
        listaContatos.setText(sb.toString());
    }
    public void Excluir(String number){

        dB.Deleteid(number);
        finish();
        startActivity(getIntent());
    }

    public void Alterar(String number){
        Intent intent = new Intent(this, AlterarActivity.class);
        intent.putExtra("numberALT", number);
        startActivity(intent);

    }

}
