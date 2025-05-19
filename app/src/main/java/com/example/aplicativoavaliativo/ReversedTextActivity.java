package com.example.aplicativoavaliativo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ReversedTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reversed_text);


        TextView tv = findViewById(R.id.tvReversed);
        String reversed = getIntent().getStringExtra("reversed");

        if (reversed != null && !reversed.isEmpty()) {
            tv.setText("Texto invertido: " + reversed);
        } else {
            tv.setText("Nenhum texto recebido!");
        }


        Button btnEventRegister = findViewById(R.id.btnEventRegister);
        btnEventRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ReversedTextActivity.this, EventRegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}