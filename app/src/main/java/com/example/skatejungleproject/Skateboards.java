package com.example.skatejungleproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Skateboards extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skateboards);
    }
    public void launchThirdActivity(View view){
        Intent intent = new Intent(this, Cart.class);
        startActivity(intent);
    }
}