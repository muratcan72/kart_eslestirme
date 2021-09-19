package com.example.karteslestirme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class wearyof extends AppCompatActivity {

    String state;
    int hold = 0;

    Button wearyofbuton;
    TextView textwearyofstate, textwearyofone, textwearyoftwo, textwearyofthree, textwearyoffour, textwearyoffive, textwearyofsix, textwearyofseven, textwearyofeight, textwearyofnine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wearyof);

        textwearyofstate = (TextView) findViewById(R.id.textwearyofstate);
        textwearyofone = (TextView) findViewById(R.id.textwearyofone);
        textwearyoftwo = (TextView) findViewById(R.id.textwearyoftwo);
        textwearyofthree = (TextView) findViewById(R.id.textwearyofthree);
        textwearyoffour = (TextView) findViewById(R.id.textwearyoffour);
        textwearyoffive = (TextView) findViewById(R.id.textwearyoffive);
        textwearyofsix = (TextView) findViewById(R.id.textwearyofsix);
        textwearyofseven = (TextView) findViewById(R.id.textwearyofseven);
        textwearyofeight = (TextView) findViewById(R.id.textwearyofeight);
        textwearyofnine = (TextView) findViewById(R.id.textwearyofnine);


        wearyofbuton = (Button) findViewById(R.id.wearyofbutton);


        Intent i = getIntent();
        state = i.getStringExtra("wearyofstate");
        textwearyofstate.setText(state);

        wearyofbuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = (int) (Math.random()*10+1);
                show(number);
            }
        });

    }

    public void show(int a) {
        if (a == hold){
            a = a++;
            if (a == 9 ){
                a = 1;
            }
        }
        if (a == 1) {
            textwearyofone.setVisibility(View.VISIBLE);
            textwearyoftwo.setVisibility(View.INVISIBLE);
            textwearyofthree.setVisibility(View.INVISIBLE);
            textwearyoffour.setVisibility(View.INVISIBLE);
            textwearyoffive.setVisibility(View.INVISIBLE);
            textwearyofsix.setVisibility(View.INVISIBLE);
            textwearyofseven.setVisibility(View.INVISIBLE);
            textwearyofeight.setVisibility(View.INVISIBLE);
            textwearyofnine.setVisibility(View.INVISIBLE);
        } else if (a == 2) {
            textwearyofone.setVisibility(View.INVISIBLE);
            textwearyoftwo.setVisibility(View.VISIBLE);
            textwearyofthree.setVisibility(View.INVISIBLE);
            textwearyoffour.setVisibility(View.INVISIBLE);
            textwearyoffive.setVisibility(View.INVISIBLE);
            textwearyofsix.setVisibility(View.INVISIBLE);
            textwearyofseven.setVisibility(View.INVISIBLE);
            textwearyofeight.setVisibility(View.INVISIBLE);
            textwearyofnine.setVisibility(View.INVISIBLE);
        } else if (a == 3) {
            textwearyofone.setVisibility(View.INVISIBLE);
            textwearyoftwo.setVisibility(View.INVISIBLE);
            textwearyofthree.setVisibility(View.VISIBLE);
            textwearyoffour.setVisibility(View.INVISIBLE);
            textwearyoffive.setVisibility(View.INVISIBLE);
            textwearyofsix.setVisibility(View.INVISIBLE);
            textwearyofseven.setVisibility(View.INVISIBLE);
            textwearyofeight.setVisibility(View.INVISIBLE);
            textwearyofnine.setVisibility(View.INVISIBLE);
        } else if (a == 4) {
            textwearyofone.setVisibility(View.INVISIBLE);
            textwearyoftwo.setVisibility(View.INVISIBLE);
            textwearyofthree.setVisibility(View.INVISIBLE);
            textwearyoffour.setVisibility(View.VISIBLE);
            textwearyoffive.setVisibility(View.INVISIBLE);
            textwearyofsix.setVisibility(View.INVISIBLE);
            textwearyofseven.setVisibility(View.INVISIBLE);
            textwearyofeight.setVisibility(View.INVISIBLE);
            textwearyofnine.setVisibility(View.INVISIBLE);
        } else if (a == 5) {
            textwearyofone.setVisibility(View.INVISIBLE);
            textwearyoftwo.setVisibility(View.INVISIBLE);
            textwearyofthree.setVisibility(View.INVISIBLE);
            textwearyoffour.setVisibility(View.INVISIBLE);
            textwearyoffive.setVisibility(View.VISIBLE);
            textwearyofsix.setVisibility(View.INVISIBLE);
            textwearyofseven.setVisibility(View.INVISIBLE);
            textwearyofeight.setVisibility(View.INVISIBLE);
            textwearyofnine.setVisibility(View.INVISIBLE);
        } else if (a == 6) {
            textwearyofone.setVisibility(View.INVISIBLE);
            textwearyoftwo.setVisibility(View.INVISIBLE);
            textwearyofthree.setVisibility(View.INVISIBLE);
            textwearyoffour.setVisibility(View.INVISIBLE);
            textwearyoffive.setVisibility(View.INVISIBLE);
            textwearyofsix.setVisibility(View.VISIBLE);
            textwearyofseven.setVisibility(View.INVISIBLE);
            textwearyofeight.setVisibility(View.INVISIBLE);
            textwearyofnine.setVisibility(View.INVISIBLE);
        } else if (a == 7) {
            textwearyofone.setVisibility(View.INVISIBLE);
            textwearyoftwo.setVisibility(View.INVISIBLE);
            textwearyofthree.setVisibility(View.INVISIBLE);
            textwearyoffour.setVisibility(View.INVISIBLE);
            textwearyoffive.setVisibility(View.INVISIBLE);
            textwearyofsix.setVisibility(View.INVISIBLE);
            textwearyofseven.setVisibility(View.VISIBLE);
            textwearyofeight.setVisibility(View.INVISIBLE);
            textwearyofnine.setVisibility(View.INVISIBLE);
        } else if (a == 8) {
            textwearyofone.setVisibility(View.INVISIBLE);
            textwearyoftwo.setVisibility(View.INVISIBLE);
            textwearyofthree.setVisibility(View.INVISIBLE);
            textwearyoffour.setVisibility(View.INVISIBLE);
            textwearyoffive.setVisibility(View.INVISIBLE);
            textwearyofsix.setVisibility(View.INVISIBLE);
            textwearyofseven.setVisibility(View.INVISIBLE);
            textwearyofeight.setVisibility(View.VISIBLE);
            textwearyofnine.setVisibility(View.INVISIBLE);
        } else if (a == 9) {
            textwearyofone.setVisibility(View.INVISIBLE);
            textwearyoftwo.setVisibility(View.INVISIBLE);
            textwearyofthree.setVisibility(View.INVISIBLE);
            textwearyoffour.setVisibility(View.INVISIBLE);
            textwearyoffive.setVisibility(View.INVISIBLE);
            textwearyofsix.setVisibility(View.INVISIBLE);
            textwearyofseven.setVisibility(View.INVISIBLE);
            textwearyofeight.setVisibility(View.INVISIBLE);
            textwearyofnine.setVisibility(View.VISIBLE);
        }
        hold = a;
    }
}