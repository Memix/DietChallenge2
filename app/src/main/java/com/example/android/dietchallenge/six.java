package com.example.android.dietchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class six extends AppCompatActivity {

    TextView question1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

        question1 = (TextView) findViewById(R.id.question1);
        question1.setText("Which of these is your favourite food? You can pick more than one.");


        findViewById(R.id.summary).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent page = new Intent(six.this, Challenge.class);
                startActivity(page);
            }
        });


    }
}
