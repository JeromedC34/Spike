package com.jerome.spike;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BracketsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brackets);

        final TextView textView = (TextView) findViewById(R.id.text_brackets);
        final EditText editText = (EditText) findViewById(R.id.edit_text_brackets);

        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                Brackets myBrackets = new Brackets();
                String inputText = editText.getText().toString();
                textView.setText(
                        BracketsActivity.this.getResources().getString(R.string.brackets_start_result) +
                                " " + myBrackets.check(inputText) + "\n");
                return false;
            }
        });
    }
}
