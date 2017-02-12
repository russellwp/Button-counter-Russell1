package com.example.william.button_counter_russell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button clear_Button;
    private Button subtract_Button;
    private Button add_Button;

    public int count;
    public String textCount = Integer.toString(count);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = 0;
        TextView tv = (TextView)findViewById(R.id.countText);
        tv.setText(Integer.toString(count));
        tv.setVisibility(View.VISIBLE);

        clear_Button = (Button)findViewById(R.id.clearButton);
        clear_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                textCount = Integer.toString(count);
                TextView tv = (TextView)findViewById(R.id.countText);
                tv.setText(Integer.toString(count));
                tv.setVisibility(View.VISIBLE);
            }
        });

        subtract_Button = (Button)findViewById(R.id.subtractButton);
        subtract_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = count - 1;
                textCount = Integer.toString(count);
                TextView tv = (TextView)findViewById(R.id.countText);
                tv.setText(Integer.toString(count));
                tv.setVisibility(View.VISIBLE);
            }
        });

        add_Button = (Button)findViewById(R.id.addButton);
        add_Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                count = count + 1;
                textCount = Integer.toString(count);
                TextView tv = (TextView)findViewById(R.id.countText);
                tv.setText(Integer.toString(count));
                tv.setVisibility(View.VISIBLE);
            }
        });

    }
}
