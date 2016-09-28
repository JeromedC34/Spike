package com.jerome.spike;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PalindromeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);

        final TextView textView = (TextView) findViewById(R.id.text_palindrome);
        final EditText editText = (EditText) findViewById(R.id.edit_text_palindrome);
        Button button = (Button) findViewById(R.id.button_palindrome);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Palindrome myPalindrome = new Palindrome();
                String inputText = editText.getText().toString();
                textView.setText("");
                textView.append("Is palindrome (" + inputText + ")? " + String.valueOf(myPalindrome.isPalindrome(inputText)) + "\n");
                textView.append("Reverse (" + inputText + ") : " + myPalindrome.reverse(inputText) + "\n");
                if (myPalindrome.isPalindrome(inputText)) {
                    textView.setBackgroundColor(Color.GREEN);
                } else {
                    textView.setBackgroundColor(Color.RED);
                }
            }
        });

    }
}
