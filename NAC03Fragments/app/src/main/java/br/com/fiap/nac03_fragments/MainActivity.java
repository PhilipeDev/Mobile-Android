package br.com.fiap.nac03_fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import br.com.fiap.nac03_fragments.fragment.BoingFragment;
import br.com.fiap.nac03_fragments.fragment.FerrariFragment;
import br.com.fiap.nac03_fragments.fragment.LamboFragment;
import br.com.fiap.nac03_fragments.fragment.JaguarFragment;

public class MainActivity extends AppCompatActivity {

    String missao;
    String velocidadeMax;
    String aceleracao;
    String consumo;
    String assentos;
    String capacidade;

    TextView txtAceleracao, txtConsumo, txtVelocidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAceleracao = findViewById(R.id.aceleracao);
        txtConsumo = findViewById(R.id.consumo);
        txtVelocidade = findViewById(R.id.velocidade);
    }

    public void exibirFragmentLambo(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer, new LamboFragment())
                .addToBackStack(null)
                .commit();

        velocidadeMax =  getString(R.string.velocidade_max)+" 350 km/h";
        aceleracao = getString(R.string.aceleracao) +" 2.9 segundos";
        consumo = getString(R.string.consumo)+" 4km/l (cidade) - 9km/l(estrada)";
    }

    public void exibirFragmentJaguar(View view){
        velocidadeMax = "Velocidade Maxima: 322 km/h";
        aceleracao = getString(R.string.aceleracao) +" 3,7 segundos";
        consumo = getString(R.string.consumo)+" 7,3 km/l (cidade) - 13 km/l (estrada)";

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer, new JaguarFragment())
                .addToBackStack(null)
                .commit();
    }

    public void exibirFragmentBoeing(View view){
        missao ="Tipo/Missão: Transporte de passageiros e carga";
        velocidadeMax = "Velocidade Maxima: 917km/h";
        assentos = "Assentos: 400 a 500 assentos";
        capacidade = "95 toneladas de carga";


        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer, new BoingFragment())
                .addToBackStack(null)
                .commit();
    }

    public void exibirFragmentFerrari(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer, new FerrariFragment())
                .addToBackStack(null)
                .commit();

        velocidadeMax = getString(R.string.velocidade_max)+" 330 km/h";
        aceleracao = getString(R.string.aceleracao)+"3 segundos";
        consumo = (R.string.consumo)+" 9km/l (cidade) - 12km/l(estrada)";

    }
}
