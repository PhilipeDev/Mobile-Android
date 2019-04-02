package br.com.fiap.layouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btnLinear;
    Button btnRelative;
    Button btnAbsolute;
    Button btnFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAbsolute = findViewById(R.id.btnAbsolute);
        btnRelative = findViewById(R.id.btnRelative);
        btnFrame = findViewById(R.id.btnLinear);
        btnLinear = findViewById(R.id.btnLinear);
    }

    public void abrirLinearLayout(View view) {
        Toast.makeText(this, R.string.esta_activity_usa_linear_layout, Toast.LENGTH_SHORT).show();
    }

    public void abrirRelativeLayout(View view) {
        Intent it = new Intent(this, RelativeActivity.class);
        startActivity(it);
    }

    public void abrirAbsoluteLayout(View view) {
        Intent it = new Intent(this, AbsoluteActivity.class);
        startActivity(it);
    }

    public void abrirFrameLayout(View view) {
        Intent it = new Intent(this, FrameActivity.class);
        startActivity(it);
    }
}
