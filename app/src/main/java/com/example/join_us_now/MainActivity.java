package com.example.join_us_now;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Time;


public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    EditText myname,email,phoneNo;
    RadioGroup radioGroup1;
    RadioGroup radioGroup2;
    RadioGroup radioGroup3;
    Button button;

    String text;
    String text1;
    String text2;

    public static final String Name = "nameKey";
    public static final String Email = "emailKey";
    public static final String Phone = "phoneKey";
    public static final String Time = "timeKey";
    public static final String Skate = "skateKey";
    public static final String Coach = "coachKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myname = findViewById(R.id.editTextTextPersonName);
        email = findViewById(R.id.idEdtEmail);
        phoneNo = findViewById(R.id.phonenumber);
        radioGroup1 = findViewById(R.id.radiogroup1);
        radioGroup2 = findViewById(R.id.radiogroup2);
        radioGroup3 = findViewById(R.id.radiogroup3);
        button = findViewById(R.id.button7);

        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radio1:
                        text = "5:00 PM";
                        break;
                    case R.id.radio2:
                        text = "7:00 PM";
                        break;
                    case R.id.radio3:
                        text = "9:00 PM";
                        break;
                } } });
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radio4:
                        text1 = "owned";
                        break;
                    case R.id.radio5:
                        text1 = "rent";
                        break;
                    case R.id.radio6:
                        text1 = "buy";
                        break;
                }  } });
        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch(checkedId){
                    case R.id.radio7:
                        text2 = "Yes";
                        break;
                    case R.id.radio8:
                        text2 = "No";
                        break;
                } } });

        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(Name, myname.getText().toString());
                editor.putString(Email, email.getText().toString());
                editor.putString(Phone, phoneNo.getText().toString());
                editor.putString(Time, text);
                editor.putString(Skate, text1);
                editor.putString(Coach, text2);
                editor.apply();

                Intent intent = new Intent(MainActivity.this,Review1.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Register is Successful!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}