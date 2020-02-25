package com.example.atividade_3_calculadora_simples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    EditText ed2;
    EditText edresultado;
    Button btnSomar;
    Button btnSubtrair;
    Button btnMult;
    Button btnDividir;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calculadora();

    }

    public void Calculadora(){




        ed1 = (EditText) findViewById(R.id.editText);
        ed2= (EditText) findViewById(R.id.editText2);
        edresultado= (EditText) findViewById(R.id.editText3);

        btnSomar = (Button) findViewById(R.id.button);
        btnSubtrair = (Button) findViewById(R.id.button2);
        btnMult  = (Button) findViewById(R.id.button3);
        btnDividir  = (Button) findViewById(R.id.button4);

        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double v1;
                Double v2;
                Double v3;

                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());
                v3=v1+v2;

                edresultado.setText(v3.toString());
            }
        });

        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double v1;
                Double v2;
                Double v3;

                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());
                v3=v1-v2;

                edresultado.setText(v3.toString());
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double v1;
                Double v2;
                Double v3;

                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());
                v3=v1*v2;

                edresultado.setText(v3.toString());
            }
        });


        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double v1;
                Double v2;
                Double v3;

                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());
                v3=v1/v2;

                edresultado.setText(v3.toString());
            }
        });



    }
}
