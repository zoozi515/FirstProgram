package com.example.firstprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String message = "Welcome to my first Java program";
        System.out.println(message.substring(0, 8) + message.substring(11, 13) + message.substring(19, 24));
        // Bonus
        System.out.println(message.replaceAll("a", "").replaceAll("e", "")
                .replaceAll("i", "").replaceAll("o", "").replaceAll("u",""));
    }
}