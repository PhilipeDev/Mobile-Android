package br.com.fiap.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lstContatos;
    Contato[] contatos = {
            new Contato("João","11 1234-5678","Ocupado",R.drawable.icon_person1),
            new Contato("Maria","11 2345-6789","Disponivel", R.drawable.icon_person2),
            new Contato("Felipe","11 9898-98989","Brabão", 0)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstContatos = (ListView) findViewById(R.id.lstContatos);
        ContatoAdapter adapter = new ContatoAdapter(this, contatos);
        lstContatos.setAdapter(adapter);
    }


}
