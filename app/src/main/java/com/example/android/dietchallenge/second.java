package com.example.android.dietchallenge;

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


        }


    public void enter(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio1:
                if (checked) {
                    Intent page = new Intent(second.this, three.class);
                    startActivity(page);}
                // Pirates are the best
                break;
            case R.id.radio2:
                if (checked)
                {
                    Intent page = new Intent(second.this, four.class);
                    startActivity(page);}
                // Ninjas rule
                break;
        }
    }
}


