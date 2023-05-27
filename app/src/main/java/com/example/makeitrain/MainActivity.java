package com.example.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    Button makeItRain;
    TextView currencyTxt;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currencyTxt = findViewById(R.id.currencyTxt);
        makeItRain = findViewById(R.id.makeItRain);

        makeItRain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = counter + 10;
                currencyTxt.setText(String.valueOf(counter));
            }
        });
    }
}