package com.example.hw6_04_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private CheckBox ChocolateSyrupCheckBox;
    private CheckBox SprinklesCheckbox;
    private CheckBox CrushedNutsCheckBox;
    private CheckBox CherriesCheckBox;
    private CheckBox OrioCheckbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ChocolateSyrupCheckBox = findViewById(R.id.chocolate_checkBox);
        SprinklesCheckbox = findViewById(R.id.sprinkle_checkBox);
        CrushedNutsCheckBox = findViewById(R.id.nut_checkBox);
        CherriesCheckBox = findViewById(R.id.cherry_checkBox);
        OrioCheckbox = findViewById(R.id.orio_checkBox);
    }


    public void onSubmit(View view) {
        String message = "Toppings : ";
        if (ChocolateSyrupCheckBox.isChecked()){
            message += ChocolateSyrupCheckBox.getText() + " ";
        }
        if (SprinklesCheckbox.isChecked()){
            message += SprinklesCheckbox.getText()+ " ";
        }
        if (CrushedNutsCheckBox.isChecked()){
            message += CrushedNutsCheckBox.getText() + " ";
        }
        if (CherriesCheckBox.isChecked()) {
            message += CherriesCheckBox.getText() + " ";
        }
        if (OrioCheckbox.isChecked()){
            message += OrioCheckbox.getText();
        }
        Toast.makeText(getApplicationContext(), message , Toast.LENGTH_SHORT).show();
    }

}