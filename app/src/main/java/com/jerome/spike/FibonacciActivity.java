package com.jerome.spike;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FibonacciActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);

        final TextView textView = (TextView) findViewById(R.id.text_fibonacci);
        final EditText editText = (EditText) findViewById(R.id.edit_text_fibonacci);
        Button button = (Button) findViewById(R.id.button_fibonacci);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fibonacci myFibonacci = new Fibonacci();
                String inputText = editText.getText().toString();
                textView.setText(
                        FibonacciActivity.this.getResources().getString(R.string.fibonacci_start_result) +
                        " " + myFibonacci.get(Integer.valueOf(inputText)) + "\n");
            }
        });
    }
}
