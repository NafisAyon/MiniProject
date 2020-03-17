package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Slide extends AppCompatActivity {
    private ImageView i1, i2, i3, i4, i5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);
        Toast.makeText(Slide.this,"SLIDE SHOW",Toast.LENGTH_SHORT).show();
        i1 = (ImageView) findViewById(R.id.i1);
        i2 = (ImageView) findViewById(R.id.i2);
        i3 = (ImageView) findViewById(R.id.i3);
        i4 = (ImageView) findViewById(R.id.i4);
        i5 = (ImageView) findViewById(R.id.i5);
    }

    public void show(View v) {
        if (v.getId() == R.id.i1)
        {
            i1.setVisibility(View.GONE);
            i2.setVisibility(View.VISIBLE);
        }
        else if(v.getId()==R.id.i2)
        {
            i2.setVisibility(View.GONE);
            i3.setVisibility(View.VISIBLE);
        }
        else if(v.getId()==R.id.i3)
        {
        i3.setVisibility(View.GONE);
        i4.setVisibility(View.VISIBLE);

        }
        else if(v.getId()==R.id.i4)
        {
            i4.setVisibility(View.GONE);
            i5.setVisibility(View.VISIBLE);
        }
        else if(v.getId()==R.id.i5)
        {
            i5.setVisibility(View.GONE);
            i1.setVisibility(View.VISIBLE);
        }
    }
}
