package com.jerome.spike;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_palindrome = (Button) findViewById(R.id.button_main_palindrome);
        button_palindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PalindromeActivity.class);
                startActivity(intent);
            }
        });

        Button button_brackets = (Button) findViewById(R.id.button_main_brackets);
        button_brackets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BracketsActivity.class);
                startActivity(intent);
            }
        });

        Button button_fibonacci = (Button) findViewById(R.id.button_main_fibonacci);
        button_fibonacci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FibonacciActivity.class);
                startActivity(intent);
            }
        });
    }
}
