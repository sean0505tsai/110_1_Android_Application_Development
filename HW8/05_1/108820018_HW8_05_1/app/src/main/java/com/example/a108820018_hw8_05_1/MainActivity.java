package com.example.a108820018_hw8_05_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.LevelListDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView batteryLevel;
    int mLevel = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        batteryLevel = findViewById(R.id.batteryImageView);
    }

    public void increaseLevel(View view){
        if(mLevel < 7){
            mLevel++;
            batteryLevel.setImageLevel(mLevel);
        }
    }

    public void decreaseLevel(View view){
        if(mLevel > 0){
            mLevel--;
            batteryLevel.setImageLevel(mLevel);
        }
    }
}