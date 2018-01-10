package com.example.android.dietchallenge;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.sql.Array;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Set;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    //declare both spinner from xml
    Spinner spinner1, spinner2;
    //define adapter
    ArrayAdapter adapter;

    int count = 1;
    int score1 = 1000;
    int score2 = 1500;
    int score3 = 2000;
    int score4 = 2500;

    int scoreTeamA = 0;
    int scoreTeamB = 0;


    String name1 = "";
    String name2 = "";

    TextView firstName, secondName, context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    // Create an ArrayAdapter using the string array and a default spinner layout
        adapter = ArrayAdapter.createFromResource(this, R.array.name_list, R.layout.support_simple_spinner_dropdown_item);

        //define spinner
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        //set adapter
        spinner1.setAdapter(adapter);
        //tell where to find it
        spinner1.setOnItemSelectedListener(MainActivity.this);

        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner2.setAdapter(adapter);
        spinner2.setOnItemSelectedListener(MainActivity.this);


    }

    public void input1 (View v){

        displayForTeamA (score1);

    }

    public void input2 (View v){

        displayForTeamA (score2);

    }

    public void input3 (View v){

        displayForTeamA (score3);


    }

    public void input4 (View v){

        displayForTeamA (score4);


    }

    public void input5 (View v){

        displayForTeamB (score1);

    }

    public void input6 (View v){

        displayForTeamB (score2);

    }

    public void input7 (View v){

        displayForTeamB (score3);


    }

    public void input8 (View v){

        displayForTeamB (score4);


    }


    public void enter (View v){

        displayForTeamB (0);
        displayForTeamA(0);

        TextView context = (TextView) findViewById(R.id.context);
        context.setText("");

        Resources res = getResources();
        //initialize string, get array
        String[] weekdays = getResources().getStringArray(R.array.weekdays);

        String weekday = weekdays[count];
        TextView day = (TextView) findViewById(R.id.dayOfWeek);
        day.setText(weekday);
        count++;
        if (count == 7){
            count = 0;
        }


    }



    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        parent.getItemAtPosition(pos);




    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }


    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.view_score1);
        scoreView.setText(String.valueOf(score));
        scoreTeamA = score;


    }


    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.view_score2);
        scoreView.setText(String.valueOf(score));
        scoreTeamB = score;


    }

        public void show (View view){


            TextView firstName = (TextView)spinner1.getSelectedView();
            String name1 = spinner1.getSelectedItem().toString();

            TextView secondName = (TextView)spinner2.getSelectedView();
            String name2 = spinner2.getSelectedItem().toString();


            if (scoreTeamA == score1 && scoreTeamB == score1 || scoreTeamA == score2 && scoreTeamB == score2) {


                TextView context = (TextView) findViewById(R.id.context);
                //set text to textView
                context.setText("You have both done a great job!");
            }
            else if (scoreTeamA == score3 && scoreTeamB == score3 || scoreTeamA == score4 && scoreTeamB == score4){

                TextView context = (TextView) findViewById(R.id.context);
                //set text to textView
                context.setText("You have to work harder!");
            }
            else if (scoreTeamA > scoreTeamB){

                TextView context = (TextView) findViewById(R.id.context);
                //set text to textView
                context.setText(name2 + " wins! " + name1 + " should pay " + name2 + " a drink!");
            }
            else {
                TextView context = (TextView) findViewById(R.id.context);
                context.setText(name1 + " wins! " + name2 + " should pay " + name1 + " a drink!");
            }

        }




}
