package com.example.karteslestirme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class tired extends AppCompatActivity {

    String state;

    Button tiredbuton;
    TextView texttiredstate, texttiredone, texttiredtwo, texttiredthree, texttiredfour, texttiredfive, texttiredsix, texttiredseven, texttiredeight, texttirednine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sad);

        texttiredstate = (TextView) findViewById(R.id.texttiredstate);
        texttiredone = (TextView) findViewById(R.id.texttiredone);
        texttiredtwo = (TextView) findViewById(R.id.texttiredtwo);
        texttiredthree = (TextView) findViewById(R.id. texttiredthree);
        texttiredfour = (TextView) findViewById(R.id.texttiredfour);
        texttiredfive = (TextView) findViewById(R.id.texttiredfive);
        texttiredsix = (TextView) findViewById(R.id.texttiredsix);
        texttiredseven = (TextView) findViewById(R.id.texttiredseven);
        texttiredeight = (TextView) findViewById(R.id.texttiredeight);
        texttirednine = (TextView) findViewById(R.id.texttirednine);


        tiredbuton = (Button) findViewById(R.id.tiredbutton);


        Intent i = getIntent();
        state = i.getStringExtra("tiredstate");
        texttiredstate.setText(state);

        tiredbuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = (int) (Math.random()*10+1);
                show(number);
            }
        });

    }

    public void show(int a) {
        if (a == 1) {
            texttiredone.setVisibility(View.VISIBLE);
            texttiredtwo.setVisibility(View.INVISIBLE);
            texttiredthree.setVisibility(View.INVISIBLE);
            texttiredfour.setVisibility(View.INVISIBLE);
            texttiredfive.setVisibility(View.INVISIBLE);
            texttiredsix.setVisibility(View.INVISIBLE);
            texttiredseven.setVisibility(View.INVISIBLE);
            texttiredeight.setVisibility(View.INVISIBLE);
            texttirednine.setVisibility(View.INVISIBLE);
        } else if (a == 2) {
            texttiredone.setVisibility(View.INVISIBLE);
            texttiredtwo.setVisibility(View.VISIBLE);
            texttiredthree.setVisibility(View.INVISIBLE);
            texttiredfour.setVisibility(View.INVISIBLE);
            texttiredfive.setVisibility(View.INVISIBLE);
            texttiredsix.setVisibility(View.INVISIBLE);
            texttiredseven.setVisibility(View.INVISIBLE);
            texttiredeight.setVisibility(View.INVISIBLE);
            texttirednine.setVisibility(View.INVISIBLE);
        } else if (a == 3) {
            texttiredone.setVisibility(View.INVISIBLE);
            texttiredtwo.setVisibility(View.INVISIBLE);
            texttiredthree.setVisibility(View.VISIBLE);
            texttiredfour.setVisibility(View.INVISIBLE);
            texttiredfive.setVisibility(View.INVISIBLE);
            texttiredsix.setVisibility(View.INVISIBLE);
            texttiredseven.setVisibility(View.INVISIBLE);
            texttiredeight.setVisibility(View.INVISIBLE);
            texttirednine.setVisibility(View.INVISIBLE);
        } else if (a == 4) {
            texttiredone.setVisibility(View.INVISIBLE);
            texttiredtwo.setVisibility(View.INVISIBLE);
            texttiredthree.setVisibility(View.INVISIBLE);
            texttiredfour.setVisibility(View.VISIBLE);
            texttiredfive.setVisibility(View.INVISIBLE);
            texttiredsix.setVisibility(View.INVISIBLE);
            texttiredseven.setVisibility(View.INVISIBLE);
            texttiredeight.setVisibility(View.INVISIBLE);
            texttirednine.setVisibility(View.INVISIBLE);
        } else if (a == 5) {
            texttiredone.setVisibility(View.INVISIBLE);
            texttiredtwo.setVisibility(View.INVISIBLE);
            texttiredthree.setVisibility(View.INVISIBLE);
            texttiredfour.setVisibility(View.INVISIBLE);
            texttiredfive.setVisibility(View.VISIBLE);
            texttiredsix.setVisibility(View.INVISIBLE);
            texttiredseven.setVisibility(View.INVISIBLE);
            texttiredeight.setVisibility(View.INVISIBLE);
            texttirednine.setVisibility(View.INVISIBLE);
        } else if (a == 6) {
            texttiredone.setVisibility(View.INVISIBLE);
            texttiredtwo.setVisibility(View.INVISIBLE);
            texttiredthree.setVisibility(View.INVISIBLE);
            texttiredfour.setVisibility(View.INVISIBLE);
            texttiredfive.setVisibility(View.INVISIBLE);
            texttiredsix.setVisibility(View.VISIBLE);
            texttiredseven.setVisibility(View.INVISIBLE);
            texttiredeight.setVisibility(View.INVISIBLE);
            texttirednine.setVisibility(View.INVISIBLE);
        } else if (a == 7) {
            texttiredone.setVisibility(View.INVISIBLE);
            texttiredtwo.setVisibility(View.INVISIBLE);
            texttiredthree.setVisibility(View.INVISIBLE);
            texttiredfour.setVisibility(View.INVISIBLE);
            texttiredfive.setVisibility(View.INVISIBLE);
            texttiredsix.setVisibility(View.INVISIBLE);
            texttiredseven.setVisibility(View.VISIBLE);
            texttiredeight.setVisibility(View.INVISIBLE);
            texttirednine.setVisibility(View.INVISIBLE);
        } else if (a == 8) {
            texttiredone.setVisibility(View.INVISIBLE);
            texttiredtwo.setVisibility(View.INVISIBLE);
            texttiredthree.setVisibility(View.INVISIBLE);
            texttiredfour.setVisibility(View.INVISIBLE);
            texttiredfive.setVisibility(View.INVISIBLE);
            texttiredsix.setVisibility(View.INVISIBLE);
            texttiredseven.setVisibility(View.INVISIBLE);
            texttiredeight.setVisibility(View.VISIBLE);
            texttirednine.setVisibility(View.INVISIBLE);
        } else if (a == 9) {
            texttiredone.setVisibility(View.INVISIBLE);
            texttiredtwo.setVisibility(View.INVISIBLE);
            texttiredthree.setVisibility(View.INVISIBLE);
            texttiredfour.setVisibility(View.INVISIBLE);
            texttiredfive.setVisibility(View.INVISIBLE);
            texttiredsix.setVisibility(View.INVISIBLE);
            texttiredseven.setVisibility(View.INVISIBLE);
            texttiredeight.setVisibility(View.INVISIBLE);
            texttirednine.setVisibility(View.VISIBLE);
        }
    }
}