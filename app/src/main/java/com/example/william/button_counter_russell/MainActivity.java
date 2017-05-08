package com.example.william.button_counter_russell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button one_button, two_button, three_button, four_button, five_button, six_button, seven_button, eight_button, nine_button, zero_button;
    private Button add_button, subtract_button, multiply_button, divide_button, clear_button, CE_button, equal_button;
    TextView disp;
    float num1;
    float num2;
    String textNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one_button = (Button) findViewById(R.id.oneButton);
        two_button = (Button) findViewById(R.id.twoButton);
        three_button = (Button) findViewById(R.id.threeButton);
        four_button = (Button) findViewById(R.id.fourButton);
        five_button = (Button) findViewById(R.id.fiveButton);
        six_button = (Button) findViewById(R.id.sixButton);
        seven_button = (Button) findViewById(R.id.sevenButton);
        eight_button = (Button) findViewById(R.id.eightButton);
        nine_button = (Button) findViewById(R.id.nineButton);
        zero_button = (Button) findViewById(R.id.zeroButton);
        add_button = (Button) findViewById(R.id.addButton);
        subtract_button = (Button) findViewById(R.id.subtractButton);
        multiply_button = (Button) findViewById(R.id.multiplyButton);
        divide_button = (Button) findViewById(R.id.divideButton);
        clear_button = (Button) findViewById(R.id.clearButton);
        CE_button = (Button) findViewById(R.id.CEButton);
        equal_button = (Button) findViewById(R.id.equalsButton);

        disp = (TextView) findViewById(R.id.calculated_value);

        one_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = disp.getText().toString();
                value = value + "1";
                disp.setText(value);
                disp.setVisibility(View.VISIBLE);
            }

        });

        two_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = disp.getText().toString();
                value = value + "2";
                disp.setText(value);
                disp.setVisibility(View.VISIBLE);
            }

        });

        three_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = disp.getText().toString();
                value = value + "3";
                disp.setText(value);
                disp.setVisibility(View.VISIBLE);
            }

        });

        four_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = disp.getText().toString();
                value = value + "4";
                disp.setText(value);
                disp.setVisibility(View.VISIBLE);
            }

        });

        five_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = disp.getText().toString();
                value = value + "5";
                disp.setText(value);
                disp.setVisibility(View.VISIBLE);
            }

        });

        six_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = disp.getText().toString();
                value = value + "6";
                disp.setText(value);
                disp.setVisibility(View.VISIBLE);
            }

        });

        seven_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = disp.getText().toString();
                value = value + "7";
                disp.setText(value);
                disp.setVisibility(View.VISIBLE);
            }

        });

        eight_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = disp.getText().toString();
                value = value + "8";
                disp.setText(value);
                disp.setVisibility(View.VISIBLE);
            }

        });

        nine_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = disp.getText().toString();
                value = value + "9";
                disp.setText(value);
                disp.setVisibility(View.VISIBLE);
            }

        });

        zero_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = disp.getText().toString();
                value = value + "0";
                disp.setText(value);
                disp.setVisibility(View.VISIBLE);
            }

        });

        clear_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                disp.setText("");
                disp.setVisibility(View.VISIBLE);
            }
        });

        CE_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                disp.setText("");
                disp.setVisibility(View.VISIBLE);
            }
        });

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = disp.getText().toString();

                Intent i = new Intent(v.getContext(), addition.class);
                Bundle bundle = i.getExtras();
                bundle.putString("value",value);
            }

        });
    }
}
