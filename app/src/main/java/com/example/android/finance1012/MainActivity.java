package com.example.android.finance1012;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int money = 0;
    int cents = 0;
    int cents2 = 0;
    Button minus2;
    TextView text;
    TextView decimal;
    TextView centsOne;
    TextView centsTwo;
    Button add2;
    EditText enterText2;
    EditText enterText3;
    EditText enterText4;
    EditText enterText5;
    Button addCategory;
    Button addCategory2;
    Button addCategory3;
    Button addCategory4;
    Button removeCategory;
    Button removeCategory2;
    Button removeCategory3;
    Button removeCategory4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Sets literally every button and text field
        minus2 = (Button) findViewById(R.id.Minus2);
        text = (TextView) findViewById(R.id.text);
        decimal = (TextView) findViewById(R.id.decimal);
        centsOne = (TextView) findViewById(R.id.cents);
        centsTwo = (TextView) findViewById(R.id.cents2);
        add2 = (Button) findViewById(R.id.add2);
        enterText2 = (EditText) findViewById(R.id.editText2);
        enterText3 = (EditText) findViewById(R.id.editText3);
        enterText4 = (EditText) findViewById(R.id.editText4);
        enterText5 = (EditText) findViewById(R.id.editText5);
        addCategory = (Button) findViewById(R.id.addCategory1);
        addCategory2 = (Button) findViewById(R.id.addCategory2);
        addCategory3 = (Button) findViewById(R.id.addCategory3);
        addCategory4 = (Button) findViewById(R.id.addCategory4);
        removeCategory = (Button) findViewById(R.id.removeCategory);
        removeCategory2 = (Button) findViewById(R.id.removeCategory2);
        removeCategory3 = (Button) findViewById(R.id.removeCategory3);
        removeCategory4 = (Button) findViewById(R.id.removeCategory4);
    }

    public void increment(View view) {
        money = money + 1;
        display(money);
    }

    public void decrement(View view) {
        money = money - 1;
        display(money);
    }

    public void increment2(View view) {
        cents2 = cents2 + 1;
        if (cents2 == 99) {
            Toast.makeText(this, "You can't have more than 99 cents!", Toast.LENGTH_SHORT).show();
        }
        display3(cents2);
        decimal.setVisibility(View.GONE);

    }

    public void decrement2(View view) {
        cents2 = cents2 - 1;
        if (cents2 == 0) {
            Toast.makeText(this, "You can't have less than 0 cents!", Toast.LENGTH_SHORT).show();
        }

        display3(cents2);
    }

    public void options(View view) {
        minus2.setVisibility(View.VISIBLE);
        text.setVisibility(View.VISIBLE);
        add2.setVisibility(View.VISIBLE);
    }

    public void addCategory1(View view) {
        enterText2.setVisibility(View.VISIBLE);
        addCategory2.setVisibility(View.VISIBLE);
        removeCategory.setVisibility(View.VISIBLE);
        addCategory.setVisibility(View.GONE);
    }

    public void addCategory2(View view) {
        enterText3.setVisibility(View.VISIBLE);
        addCategory3.setVisibility(View.VISIBLE);
        removeCategory2.setVisibility(View.VISIBLE);
        addCategory2.setVisibility(View.GONE);
        removeCategory.setVisibility(View.GONE);
    }

    public void addCategory3(View view) {
        enterText4.setVisibility(View.VISIBLE);
        addCategory4.setVisibility(View.VISIBLE);
        removeCategory3.setVisibility(View.VISIBLE);
        addCategory3.setVisibility(View.GONE);
        removeCategory2.setVisibility(View.GONE);
    }

    public void addCategory4(View view) {
        enterText5.setVisibility(View.VISIBLE);
        removeCategory4.setVisibility(View.VISIBLE);
        addCategory4.setVisibility(View.GONE);
        removeCategory3.setVisibility(View.GONE);
    }

    public void removeCategory1(View view) {
        enterText2.setVisibility(View.GONE);
        addCategory2.setVisibility(View.GONE);
        removeCategory.setVisibility(View.GONE);
        addCategory.setVisibility(View.VISIBLE);
    }

    public void removeCategory2(View view) {
        enterText3.setVisibility(View.GONE);
        addCategory3.setVisibility(View.GONE);
        removeCategory2.setVisibility(View.GONE);
        addCategory2.setVisibility(View.VISIBLE);
        removeCategory.setVisibility(View.VISIBLE);
    }

    public void removeCategory3(View view) {
        enterText4.setVisibility(View.GONE);
        addCategory4.setVisibility(View.GONE);
        removeCategory3.setVisibility(View.GONE);
        addCategory3.setVisibility(View.VISIBLE);
        removeCategory2.setVisibility(View.VISIBLE);
    }

    public void removeCategory4(View view) {
        enterText5.setVisibility(View.GONE);
        removeCategory4.setVisibility(View.GONE);
        addCategory4.setVisibility(View.VISIBLE);
        removeCategory3.setVisibility(View.VISIBLE);
    }

    private void display(int money) {
        TextView moneyTextView = (TextView) findViewById(R.id.money);
        moneyTextView.setText("$" + money);
    }

    private void display3(int cents2) {
        TextView moneyTwoTextView = (TextView) findViewById(R.id.cents2);
        moneyTwoTextView.setText("" + cents2);
    }
}