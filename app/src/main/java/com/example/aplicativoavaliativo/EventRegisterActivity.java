package com.example.aplicativoavaliativo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class EventRegisterActivity extends AppCompatActivity {
    private ArrayList<String> events = new ArrayList<>();
    private ArrayAdapter<String> adapter;
    private int counter = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_register);

        EditText etEvent = findViewById(R.id.etEvent);
        DatePicker datePicker = findViewById(R.id.datePicker);
        ListView lvEvents = findViewById(R.id.lvEvents);
        Button btnAdd = findViewById(R.id.btnAddEvent);


        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, events);
        lvEvents.setAdapter(adapter);


        btnAdd.setOnClickListener(v -> {
            String text = etEvent.getText().toString();
            String date = datePicker.getDayOfMonth() + "/" +
                    (datePicker.getMonth() + 1) + "/" +
                    datePicker.getYear();
            String entry = counter++ + " | " + date + " | " + text;
            events.add(entry);
            adapter.notifyDataSetChanged();
            etEvent.setText("");
        });

    }
}