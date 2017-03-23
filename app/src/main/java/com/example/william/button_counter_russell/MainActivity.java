package com.example.william.button_counter_russell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button clear_Button;
    private Button CE_Button;
    private Button subtract_Button;
    private Button add_Button;
    private Button multiply_Button;
    private Button divide_Button;
    private Button one_Button;
    private Button two_Button;
    private Button three_Button;
    private Button four_Button;
    private Button five_Button;
    private Button six_Button;
    private Button seven_Button;
    private Button eigth_Button;
    private Button nine_Button;
    private Button zero_Button;


    public double count;
    public double count2;
    public double result;
    public String numCount;
    public String textCount = Double.toString(count);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = 0;
        TextView tv = (TextView)findViewById(R.id.countText);
        tv.setText(Double.toString(count));
        tv.setVisibility(View.VISIBLE);

        clear_Button = (Button)findViewById(R.id.clearButton);
        clear_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                textCount = Double.toString(count);
                TextView tv = (TextView)findViewById(R.id.countText);
                tv.setText(Double.toString(count));
                tv.setVisibility(View.VISIBLE);
            }
        });

        CE_Button = (Button)findViewById(R.id.CEButton);
        CE_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 1;
                textCount = Double.toString(count);
                TextView tv = (TextView)findViewById(R.id.countText);
                tv.setText(Double.toString(count));
                tv.setVisibility(View.VISIBLE);
            }
        });

        subtract_Button = (Button)findViewById(R.id.subtractButton);
        subtract_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = count - 1;
                textCount = Double.toString(count);
                TextView tv = (TextView)findViewById(R.id.countText);
                tv.setText(Double.toString(count));
                tv.setVisibility(View.VISIBLE);
            }
        });

        add_Button = (Button)findViewById(R.id.addButton);
        add_Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                count = count + 1;
                textCount = Double.toString(count);
                TextView tv = (TextView)findViewById(R.id.countText);
                tv.setText(Double.toString(count));
                tv.setVisibility(View.VISIBLE);
            }
        });

        multiply_Button = (Button)findViewById(R.id.multiplyButton);
        multiply_Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                count = count * 2;
                textCount = Double.toString(count);
                TextView tv = (TextView)findViewById(R.id.countText);
                tv.setText(Double.toString(count));
                tv.setVisibility(View.VISIBLE);
            }
        });

        divide_Button = (Button)findViewById(R.id.divideButton);
        divide_Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                count = count / 2;
                textCount = Double.toString(count);
                TextView tv = (TextView)findViewById(R.id.countText);
                tv.setText(Double.toString(count));
                tv.setVisibility(View.VISIBLE);
            }
        });

        one_Button = (Button)findViewById(R.id.oneButton);
        one_Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                numCount = Double.toString(count);
                int x = numCount.length();
                char y = '1';
                numCount = numCount + y;
                /*textCount = Double.toString(count);*/
                TextView tv = (TextView)findViewById(R.id.countText);
                tv.setText(numCount);
                tv.setVisibility(View.VISIBLE);
            }
        });

        two_Button = (Button)findViewById(R.id.twoButton);
        two_Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                numCount = Double.toString(count);
                int x = numCount.length();
                char y = '2';
                numCount = numCount + y;
                /*textCount = Double.toString(count);*/
                TextView tv = (TextView)findViewById(R.id.countText);
                tv.setText(numCount);
                tv.setVisibility(View.VISIBLE);
            }
        });

        }
}
