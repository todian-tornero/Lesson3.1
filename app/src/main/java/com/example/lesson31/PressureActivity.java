package com.example.lesson31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class PressureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure);

        clickOnButtonSavePressure();
    }

    private void clickOnButtonSavePressure() {
        Button buttonSavePressure = findViewById(R.id.buttonSavePressure);
        buttonSavePressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView sys = findViewById(R.id.editTextSys);
                TextView dias = findViewById(R.id.editTextDias);
                TextView puls = findViewById(R.id.editTextPuls);
                ArrayList<Pressure> pressureList = new ArrayList<>();
                try {
                    Pressure pressure;
                pressureList.add(pressure = new Pressure(Integer.parseInt(sys.getText().toString()), Integer.parseInt(dias.getText().toString()), Integer.parseInt(puls.getText().toString())));
            }
                catch (Exception e){
                    Toast.makeText(PressureActivity.this, "Error", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}