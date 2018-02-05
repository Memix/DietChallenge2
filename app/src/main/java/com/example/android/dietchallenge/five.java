package com.example.android.dietchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class five extends AppCompatActivity {

    TextView question1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

        question1 = (TextView) findViewById(R.id.question1);
        question1.setText("Which of these is your favourite food? You can pick more than one.");

    setupSubmitButton();
}

    private void setupSubmitButton() {
        Button btn = (Button) findViewById(R.id.summary1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (five.this, Challenge.class );
                startActivity(intent);
            }

        });
    }
}
