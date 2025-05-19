package com.example.aplicativoavaliativo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.aplicativoavaliativo.R;

import java.util.Random;

public class RandomNumberActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_number);

        EditText etMin = findViewById(R.id.etMin);
        EditText etMax = findViewById(R.id.etMax);
        TextView tvResult = findViewById(R.id.tvResult);
        Button btnGenerate = findViewById(R.id.btnGenerate);

        btnGenerate.setOnClickListener(v -> {
            int min = Integer.parseInt(etMin.getText().toString());
            int max = Integer.parseInt(etMax.getText().toString());
            int random = new Random().nextInt((max - min) + 1) + min;
            tvResult.setText("Número gerado: " + random);
        });
    }
}