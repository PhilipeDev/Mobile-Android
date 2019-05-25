package br.com.fiap.exemplonavigationdrawer;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawerLayout);
        toggle = new ActionBarDrawerToggle(
                this,
                drawerLayout,
                toolbar,
                R.string.fechar,
                R.string.abrir
        );
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView = findViewById(R.id.navView);
        navigationView.setItemIconTintList(null);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.mniFusca:
                        trocaFragment(new FuscaFragment());
                        break;
                    case R.id.mniFiatUno:
                        trocaFragment(new UnoFragment());
                        break;
                    case R.id.mniCelta:
                        trocaFragment(new CeltaFragment());
                        break;
                    case R.id.mniSobre:
                        drawerLayout.closeDrawer(Gravity.START);
                        Intent it = new Intent(MainActivity.this,SobreActivity.class);
                        startActivity(it);
                        break;
                    case R.id.mniSair:
                        finish();
                        break;
                }
                drawerLayout.closeDrawer(Gravity.START);
                return false;
            }
        });

        trocaFragment(new InicialFragment());
    }



    private void trocaFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer, fragment)
                .addToBackStack(null)
                .commit();
    }

}
