package br.com.fragmentsmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void exibirFragment1(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer, new MeuFragment())
                .addToBackStack(null)
                .commit();
    }


    public void exibirFragment2(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer, new OutroFragment())
                .addToBackStack(null)
                .commit();
    }
}
