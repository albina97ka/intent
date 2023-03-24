package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn);
        EditText editText = findViewById(R.id.edit1);
        EditText editText1 = findViewById(R.id.edit2);
        String text = String.valueOf(editText.getText());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                int a;
                int b;
                a = Integer.parseInt(editText.getText().toString());
                b = Integer.parseInt(editText1.getText().toString());
                int c;
                c = a + b;
                if (b < 0) {
                    intent.putExtra("key", a + "+" + "(" + b + ")" + "=" + c);
                    startActivity(intent);
                }
                else {
                    intent.putExtra("key", a + "+" + b + " = " + c);
                    startActivity(intent);
                }
            }
        });
    }
}
