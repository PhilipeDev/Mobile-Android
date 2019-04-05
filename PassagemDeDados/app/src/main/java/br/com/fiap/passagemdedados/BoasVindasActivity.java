package br.com.fiap.passagemdedados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class BoasVindasActivity extends AppCompatActivity {

    TextView txtBoas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boas_vindas);
        txtBoas = findViewById(R.id.txtBoas);

        //Validação se esta intent foi aberta por uma activity
        Intent it = getIntent();
        if(it != null){
            //Getting the data from the intent it.getBundleExtra();
            Bundle dados = it.getExtras();
            if(dados != null){
                String nome = dados.getString("nome");
                String msg = String.format("Seja bem vindo, %s", nome);
                txtBoas.setText(msg);
            }
        }

        

    }
}
