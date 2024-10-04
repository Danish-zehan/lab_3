package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;  // Import the TextView class
import androidx.appcompat.app.AppCompatActivity;

public class NameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);


        String userName = getIntent().getStringExtra("user_name");


        TextView welcomeText = findViewById(R.id.nextButton);


        welcomeText.setText("Welcome, " + userName + "!");
    }
}
