package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"Log In",Toast.LENGTH_SHORT).show();
    }
    public void login(View v)
    {
        Intent login=new Intent(MainActivity.this,Dboard.class);
        startActivity(login);
    }

}
