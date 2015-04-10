package com.example.lucas.selecao_brasileira;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;
import android.content.Intent;


public class MainActivity extends ActionBarActivity {
// TELA TíTULOS
    private Button btntitulos, btnhino, btnartilheiros, btnsobre, btncbf, btnelenco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btntitulos = (Button) findViewById(R.id.btntitulos);
        btntitulos.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent Intent = new Intent(MainActivity.this, titulos.class);
                startActivity(Intent);

            }

        });
// TELA HINO
        btnhino = (Button) findViewById(R.id.btnhino);
        btnhino.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent Intencao = new Intent(MainActivity.this, hinonacional.class);
                startActivity(Intencao);

            }

        });
//TELA MAIORES ARTILHEIROS
        btnartilheiros = (Button) findViewById(R.id.btnartilheiros);
        btnartilheiros.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent Intent = new Intent(MainActivity.this, maioresartilheiros.class);
                startActivity(Intent);

            }

        });
        //TELA SOBRE NÓS
        btnsobre = (Button) findViewById(R.id.btnsobre);
        btnsobre.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent Intent = new Intent(MainActivity.this, sobrenos.class);
                startActivity(Intent);

            }

        });
        // TELA CBF
        btncbf = (Button) findViewById(R.id.btncbf);
        btncbf.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent Intent = new Intent(MainActivity.this, cbf.class);
                startActivity(Intent);

            }

        });

        // TELA ELENCO
        btnelenco = (Button) findViewById(R.id.btnelenco);
        btnelenco.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent Intent = new Intent(MainActivity.this, elenco.class);
                startActivity(Intent);

            }

        });
    }


        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
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
