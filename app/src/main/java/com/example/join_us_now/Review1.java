package com.example.join_us_now;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.sql.Time;

public class Review1 extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    TextView textView1,textView2,textView3,textView4,textView5,textView6;
    Button button1, button2;

    public static final String Name = "nameKey";
    public static final String Email = "emailKey";
    public static final String Phone = "phoneKey";
    public static final String Time = "timeKey";
    public static final String Skate = "skateKey";
    public static final String Coach = "coachKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.review);

        textView1 = findViewById(R.id.editTextTextPersonName);
        textView2 = findViewById(R.id.idEdtEmail);
        textView3 = findViewById(R.id.phonenumber);
        textView4 = findViewById(R.id.linearlayout);
        textView5 = findViewById(R.id.linearlayout2);
        textView6 = findViewById(R.id.radiogroup3);
        button1 = findViewById(R.id.button7);
        button2 = findViewById(R.id.button8);

        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);

        String name = sharedPreferences.getString(Name,null);
        String email = sharedPreferences.getString(Email,null);
        String phoneNo = sharedPreferences.getString(Phone,null);
        String time = sharedPreferences.getString(Time,null);
        String skate = sharedPreferences.getString(Skate,null);
        String coach = sharedPreferences.getString(Coach,null);

        if (name != null || email != null || phoneNo != null ){
            textView1.setText(name);
            textView2.setText(email);
            textView3.setText(phoneNo);
            textView4.setText(time);
            textView5.setText(skate);
            textView6.setText(coach);
        }

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Review1.this, MainActivity.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Review1.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}










