package com.example.android.droidcafeinput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class IceCreamOrderActivity extends AppCompatActivity {

    public android.support.v7.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice_cream_order);

        toolbar = findViewById(R.id.iceCreamToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        setTitle("Ice cream");
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}