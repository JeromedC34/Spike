package com.jerome.spike;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ScrambleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scramble);

        final TextView textView = (TextView) findViewById(R.id.text_scramble);
        final EditText editText = (EditText) findViewById(R.id.edit_text_scramble);
        Button button = (Button) findViewById(R.id.button_scramble);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Scramble myScramble = new Scramble();
                String inputText = editText.getText().toString();
                textView.setText(
                        ScrambleActivity.this.getResources().getString(R.string.scramble_start_result) +
                                " " + myScramble.scrambleTextWords(inputText) + "\n");
            }
        });
    }
}
