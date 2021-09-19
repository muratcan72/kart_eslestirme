package com.example.karteslestirme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    String happystate, sadstate, tiredstate, angrystate, wearyofstate;
    Button buttonstate1, buttonstate2, buttonstate3, buttonstate4, buttonstate5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonstate1 = (Button) findViewById(R.id.butonstate1);
        buttonstate2 = (Button) findViewById(R.id.butonstate2);
        buttonstate3 = (Button) findViewById(R.id.butonstate3);
        buttonstate4 = (Button) findViewById(R.id.butonstate4);
        buttonstate5 = (Button) findViewById(R.id.butonstate5);

        buttonstate1.setOnClickListener(new View.OnClickListener() { // mutlu butonuna basınca happy activitysine geçecek.
            @Override
            public void onClick(View view) {
                happystate = buttonstate1.getText().toString();
                Intent i = new Intent(MainActivity.this, happy.class);
                i.putExtra("happystate", happystate);
                startActivity(i);
            }
        });

        buttonstate2.setOnClickListener(new View.OnClickListener() { // üzgün butonuna basınca sad activitysine geçecek.
            @Override
            public void onClick(View view) {
                sadstate = buttonstate2.getText().toString();
                Intent i = new Intent(MainActivity.this, sad.class);
                i.putExtra("sadstate", sadstate);
                startActivity(i);
            }
        });

        buttonstate3.setOnClickListener(new View.OnClickListener() { // yorgun butonuna basınca tired activitysine geçecek.
            @Override
            public void onClick(View view) {
                tiredstate = buttonstate3.getText().toString();
                Intent i = new Intent(MainActivity.this, tired.class);
                i.putExtra("tiredstate", tiredstate);
                startActivity(i);
            }
        });

        buttonstate4.setOnClickListener(new View.OnClickListener() { // sinirli butonuna basınca angry activitysine geçecek.
            @Override
            public void onClick(View view) {
                angrystate = buttonstate4.getText().toString();
                Intent i = new Intent(MainActivity.this, angry.class);
                i.putExtra("angrystate", angrystate);
                startActivity(i);
            }
        });

        buttonstate5.setOnClickListener(new View.OnClickListener() { // bıkmış butonuna basınca wearyof activitysine geçecek.
            @Override
            public void onClick(View view) {
                wearyofstate = buttonstate5.getText().toString();
                Intent i = new Intent(MainActivity.this, wearyof.class);
                i.putExtra("wearyofstate", wearyofstate);
                startActivity(i);
            }
        });
    }
}