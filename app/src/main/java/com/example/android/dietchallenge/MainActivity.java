package com.example.android.dietchallenge;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

     public ImageButton start_button;
     EditText message;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message = (EditText) findViewById(R.id.name);

        start_button = (ImageButton) findViewById(R.id.start_button);
        start_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                String myMessage = message.getText().toString();


                if( message.getText().toString().isEmpty()){

                    /**
                     *   You can Toast a message here that the Username is Empty
                     **/

                    message.setError( "First name is required!" );

                }else{
                    Intent page = new Intent(MainActivity.this, second.class);
                    page.putExtra("message_key", myMessage);
                    startActivity(page);
                }
            }

        });

    }

        }



