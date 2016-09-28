package com.jerome.spike;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PalindromeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);

        final EditText editText = (EditText) findViewById(R.id.edit_text_palindrome);

        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                doAction(editText.getText().toString());
                return false;
            }
        });
    }
    protected void doAction(String string){
        final TextView textView = (TextView) findViewById(R.id.text_palindrome);
        Palindrome myPalindrome = new Palindrome();
        textView.setText("");
        textView.append(
                PalindromeActivity.this.getResources().getString(R.string.palindrome_start1_result).replace("%s", string) +
                        " " + String.valueOf(myPalindrome.isPalindrome(string)) + "\n");
        textView.append(
                PalindromeActivity.this.getResources().getString(R.string.palindrome_start2_result).replace("%s", string) +
                        " " + myPalindrome.reverse(string) + "\n");
        if (myPalindrome.isPalindrome(string)) {
            textView.setBackgroundColor(Color.GREEN);
        } else {
            textView.setBackgroundColor(Color.RED);
        }
    }
}
