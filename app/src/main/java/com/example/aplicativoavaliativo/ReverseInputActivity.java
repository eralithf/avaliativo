package com.example.aplicativoavaliativo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import com.example.aplicativoavaliativo.R;

public class ReverseInputActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse_input);

        EditText etText = findViewById(R.id.etText);
        Button btnSend = findViewById(R.id.btnSend);

        btnSend.setOnClickListener(v -> {
            String input = etText.getText().toString();
            Intent intent = new Intent(this, ReversedTextActivity.class);
            intent.putExtra("reversed", new StringBuilder(input).reverse().toString());
            startActivity(intent);
        });
    }
}