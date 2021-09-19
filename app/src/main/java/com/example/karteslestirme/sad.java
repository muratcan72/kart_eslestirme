package com.example.karteslestirme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class sad extends AppCompatActivity {

    String state;

    Button sadbuton;
    TextView textsadstate, textsadone, textsadtwo, textsadthree, textsadfour, textsadfive, textsadsix, textsadseven, textsadeight, textsadnine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sad);

        textsadstate = (TextView) findViewById(R.id.textsadstate);
        textsadone = (TextView) findViewById(R.id.textsadone);
        textsadtwo = (TextView) findViewById(R.id.textsadtwo);
        textsadthree = (TextView) findViewById(R.id.textsadthree);
        textsadfour = (TextView) findViewById(R.id.textsadfour);
        textsadfive = (TextView) findViewById(R.id.textsadfive);
        textsadsix = (TextView) findViewById(R.id.textsadsix);
        textsadseven = (TextView) findViewById(R.id.textsadseven);
        textsadeight = (TextView) findViewById(R.id.textsadeight);
        textsadnine = (TextView) findViewById(R.id.textsadnine);

        sadbuton = (Button) findViewById(R.id.sadbutton);


        Intent i = getIntent();
        state = i.getStringExtra("sadstate");
        textsadstate.setText(state);

        sadbuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = (int) (Math.random()*10+1);
                show(number);
            }
        });

    }

    public void show(int a) {
        if (a == 1) {
            textsadone.setVisibility(View.VISIBLE);
            textsadtwo.setVisibility(View.INVISIBLE);
            textsadthree.setVisibility(View.INVISIBLE);
            textsadfour.setVisibility(View.INVISIBLE);
            textsadfive.setVisibility(View.INVISIBLE);
            textsadsix.setVisibility(View.INVISIBLE);
            textsadseven.setVisibility(View.INVISIBLE);
            textsadeight.setVisibility(View.INVISIBLE);
            textsadnine.setVisibility(View.INVISIBLE);
        } else if (a == 2) {
            textsadone.setVisibility(View.INVISIBLE);
            textsadtwo.setVisibility(View.VISIBLE);
            textsadthree.setVisibility(View.INVISIBLE);
            textsadfour.setVisibility(View.INVISIBLE);
            textsadfive.setVisibility(View.INVISIBLE);
            textsadsix.setVisibility(View.INVISIBLE);
            textsadseven.setVisibility(View.INVISIBLE);
            textsadeight.setVisibility(View.INVISIBLE);
            textsadnine.setVisibility(View.INVISIBLE);
        } else if (a == 3) {
            textsadone.setVisibility(View.INVISIBLE);
            textsadtwo.setVisibility(View.INVISIBLE);
            textsadthree.setVisibility(View.VISIBLE);
            textsadfour.setVisibility(View.INVISIBLE);
            textsadfive.setVisibility(View.INVISIBLE);
            textsadsix.setVisibility(View.INVISIBLE);
            textsadseven.setVisibility(View.INVISIBLE);
            textsadeight.setVisibility(View.INVISIBLE);
            textsadnine.setVisibility(View.INVISIBLE);
        } else if (a == 4) {
            textsadone.setVisibility(View.INVISIBLE);
            textsadtwo.setVisibility(View.INVISIBLE);
            textsadthree.setVisibility(View.INVISIBLE);
            textsadfour.setVisibility(View.VISIBLE);
            textsadfive.setVisibility(View.INVISIBLE);
            textsadsix.setVisibility(View.INVISIBLE);
            textsadseven.setVisibility(View.INVISIBLE);
            textsadeight.setVisibility(View.INVISIBLE);
            textsadnine.setVisibility(View.INVISIBLE);
        } else if (a == 5) {
            textsadone.setVisibility(View.INVISIBLE);
            textsadtwo.setVisibility(View.INVISIBLE);
            textsadthree.setVisibility(View.INVISIBLE);
            textsadfour.setVisibility(View.INVISIBLE);
            textsadfive.setVisibility(View.VISIBLE);
            textsadsix.setVisibility(View.INVISIBLE);
            textsadseven.setVisibility(View.INVISIBLE);
            textsadeight.setVisibility(View.INVISIBLE);
            textsadnine.setVisibility(View.INVISIBLE);
        } else if (a == 6) {
            textsadone.setVisibility(View.INVISIBLE);
            textsadtwo.setVisibility(View.INVISIBLE);
            textsadthree.setVisibility(View.INVISIBLE);
            textsadfour.setVisibility(View.INVISIBLE);
            textsadfive.setVisibility(View.INVISIBLE);
            textsadsix.setVisibility(View.VISIBLE);
            textsadseven.setVisibility(View.INVISIBLE);
            textsadeight.setVisibility(View.INVISIBLE);
            textsadnine.setVisibility(View.INVISIBLE);
        } else if (a == 7) {
            textsadone.setVisibility(View.INVISIBLE);
            textsadtwo.setVisibility(View.INVISIBLE);
            textsadthree.setVisibility(View.INVISIBLE);
            textsadfour.setVisibility(View.INVISIBLE);
            textsadfive.setVisibility(View.INVISIBLE);
            textsadsix.setVisibility(View.INVISIBLE);
            textsadseven.setVisibility(View.VISIBLE);
            textsadeight.setVisibility(View.INVISIBLE);
            textsadnine.setVisibility(View.INVISIBLE);
        } else if (a == 8) {
            textsadone.setVisibility(View.INVISIBLE);
            textsadtwo.setVisibility(View.INVISIBLE);
            textsadthree.setVisibility(View.INVISIBLE);
            textsadfour.setVisibility(View.INVISIBLE);
            textsadfive.setVisibility(View.INVISIBLE);
            textsadsix.setVisibility(View.INVISIBLE);
            textsadseven.setVisibility(View.INVISIBLE);
            textsadeight.setVisibility(View.VISIBLE);
            textsadnine.setVisibility(View.INVISIBLE);
        } else if (a == 9) {
            textsadone.setVisibility(View.INVISIBLE);
            textsadtwo.setVisibility(View.INVISIBLE);
            textsadthree.setVisibility(View.INVISIBLE);
            textsadfour.setVisibility(View.INVISIBLE);
            textsadfive.setVisibility(View.INVISIBLE);
            textsadsix.setVisibility(View.INVISIBLE);
            textsadseven.setVisibility(View.INVISIBLE);
            textsadeight.setVisibility(View.INVISIBLE);
            textsadnine.setVisibility(View.VISIBLE);
        }
    }
}