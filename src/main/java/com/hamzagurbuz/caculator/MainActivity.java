package com.hamzagurbuz.caculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.hamzagurbuz.caculator.R;

public class MainActivity extends AppCompatActivity {

    Button caculate, topla, cikar, carp, bol;
    EditText s1, s2, result;
    double s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s1 = findViewById(R.id.sayi1);
        s2 = findViewById(R.id.sayi2);

        topla = findViewById(R.id.topla);
        cikar = findViewById(R.id.cikar);
        carp = findViewById(R.id.carp);
        bol = findViewById(R.id.bol);
        caculate = findViewById(R.id.hesapla);
        result = findViewById(R.id.sonuc);

        topla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isInputValid()) {
                    int num1 = Integer.parseInt(s1.getText().toString());
                    int num2 = Integer.parseInt(s2.getText().toString());
                    s = num1 + num2;
                }
            }
        });

        cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isInputValid()) {
                    int num1 = Integer.parseInt(s1.getText().toString());
                    int num2 = Integer.parseInt(s2.getText().toString());
                    s = num1 - num2;
                }
            }
        });

        carp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isInputValid()) {
                    int num1 = Integer.parseInt(s1.getText().toString());
                    int num2 = Integer.parseInt(s2.getText().toString());
                    s = num1 * num2;
                }
            }
        });

        bol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isInputValid()) {
                    double num1 = Integer.parseInt(s1.getText().toString());
                    double num2 = Integer.parseInt(s2.getText().toString());
                    s = num1 / num2;
                }
            }
        });

        caculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(String.valueOf(s));
            }
        });
    }

    // Girişleri kontrol eden yardımcı metod
    private boolean isInputValid() {
        if (s1.getText().toString().isEmpty() || s2.getText().toString().isEmpty()) {
            result.setText("Lütfen iki sayıyı da girin!");
            return false;
        }
        return true;
    }
}
