package com.example.aluno.datahelperex;

import android.support.constraint.solver.widgets.Snapshot;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;
import org.w3c.dom.UserDataHandler;

public class MainActivity extends AppCompatActivity {
    Button btnInsert;
    TextView listaNomes;
    DataHandler dB;
    EditText fieldName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new view.onClickListener());
        @Override
        public void onClick (View view){
            Snackbar.make(view, "replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
        }
    });
    dB = new DataHelper (this);
    btnInsert = (Button) findViewById(R.id.insert);
    listaNomes = (TextView) this.findViewById(R.id.listaNomes);
    fieldNome = (EditText) findViewById(R.id.nome);
    btnInsert.setOnClickListener (new View.OnClickListener()){
        @Override
            public void onClick(View v){
            db.Insert(fieldName.getText().toString());
            List<String> names=dB.SelectAll();
            StringBuilder sb=new StringBuilder();
            sb.append("Nomes cadastrados:\n");
            for(String name:names) {
                sb.append(name + "\n");
            }
            listaNomes.setText(sb.toString());
        }
        });
    }
    @Override
    public boolean onCreateOpionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
    int id = item.getItemId();
    if (id == R.id.action_settings) {
        return true;
    }
    return super.onOptionsItemSelected(item);
    }
}

