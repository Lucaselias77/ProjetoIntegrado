package com.example.lucas.selecao_brasileira;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;


public class titulos extends ActionBarActivity {
    // VOLTAR PARA TELA PRINCIPAL
    private Button btnprincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.titulos);

        btnprincipal = (Button) findViewById(R.id.btnprincipal);

        btnprincipal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent Intent = new Intent(titulos.this, MainActivity.class);
                startActivity(Intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_titulos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
