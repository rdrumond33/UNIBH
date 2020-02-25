package com.example.aluno.telalogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
        private TextView edtLogin;
        private TextView edtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InicializaObjetos();
    }

    public void InicializaObjetos()
    {
        edtLogin = (ediText) fingViewById(R.id.edtLogin);
        edtSenha = (ediText) findViewById(R.id.edtSenha);
    }
    private void GetSharedPreference (){
        SharedPreferences prefs = getSharedPreferences (MY_PREFS_NAME, MODE_PRIVATE);
        login.setText (prefs.getString ("login", ""));
        pass.setText (prefs.getString ("pass", ""));

    }

    private void SetSharedPreference (){
        SharedPreferences.Editor editor = getSharedPreferences (MY_PREFS_NAME, MODE_PRIVATE).edit ();
        editor.putString ("login", login.getText(). toString ());
        editor.putString ("pass", pass.getText (). toString());
        editor. commit ();

    }
}


