package com.example.exercicio3;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
        
public class MainActivity extends AppCompatActivity {
    Button btnIniciar;
    Button btnServico;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

public void startService(View view){
        Intent intent = new Intent(this, MyService.class);
        startService(intent);
}

public void spotService(View view){
    Intent it = new Intent(this, MyService.class);
    stopService(it);
}


}
