package com.example.lesson31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HealthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

        clickOnButtonSaveHealth();
    }

    private void clickOnButtonSaveHealth(){
        Button buttonSaveHealth = findViewById(R.id.buttonSaveHealth);
        buttonSaveHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText weight = findViewById(R.id.editTextWeight);
                EditText steps = findViewById(R.id.editTextSteps);
                try {
                    Health health = new Health(Double.parseDouble(weight.getText().toString()), Integer.parseInt(steps.getText().toString()));
                }
                catch (Exception e){
                    Toast.makeText(HealthActivity.this, "Error", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}