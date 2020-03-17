package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Min extends AppCompatActivity {
    private EditText e1;
    private EditText e2;
    private TextView t1;
    private TextView t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_min);
        e1 = (EditText) findViewById(R.id.e1);
        e2 = (EditText) findViewById(R.id.e2);
        t1 = (TextView) findViewById(R.id.t1);
        t2 = (TextView) findViewById(R.id.t2);
    }

    public void Cal1(View v) {
        double i1 = Double.parseDouble(e1.getText().toString());
        double i2 = Double.parseDouble(e2.getText().toString());
        if (i1 > i2) {
            t1.setText("Max:" + Double.toString(i1) + " " + "Min:" + Double.toString(i2));
        } else {
            t1.setText("Max:" + Double.toString(i2) + " " + "Min:" + Double.toString(i1));
        }
    }

    public void Cal2(View v) {
        double i1 = Double.parseDouble(e1.getText().toString());
        double i2 = Double.parseDouble(e2.getText().toString());
        if (i1 % 2 != 0 && i2%2 == 0) {
            t2.setText("Odd:" + Double.toString(i1) + " " + "Even:" + Double.toString(i2));
        }
        else if(i1 % 2 == 0 && i2%2 != 0)
            {
                t2.setText("Even:"+Double.toString(i1)+" "+"Odd:"+Double.toString(i2));
            }
        else if(i1 % 2 == 0 && i2%2 == 0)
        {
            t2.setText("Even:"+Double.toString(i1)+" "+"Even:"+Double.toString(i2));
        }
        else if(i1 % 2 != 0 && i2%2 != 0)
        {
            t2.setText("Odd:"+Double.toString(i1)+" "+"Odd:"+Double.toString(i2));
        }
    }
}
