package com.example.taller1_andriod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText hora;
    private EditText valor;
    private Button calcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        hora=(EditText)findViewById(R.id.txthoras);
        valor=(EditText)findViewById(R.id.txtvalor);
        calcular=(Button)findViewById(R.id.btncalcular);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double val, total;
                int hor;


                val=Double.parseDouble(valor.getText().toString());
                hor=Integer.parseInt(hora.getText().toString());
                total=val*hor;
               Toast.makeText(MainActivity.this,"el salario final es:"+total,Toast.LENGTH_LONG).show();


            }
        });

    }
}
