package activity_main.mainactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etMasa;
    EditText etAltura;
    TextView tvIntroducir;
    Button btnCalcular;
    TextView tvImc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMasa = findViewById(R.id.et_masa);
        etAltura = findViewById(R.id.et_altura);
        tvIntroducir = findViewById(R.id.tv_introducir);
        btnCalcular = findViewById(R.id.btn_calcular);
        tvImc = findViewById(R.id.tv_imc);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String masa = etMasa.getText().toString();
                int valorMasa = Integer.parseInt(masa);

                String altura = etAltura.getText().toString();
                int valorAltura = Integer.parseInt(altura);

                double valorIMC = (int) valorMasa/Math.pow(valorAltura, 2);

                tvImc.setText((int) valorIMC);

            }
        });
    }
}
