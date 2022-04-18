package com.example.android.droidcafeinput;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toolbar;

public class FroyoOrderActivity extends AppCompatActivity {

    public android.support.v7.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("FroyoOrderActivity", "FroyoOrderActivity created");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_froyo_order);

        toolbar = findViewById(R.id.froyoToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        setTitle("Froyo");
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}