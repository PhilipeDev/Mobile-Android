package br.com.sete.desafio01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText vlEdtNum;
    EditText vlEdtNum2;
    Button btnSoma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vlEdtNum = findViewById(R.id.edtNum);
        vlEdtNum2 = findViewById(R.id.edtNum2);
        btnSoma = findViewById(R.id.btnSoma);
    }

    public void somar(View view) {

        int resultado;
        //VALIDANDO O EDIT TEXT
        if(TextUtils.isEmpty(vlEdtNum.getText().toString())){
            Toast.makeText(this, "Por favor, digite um número.", Toast.LENGTH_SHORT).show();
        }else {
            int num1 = Integer.parseInt(vlEdtNum.getText().toString());
            int num2 = Integer.parseInt(vlEdtNum2.getText().toString());

            resultado = num1 + num2;
            Toast.makeText(this,"O resultado da soma foi: "+ resultado, Toast.LENGTH_SHORT).show();
        }
    }
}
