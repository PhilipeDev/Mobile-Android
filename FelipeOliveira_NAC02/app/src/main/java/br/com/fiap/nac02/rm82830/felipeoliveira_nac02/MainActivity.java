package br.com.fiap.nac02.rm82830.felipeoliveira_nac02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioButton radioBrilho;
    private RadioButton radioMosaico;
    private RadioButton radioAlbania;
    private RadioButton radioPerlato;
    private EditText edtValor;
    private CheckBox checkUltra;
    private Button btnCalcular;
    private TextView txtResultado;
    private double pisoBranco,pisoAlbania, pisoPerlato, revestimento, vlTotal = 0;
    boolean frete;

    private static final String TAG = "TESTE: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalcular = findViewById(R.id.btnCalcular);
        edtValor = findViewById(R.id.edtValor);
        checkUltra = findViewById(R.id.checkUltra);
        radioBrilho = findViewById(R.id.radioBrilho);
        radioAlbania = findViewById(R.id.radioAlbania);
        radioMosaico = findViewById(R.id.radioMosaico);
        radioPerlato = findViewById(R.id.radioPerlato);
        txtResultado = findViewById(R.id.txtResultado);

        edtValor.setText("10");

        checkUltra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Frete modo ultra rápido selecionado.", Toast.LENGTH_SHORT);
                boolean checked = ((CheckBox) view).isChecked();

                // Check which checkbox was clicked
                switch(view.getId()) {
                    case R.id.checkUltra:
                        if (checked){

                            frete = true;
                        }else{
                            frete = false;
                        }
                        // Put some meat on the sandwich
                        break;
                    // TODO: Veggie sandwich
                }
            }
        });

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pisoBranco = 24.90;
                pisoAlbania = 11.90;
                pisoPerlato = 39.90;
                revestimento = 16.90;

                String vlEdt = edtValor.getText().toString();

                //VALIDANDO O EDT
                if(vlEdt.trim().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Por favor, digite um valor válido", Toast.LENGTH_SHORT);
                    return;
                }

                double vlQuadrado = Double.parseDouble(vlEdt);

                if(radioBrilho.isChecked()){
                    vlTotal = (vlQuadrado * pisoBranco);
                }else if(radioAlbania.isChecked()){
                    vlTotal = (vlQuadrado * pisoAlbania);
                }else if(radioPerlato.isChecked()){
                    vlTotal = (vlQuadrado*pisoPerlato);
                }else if(radioMosaico.isChecked()){
                    vlTotal = (vlQuadrado*revestimento);
                }

                if(frete == true) {
                    vlTotal = vlTotal + (vlTotal * 0.3);
                }

                String msg = String.format("R$ %.2f", vlTotal);
                //LOG TESTE
                Log.i(TAG, "Testando o valor " + vlTotal);

                txtResultado.setText(msg);
            }
        });
    }
}
