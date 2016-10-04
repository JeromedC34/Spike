package com.jerome.spike;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class PalindromeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);

        final EditText editText = (EditText) findViewById(R.id.edit_text_palindrome);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                doAction(editText.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
    protected void doAction(String string){
        final TextView
                textView = (TextView) findViewById(R.id.text_palindrome);
        final FloatingActionButton myFab = (FloatingActionButton) findViewById(R.id.my_fab);
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
            myFab.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
        } else {
            textView.setBackgroundColor(Color.RED);
            myFab.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
        }
    }
}
