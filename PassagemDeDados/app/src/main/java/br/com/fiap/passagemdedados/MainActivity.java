package br.com.fiap.passagemdedados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = findViewById(R.id.edtNome);
    }

    public void confirmar(View view) {
        String nome = edtNome.getText().toString();

        if(nome.trim().isEmpty()){
            Toast.makeText(this, R.string.por_favor_nome, Toast.LENGTH_SHORT).show();
            return;
        }

        //A função da intent é enviar mensagens para o sistema operacional de intenções, como abrir activities, sites etc.
                                //Apartir desta classe      //Abrir BoasVindasActivity
        Intent i = new Intent(this, BoasVindasActivity.class);
        //Inserindo dados na intent - putExtra coloca os dados dentro de um objeto Bundle
        i.putExtra("nome", nome);
        startActivity(i);
    }
}
