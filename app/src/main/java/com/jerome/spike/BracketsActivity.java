package com.jerome.spike;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BracketsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brackets);

        final TextView textView = (TextView) findViewById(R.id.text_brackets);
        final EditText editText = (EditText) findViewById(R.id.edit_text_brackets);
        Button button = (Button) findViewById(R.id.button_brackets);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Brackets myBrackets = new Brackets();
                String inputText = editText.getText().toString();
                textView.setText("Check brackets: " + myBrackets.check(inputText) + "\n");
            }
        });
    }
}
