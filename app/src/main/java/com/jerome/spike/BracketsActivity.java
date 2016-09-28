package com.jerome.spike;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class BracketsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brackets);

        final TextView textView = (TextView) findViewById(R.id.text_brackets);
        final EditText editText = (EditText) findViewById(R.id.edit_text_brackets);

        editText.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        Brackets myBrackets = new Brackets();
                        String inputText = editText.getText().toString();
                        textView.setText(
                                BracketsActivity.this.getResources().getString(R.string.brackets_start_result) +
                                        " " + myBrackets.check(inputText) + "\n");

                    }

                    @Override
                    public void afterTextChanged(Editable s) {
                    }
                }

        );
    }
}
