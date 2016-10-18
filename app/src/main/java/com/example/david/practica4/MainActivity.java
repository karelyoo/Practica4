package com.example.david.practica4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Numero;
    TextView Resultado;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View view){
        Numero = (EditText)findViewById(R.id.edtxt1);
        Resultado = (TextView)findViewById(R.id.txt2);
        int b100,b50,b20, m5,m2,m1, c50,c20,c10;
        double num = Double.parseDouble(Numero.getText().toString());

        b100 = (int)num/100;
        num = num - (b100*100);
        b50 = (int)num/50;
        num = num - (b50*50);
        b20 = (int)num/20;
        num = num - (b20*20);
        m5 = (int)num/5;
        num = num - (m5*5);
        m2 = (int)num/2;
        num = num - (m2*2);
        m1 = (int)num;
        num = num - (m1);
        c50 = (int)(num/0.50);
        num = num - (c50*0.50);
        c20 = (int)(num/0.20);
        num = num - (c20*0.20);
        c10 = (int)(num/0.10);

        result = "Billetes de 100 Pesos -> " + b100 + "\nBilletes de 50 Pesos -> " + b50 + "\nBilletes de 20 Pesos -> " + b20 +
        "\nMonedas de 5 Pesos -> " + m5 + "\nMonedas de 2 Pesos -> " + m2 + "\nMonedas de 1 Pesos -> " + m1 +
        "\nMonedas de 50 Centavos -> " + c50 + "\nMonedas de 20 Centavos -> " + c20 + "\nMonedas de 10 Centavos -> " + c10;

        Resultado.setText(result);

    }
}
