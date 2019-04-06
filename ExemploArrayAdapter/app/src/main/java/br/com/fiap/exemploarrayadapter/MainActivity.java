package br.com.fiap.exemploarrayadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spnPaises;
    String[] paises = {
            "Alemanha",
            "Espanha",
            "Portugal",
            "Argélia",
            "Brasil",
            "Croácia",
            "Dinamarca",
            "Eslováquia",
            "Finlândia",
            "Zimbabue"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnPaises = findViewById(R.id.spnPaises);
        /*ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, paises);*/
        PaisAdapter adapter = new PaisAdapter(this, paises);
        spnPaises.setAdapter(adapter);
    }

    public void salvar(View view) {
        int posicao         = spnPaises.getSelectedItemPosition();
        String selecionado  = (String)spnPaises.getSelectedItem();

        String msg = String.format("(%d) %s",posicao, selecionado);

        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
}
