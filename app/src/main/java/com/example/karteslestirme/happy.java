package com.example.karteslestirme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class happy extends AppCompatActivity {

    String state;

    Button happybuton;
    TextView texthappystate, texthappyone, texthappytwo, texthappthree, texthappyfour, texthappyfive, texthappysix, texthappyseven, texthappyeight, texthappynine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy);

        texthappystate = (TextView) findViewById(R.id.texthappystate);
        texthappyone = (TextView) findViewById(R.id.texthappyone);
        texthappytwo = (TextView) findViewById(R.id.texthappytwo);
        texthappthree = (TextView) findViewById(R.id.texthappythree);
        texthappyfour = (TextView) findViewById(R.id.texthappyfour);
        texthappyfive = (TextView) findViewById(R.id.texthappyfive);
        texthappysix = (TextView) findViewById(R.id.texthappysix);
        texthappyseven = (TextView) findViewById(R.id.texthappyseven);
        texthappyeight = (TextView) findViewById(R.id.texthappyeight);
        texthappynine = (TextView) findViewById(R.id.texthappynine);

        happybuton = (Button) findViewById(R.id.happybutton);


        Intent i = getIntent();
        state = i.getStringExtra("happystate");
        texthappystate.setText(state);

        happybuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int number = (int) (Math.random()*10+1);
               show(number);
            }
        });

    }

    public void show(int a) {
        if (a == 1) {
            texthappyone.setVisibility(View.VISIBLE);
            texthappytwo.setVisibility(View.INVISIBLE);
            texthappthree.setVisibility(View.INVISIBLE);
            texthappyfour.setVisibility(View.INVISIBLE);
            texthappyfive.setVisibility(View.INVISIBLE);
            texthappysix.setVisibility(View.INVISIBLE);
            texthappyseven.setVisibility(View.INVISIBLE);
            texthappyeight.setVisibility(View.INVISIBLE);
            texthappynine.setVisibility(View.INVISIBLE);
        } else if (a == 2) {
            texthappyone.setVisibility(View.INVISIBLE);
            texthappytwo.setVisibility(View.VISIBLE);
            texthappthree.setVisibility(View.INVISIBLE);
            texthappyfour.setVisibility(View.INVISIBLE);
            texthappyfive.setVisibility(View.INVISIBLE);
            texthappysix.setVisibility(View.INVISIBLE);
            texthappyseven.setVisibility(View.INVISIBLE);
            texthappyeight.setVisibility(View.INVISIBLE);
            texthappynine.setVisibility(View.INVISIBLE);
        } else if (a == 3) {
            texthappyone.setVisibility(View.INVISIBLE);
            texthappytwo.setVisibility(View.INVISIBLE);
            texthappthree.setVisibility(View.VISIBLE);
            texthappyfour.setVisibility(View.INVISIBLE);
            texthappyfive.setVisibility(View.INVISIBLE);
            texthappysix.setVisibility(View.INVISIBLE);
            texthappyseven.setVisibility(View.INVISIBLE);
            texthappyeight.setVisibility(View.INVISIBLE);
            texthappynine.setVisibility(View.INVISIBLE);
        } else if (a == 4) {
            texthappyone.setVisibility(View.INVISIBLE);
            texthappytwo.setVisibility(View.INVISIBLE);
            texthappthree.setVisibility(View.INVISIBLE);
            texthappyfour.setVisibility(View.VISIBLE);
            texthappyfive.setVisibility(View.INVISIBLE);
            texthappysix.setVisibility(View.INVISIBLE);
            texthappyseven.setVisibility(View.INVISIBLE);
            texthappyeight.setVisibility(View.INVISIBLE);
            texthappynine.setVisibility(View.INVISIBLE);
        } else if (a == 5) {
            texthappyone.setVisibility(View.INVISIBLE);
            texthappytwo.setVisibility(View.INVISIBLE);
            texthappthree.setVisibility(View.INVISIBLE);
            texthappyfour.setVisibility(View.INVISIBLE);
            texthappyfive.setVisibility(View.VISIBLE);
            texthappysix.setVisibility(View.INVISIBLE);
            texthappyseven.setVisibility(View.INVISIBLE);
            texthappyeight.setVisibility(View.INVISIBLE);
            texthappynine.setVisibility(View.INVISIBLE);
        } else if (a == 6) {
            texthappyone.setVisibility(View.INVISIBLE);
            texthappytwo.setVisibility(View.INVISIBLE);
            texthappthree.setVisibility(View.INVISIBLE);
            texthappyfour.setVisibility(View.INVISIBLE);
            texthappyfive.setVisibility(View.INVISIBLE);
            texthappysix.setVisibility(View.VISIBLE);
            texthappyseven.setVisibility(View.INVISIBLE);
            texthappyeight.setVisibility(View.INVISIBLE);
            texthappynine.setVisibility(View.INVISIBLE);
        } else if (a == 7) {
            texthappyone.setVisibility(View.INVISIBLE);
            texthappytwo.setVisibility(View.INVISIBLE);
            texthappthree.setVisibility(View.INVISIBLE);
            texthappyfour.setVisibility(View.INVISIBLE);
            texthappyfive.setVisibility(View.INVISIBLE);
            texthappysix.setVisibility(View.INVISIBLE);
            texthappyseven.setVisibility(View.VISIBLE);
            texthappyeight.setVisibility(View.INVISIBLE);
            texthappynine.setVisibility(View.INVISIBLE);
        } else if (a == 8) {
            texthappyone.setVisibility(View.INVISIBLE);
            texthappytwo.setVisibility(View.INVISIBLE);
            texthappthree.setVisibility(View.INVISIBLE);
            texthappyfour.setVisibility(View.INVISIBLE);
            texthappyfive.setVisibility(View.INVISIBLE);
            texthappysix.setVisibility(View.INVISIBLE);
            texthappyseven.setVisibility(View.INVISIBLE);
            texthappyeight.setVisibility(View.VISIBLE);
            texthappynine.setVisibility(View.INVISIBLE);
        } else if (a == 9) {
            texthappyone.setVisibility(View.INVISIBLE);
            texthappytwo.setVisibility(View.INVISIBLE);
            texthappthree.setVisibility(View.INVISIBLE);
            texthappyfour.setVisibility(View.INVISIBLE);
            texthappyfive.setVisibility(View.INVISIBLE);
            texthappysix.setVisibility(View.INVISIBLE);
            texthappyseven.setVisibility(View.INVISIBLE);
            texthappyeight.setVisibility(View.INVISIBLE);
            texthappynine.setVisibility(View.VISIBLE);
        }
    }
}