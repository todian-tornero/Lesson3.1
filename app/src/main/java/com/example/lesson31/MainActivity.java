package com.example.lesson31;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickOnButtonSave();
        clickOnButtonPressure();
        clickOnButtonHealth();
    }

    private void clickOnButtonSave(){
        Button buttonSave = findViewById(R.id.buttonSave);
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextName = findViewById(R.id.editTextName);
                EditText editTextAge = findViewById(R.id.editTextAge);
                try {
                    User user = new User(editTextName.getText().toString(), Integer.parseInt(editTextAge.getText().toString()));
                    Toast.makeText(MainActivity.this,
                            user.getName() + " " + user.getAge(),Toast.LENGTH_LONG).show();

                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void clickOnButtonPressure(){
        Button buttonPressure = findViewById(R.id.buttonPressure);
        buttonPressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PressureActivity.class);
                startActivity(intent);
            }
        });
    }

    private void clickOnButtonHealth(){
        Button buttonHealth = findViewById(R.id.buttonHealth);
        buttonHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HealthActivity.class);
                startActivity(intent);
            }
        });
    }
}