package com.example.android.dietchallenge;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Arrays;

public class second extends AppCompatActivity {

    TextView myMessage;
    TextView summary;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String message = getIntent().getStringExtra("message_key");
        myMessage = (TextView) findViewById(R.id.write_name);
        myMessage.setText("Hello " + message + "!");

        summary = (TextView) findViewById(R.id.summary);
        summary.setText("Let's start by figuering out what you like. This is your first question." + "\n" + "Which is your favourite diet?");

        findViewById(R.id.summary1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RadioButton veganRadioButton = (RadioButton) findViewById(R.id.radio1);
                RadioButton vegeRadioButton = (RadioButton) findViewById(R.id.radio2);
                RadioButton glutenRadioButton = (RadioButton) findViewById(R.id.radio3);
                RadioButton allRadioButton = (RadioButton) findViewById(R.id.radio4);

                if (veganRadioButton.isChecked()) {
                    Intent page = new Intent(second.this, three.class);
                    startActivity(page);
                } else if (vegeRadioButton.isChecked()) {
                    Intent page = new Intent(second.this, four.class);
                    startActivity(page);
                } else if (glutenRadioButton.isChecked()) {
                    Intent page = new Intent(second.this, five.class);
                    startActivity(page);
                } else if (allRadioButton.isChecked()) {
                    Intent page = new Intent(second.this, six.class);
                    startActivity(page);
                }
            }

            });
        }



}


