package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Dboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dboard);
        Toast.makeText(Dboard.this,"DashBoard",Toast.LENGTH_SHORT).show();
    }
    public void logout (View v)
    {
        Intent logout=new Intent(Dboard.this,MainActivity.class);
        startActivity(logout);
    }
    public void info(View V)
    {
        Intent info=new Intent(Dboard.this,User.class);
        startActivity(info);
    }
    public void Min(View v)
    {
        Intent min=new Intent(Dboard.this,Min.class);
        startActivity(min);
    }
    public void show(View v)
    {
        Intent min=new Intent(Dboard.this,Slide.class);
        startActivity(min);
    }

}
