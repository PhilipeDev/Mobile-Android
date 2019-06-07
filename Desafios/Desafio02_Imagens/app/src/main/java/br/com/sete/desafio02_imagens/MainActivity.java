package br.com.sete.desafio02_imagens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    //DECLARAÇÃO DE VÁRIAVEIS
    Button btnPessoa01;
    Button btnPessoa02;
    Button btnPessoa03;
    ImageView imgPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Captura os ID's de cada elemento no layout
        btnPessoa01 = findViewById(R.id.btnPessoa01);
        btnPessoa02 = findViewById(R.id.btnPessoa02);
        btnPessoa03 = findViewById(R.id.btnPessoa03);
        imgPessoa = findViewById(R.id.imgPessoa);
    }

    public void mudaFoto(View view) {
        //Busca o id clicado na view e altera sua respectiva imagem
        switch (view.getId()){
            case R.id.btnPessoa01:
                imgPessoa.setImageResource(R.drawable.icon_pessoa_indian);
                break;
            case R.id.btnPessoa02:
                imgPessoa.setImageResource(R.drawable.icon_pessoa_traveller);
                break;
            case R.id.btnPessoa03:
                imgPessoa.setImageResource(R.drawable.icon_pessoa_santa_elf);
                break;
        }
    }
}
