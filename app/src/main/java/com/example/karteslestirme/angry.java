package com.example.karteslestirme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class angry extends AppCompatActivity {

    String state;

    Button angrybuton;
    TextView textangrystate, textangryone, textangrytwo, textangrythree, textangryfour, textangryfive, textangrysix, textangryseven, textangryeight, textangrynine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angry);

        textangrystate = (TextView) findViewById(R.id.textangrystate);
        textangryone = (TextView) findViewById(R.id.textangryone);
        textangrytwo = (TextView) findViewById(R.id.textangrytwo);
        textangrythree = (TextView) findViewById(R.id.textangrythree);
        textangryfour = (TextView) findViewById(R.id.textangryfour);
        textangryfive = (TextView) findViewById(R.id.textangryfive);
        textangrysix = (TextView) findViewById(R.id.textangrysix);
        textangryseven = (TextView) findViewById(R.id.textangryseven);
        textangryeight = (TextView) findViewById(R.id.textangryeight);
        textangrynine = (TextView) findViewById(R.id.textangrynine);


        angrybuton = (Button) findViewById(R.id.angrybutton);


        Intent i = getIntent();
        state = i.getStringExtra("angrystate");
        textangrystate.setText(state);

        angrybuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = (int) (Math.random()*10+1);
                show(number);
            }
        });

    }

    public void show(int a) {
        if (a == 1) {
            textangryone.setVisibility(View.VISIBLE);
            textangrytwo.setVisibility(View.INVISIBLE);
            textangrythree.setVisibility(View.INVISIBLE);
            textangryfour.setVisibility(View.INVISIBLE);
            textangryfive.setVisibility(View.INVISIBLE);
            textangrysix.setVisibility(View.INVISIBLE);
            textangryseven.setVisibility(View.INVISIBLE);
            textangryeight.setVisibility(View.INVISIBLE);
            textangrynine.setVisibility(View.INVISIBLE);
        } else if (a == 2) {
            textangryone.setVisibility(View.INVISIBLE);
            textangrytwo.setVisibility(View.VISIBLE);
            textangrythree.setVisibility(View.INVISIBLE);
            textangryfour.setVisibility(View.INVISIBLE);
            textangryfive.setVisibility(View.INVISIBLE);
            textangrysix.setVisibility(View.INVISIBLE);
            textangryseven.setVisibility(View.INVISIBLE);
            textangryeight.setVisibility(View.INVISIBLE);
            textangrynine.setVisibility(View.INVISIBLE);
        } else if (a == 3) {
            textangryone.setVisibility(View.INVISIBLE);
            textangrytwo.setVisibility(View.INVISIBLE);
            textangrythree.setVisibility(View.VISIBLE);
            textangryfour.setVisibility(View.INVISIBLE);
            textangryfive.setVisibility(View.INVISIBLE);
            textangrysix.setVisibility(View.INVISIBLE);
            textangryseven.setVisibility(View.INVISIBLE);
            textangryeight.setVisibility(View.INVISIBLE);
            textangrynine.setVisibility(View.INVISIBLE);
        } else if (a == 4) {
            textangryone.setVisibility(View.INVISIBLE);
            textangrytwo.setVisibility(View.INVISIBLE);
            textangrythree.setVisibility(View.INVISIBLE);
            textangryfour.setVisibility(View.VISIBLE);
            textangryfive.setVisibility(View.INVISIBLE);
            textangrysix.setVisibility(View.INVISIBLE);
            textangryseven.setVisibility(View.INVISIBLE);
            textangryeight.setVisibility(View.INVISIBLE);
            textangrynine.setVisibility(View.INVISIBLE);
        } else if (a == 5) {
            textangryone.setVisibility(View.INVISIBLE);
            textangrytwo.setVisibility(View.INVISIBLE);
            textangrythree.setVisibility(View.INVISIBLE);
            textangryfour.setVisibility(View.INVISIBLE);
            textangryfive.setVisibility(View.VISIBLE);
            textangrysix.setVisibility(View.INVISIBLE);
            textangryseven.setVisibility(View.INVISIBLE);
            textangryeight.setVisibility(View.INVISIBLE);
            textangrynine.setVisibility(View.INVISIBLE);
        } else if (a == 6) {
            textangryone.setVisibility(View.INVISIBLE);
            textangrytwo.setVisibility(View.INVISIBLE);
            textangrythree.setVisibility(View.INVISIBLE);
            textangryfour.setVisibility(View.INVISIBLE);
            textangryfive.setVisibility(View.INVISIBLE);
            textangrysix.setVisibility(View.VISIBLE);
            textangryseven.setVisibility(View.INVISIBLE);
            textangryeight.setVisibility(View.INVISIBLE);
            textangrynine.setVisibility(View.INVISIBLE);
        } else if (a == 7) {
            textangryone.setVisibility(View.INVISIBLE);
            textangrytwo.setVisibility(View.INVISIBLE);
            textangrythree.setVisibility(View.INVISIBLE);
            textangryfour.setVisibility(View.INVISIBLE);
            textangryfive.setVisibility(View.INVISIBLE);
            textangrysix.setVisibility(View.INVISIBLE);
            textangryseven.setVisibility(View.VISIBLE);
            textangryeight.setVisibility(View.INVISIBLE);
            textangrynine.setVisibility(View.INVISIBLE);
        } else if (a == 8) {
            textangryone.setVisibility(View.INVISIBLE);
            textangrytwo.setVisibility(View.INVISIBLE);
            textangrythree.setVisibility(View.INVISIBLE);
            textangryfour.setVisibility(View.INVISIBLE);
            textangryfive.setVisibility(View.INVISIBLE);
            textangrysix.setVisibility(View.INVISIBLE);
            textangryseven.setVisibility(View.INVISIBLE);
            textangryeight.setVisibility(View.VISIBLE);
            textangrynine.setVisibility(View.INVISIBLE);
        } else if (a == 9) {
            textangryone.setVisibility(View.INVISIBLE);
            textangrytwo.setVisibility(View.INVISIBLE);
            textangrythree.setVisibility(View.INVISIBLE);
            textangryfour.setVisibility(View.INVISIBLE);
            textangryfive.setVisibility(View.INVISIBLE);
            textangrysix.setVisibility(View.INVISIBLE);
            textangryseven.setVisibility(View.INVISIBLE);
            textangryeight.setVisibility(View.INVISIBLE);
            textangrynine.setVisibility(View.VISIBLE);
        }
    }
}