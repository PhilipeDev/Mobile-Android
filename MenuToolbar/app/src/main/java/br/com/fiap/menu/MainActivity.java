package br.com.fiap.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    Toolbar toolbarPrincipal;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        toolbarPrincipal = findViewById(R.id.toolbarPrincipal);
        //toolbarPrincipal.setLogo(R.drawable.iconfinder_android);
        toolbarPrincipal.setTitle("Menu Principal");
        toolbarPrincipal.setSubtitle("Churros");

        setSupportActionBar(toolbarPrincipal);

        //Coloca o ícone de voltar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){
            case R.id.mniSobre:
                Toast.makeText(this,"Clicou no menu sobre", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mniSair:
                finish();
                break;
            case R.id.home: //Botão voltar
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
