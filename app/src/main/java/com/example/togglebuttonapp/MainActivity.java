package com.example.togglebuttonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tbton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbton = findViewById(R.id.tbton);
        tbton.setText("Toggle ON");
        tbton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                   tbton.setTextOn("Toggle ON");
                    Toast.makeText(MainActivity.this, "toggle is ON", Toast.LENGTH_SHORT).show();
                } else {
                    tbton.setTextOff("Toggle OFF");
                    Toast.makeText(MainActivity.this, "toggle is OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}