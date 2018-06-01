package com.example.android.finance1012;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Finance101Part2 extends AppCompatActivity {

    int
    Button subtracting1;
    Button adding1;
    Button subtracting2;
    Button adding2;
    Button subtracting3;
    Button adding3;
    Button subtracting4;
    Button adding4;
    Button subtracting5;
    Button adding5;
    Button previous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finance101_part2);
        subtracting1 = (Button) findViewById(R.id.subtracting1);
        adding1 = (Button) findViewById(R.id.adding1);
        subtracting2 = (Button) findViewById(R.id.subtracting2);
        adding2 = (Button) findViewById(R.id.adding2);
        subtracting3 = (Button) findViewById(R.id.subtracting3);
        adding3 = (Button) findViewById(R.id.adding3);
        subtracting4 = (Button) findViewById(R.id.subtracting4);
        adding4 = (Button) findViewById(R.id.adding4);
        subtracting5 = (Button) findViewById(R.id.subtracting5);
        adding5 = (Button) findViewById(R.id.adding5);
        previous = (Button) findViewById(R.id.previous);
    }

    public void addition1(View view) {

    }

    public void previous(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
