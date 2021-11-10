package com.tonny.tonnysapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class HomeArea extends AppCompatActivity {
    Button btn;
    TextInputEditText tet;
    TextView txtoutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_area);

        btn = findViewById(R.id.submitId);
        tet = findViewById(R.id.converterId);
        txtoutput = findViewById(R.id.outputId);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double input = Double.parseDouble(tet.getText().toString().trim());
                double output = input / 60;
                txtoutput.setText("Hours: " + output);

            }
        });
    }
}