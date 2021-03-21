package com.example.lesson31;

import androidx.appcompat.app.AppCompatActivity;

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
}