package com.example.android.finance1012;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int money = 0;
    int cents = 0;
    int cents2 = 0;
    Spinner spinner1;
    Spinner spinner2;
    Spinner spinner3;
    Spinner spinner4;
    Spinner spinner5;
    ArrayAdapter<CharSequence> adapter;
    TextView text;
    TextView decimal;
    TextView centsOne;
    TextView centsTwo;
    TextView text2;
    Button add2;
    Button minus2;
    Button add3;
    Button minus3;
    Button removeCents;
    Button addCategory;
    Button addCategory2;
    Button addCategory3;
    Button addCategory4;
    Button removeCategory;
    Button removeCategory2;
    Button removeCategory3;
    Button removeCategory4;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Provides the Drop box Spinners with an id
        spinner1 = (Spinner) findViewById(R.id.spinnerOne);
        spinner2 = (Spinner) findViewById(R.id.spinnerTwo);
        spinner3 = (Spinner) findViewById(R.id.spinnerThree);
        spinner4 = (Spinner) findViewById(R.id.spinnerFour);
        spinner5 = (Spinner) findViewById(R.id.spinnerFive);

        // Sets up the first Spinner/Drop box
        adapter = ArrayAdapter.createFromResource(this, R.array.Categories, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " selected", Toast.LENGTH_LONG).show();
                ((TextView) parent.getChildAt(0)).setTextColor(Color.DKGRAY);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        // Sets up the second Spinner/Drop box
        spinner2.setAdapter(adapter);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " selected", Toast.LENGTH_LONG).show();
                ((TextView) parent.getChildAt(0)).setTextColor(Color.DKGRAY);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        // Sets up the third Spinner/Drop box
        spinner3.setAdapter(adapter);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " selected", Toast.LENGTH_LONG).show();
                ((TextView) parent.getChildAt(0)).setTextColor(Color.DKGRAY);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        // Sets up the fourth Spinner/Drop box
        spinner4.setAdapter(adapter);
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " selected", Toast.LENGTH_LONG).show();
                ((TextView) parent.getChildAt(0)).setTextColor(Color.DKGRAY);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        // Sets up the fifth Spinner/Drop box
        spinner5.setAdapter(adapter);
        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " selected", Toast.LENGTH_LONG).show();
                ((TextView) parent.getChildAt(0)).setTextColor(Color.DKGRAY);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //Sets literally every button and text field
        minus2 = (Button) findViewById(R.id.Minus2);
        minus3 = (Button) findViewById(R.id.Minus3);
        text = (TextView) findViewById(R.id.text);
        decimal = (TextView) findViewById(R.id.decimal);
        centsOne = (TextView) findViewById(R.id.cents);
        centsTwo = (TextView) findViewById(R.id.cents2);
        add2 = (Button) findViewById(R.id.add2);
        add3 = (Button) findViewById(R.id.add3);
        text2 = (TextView) findViewById(R.id.text2);
        removeCents = (Button) findViewById(R.id.removeCents);
        addCategory = (Button) findViewById(R.id.addCategory1);
        addCategory2 = (Button) findViewById(R.id.addCategory2);
        addCategory3 = (Button) findViewById(R.id.addCategory3);
        addCategory4 = (Button) findViewById(R.id.addCategory4);
        removeCategory = (Button) findViewById(R.id.removeCategory);
        removeCategory2 = (Button) findViewById(R.id.removeCategory2);
        removeCategory3 = (Button) findViewById(R.id.removeCategory3);
        removeCategory4 = (Button) findViewById(R.id.removeCategory4);
        next = (Button) findViewById(R.id.next);
    }

    // Add dollars (not cents) to the overall money counter
    public void increment(View view) {
        money = money + 1;
        display(money);
    }

    // Subtracts dollars (not cents) to the overall money counter
    public void decrement(View view) {
        money = money - 1;
        display(money);
    }

    // Adds cents (not dollars) to the overall money counter
    public void increment2(View view) {
        if (cents2 >= 9) {
            centsOne.setVisibility(View.GONE);
        }

        if (cents2 <= 8) {
            centsOne.setVisibility(View.VISIBLE);
        }
        if (cents2 == 99) {
            Toast.makeText(this, "You can't have more than 99 cents!", Toast.LENGTH_SHORT).show();
            return;
        }
        cents2 = cents2 + 1;
        display3(cents2);
    }

    // Subtracts cents (not dollars) to the overall money counter
    public void decrement2(View view) {
        if (cents2 >= 9) {
            centsOne.setVisibility(View.GONE);
        }

        if (cents2 <= 10) {
            centsOne.setVisibility(View.VISIBLE);
        }
        if (cents2 == 0) {
            Toast.makeText(this, "You can't have less than 0 cents!", Toast.LENGTH_SHORT).show();
            return;
        }
        cents2 = cents2 - 1;
        display3(cents2);
    }

    // Provides the user an option to add $5 at a time as opposed to one
    public void increment3(View view) {
        money = money + 5;
        display(money);
    }

    // Provides the user an option to subtract $5 at a time as opposed to one
    public void decrement3(View view) {
        money = money - 5;
        display(money);
    }

    // Takes the user to the next screen of the app
    public void next(View view) {
        Intent intent = new Intent(this, Finance101Part2.class);
        startActivity(intent);
    }

    // Shows the user the options of adding/subtracting cents and $5
    public void options(View view) {
        minus2.setVisibility(View.VISIBLE);
        text.setVisibility(View.VISIBLE);
        add2.setVisibility(View.VISIBLE);
        minus3.setVisibility(View.VISIBLE);
        text2.setVisibility(View.VISIBLE);
        add3.setVisibility(View.VISIBLE);
        removeCents.setVisibility(View.VISIBLE);
    }

    public void removeOptions(View view) {
        minus2.setVisibility(View.GONE);
        text.setVisibility(View.GONE);
        add2.setVisibility(View.GONE);
        minus3.setVisibility(View.GONE);
        text2.setVisibility(View.GONE);
        add3.setVisibility(View.GONE);
        removeCents.setVisibility(View.GONE);
    }

    public void addCategory1(View view) {
        spinner2.setVisibility(View.VISIBLE);
        addCategory2.setVisibility(View.VISIBLE);
        removeCategory.setVisibility(View.VISIBLE);
        addCategory.setVisibility(View.INVISIBLE);
    }

    public void addCategory2(View view) {
        spinner3.setVisibility(View.VISIBLE);
        addCategory3.setVisibility(View.VISIBLE);
        removeCategory2.setVisibility(View.VISIBLE);
        addCategory2.setVisibility(View.INVISIBLE);
        removeCategory.setVisibility(View.INVISIBLE);
    }

    public void addCategory3(View view) {
        spinner4.setVisibility(View.VISIBLE);
        addCategory4.setVisibility(View.VISIBLE);
        removeCategory3.setVisibility(View.VISIBLE);
        addCategory3.setVisibility(View.INVISIBLE);
        removeCategory2.setVisibility(View.INVISIBLE);
    }

    public void addCategory4(View view) {
        spinner5.setVisibility(View.VISIBLE);
        removeCategory4.setVisibility(View.VISIBLE);
        addCategory4.setVisibility(View.INVISIBLE);
        removeCategory3.setVisibility(View.INVISIBLE);
    }

    public void removeCategory1(View view) {
        spinner2.setVisibility(View.INVISIBLE);
        addCategory2.setVisibility(View.INVISIBLE);
        removeCategory.setVisibility(View.INVISIBLE);
        addCategory.setVisibility(View.VISIBLE);
    }

    public void removeCategory2(View view) {
        spinner3.setVisibility(View.INVISIBLE);
        addCategory3.setVisibility(View.INVISIBLE);
        removeCategory2.setVisibility(View.INVISIBLE);
        addCategory2.setVisibility(View.VISIBLE);
        removeCategory.setVisibility(View.VISIBLE);
    }

    public void removeCategory3(View view) {
        spinner4.setVisibility(View.INVISIBLE);
        addCategory4.setVisibility(View.INVISIBLE);
        removeCategory3.setVisibility(View.INVISIBLE);
        addCategory3.setVisibility(View.VISIBLE);
        removeCategory2.setVisibility(View.VISIBLE);
    }

    public void removeCategory4(View view) {
        spinner5.setVisibility(View.INVISIBLE);
        removeCategory4.setVisibility(View.INVISIBLE);
        addCategory4.setVisibility(View.VISIBLE);
        removeCategory3.setVisibility(View.VISIBLE);
    }

    private void display(int money) {
        TextView moneyTextView = (TextView) findViewById(R.id.money);
        moneyTextView.setText("$" + money);
    }

    private void display3(int cents2) {
        TextView centsTwoTextView = (TextView) findViewById(R.id.cents2);
        centsTwoTextView.setText("" + cents2);
    }
}