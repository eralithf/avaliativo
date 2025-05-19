package com.example.aplicativoavaliativo;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aplicativoavaliativo.R;

public class MenuActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        findViewById(R.id.btnRandom).setOnClickListener(v ->
                startActivity(new Intent(this, RandomNumberActivity.class)));

        findViewById(R.id.btnReverse).setOnClickListener(v ->
                startActivity(new Intent(this, ReverseInputActivity.class)));

        findViewById(R.id.btnRegister).setOnClickListener(v ->
                startActivity(new Intent(this, EventRegisterActivity.class)));
    }
}