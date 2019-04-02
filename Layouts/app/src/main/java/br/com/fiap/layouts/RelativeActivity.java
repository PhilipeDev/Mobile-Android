package br.com.fiap.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class RelativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        Toast.makeText(this, "Bem-vindo(a) ao Relative Layout", Toast.LENGTH_LONG);
    }
}
