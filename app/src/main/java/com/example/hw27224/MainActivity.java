package com.example.hw27224;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    int toggleTrue = 0;
    int switchTrue = 0;
    Button btn;
    Switch sw;
    ToggleButton td;
    ConstraintLayout cons;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        td = (ToggleButton) findViewById(R.id.toggleButton);
        sw = (Switch) findViewById(R.id.switch1);
        btn = findViewById(R.id.button);
        cons = (ConstraintLayout) findViewById(R.id.back);



    }

    public void toggled(View view)
    {
        if (td.isChecked())
        {
            toggleTrue = 1;
        }
        else
        {
            toggleTrue = 0;
        }
    }

    public void clicked(View view)
    {
        if (sw.isChecked())
        {
            switchTrue =1;
        }
        else
        {
            switchTrue = 0;
        }

    }

    public void button(View view)
    {
        if (switchTrue == 1 && toggleTrue == 1)
        {
            cons.setBackgroundColor(Color.BLUE);
        }
        else if (switchTrue == 0 && toggleTrue == 1)
        {
            cons.setBackgroundColor(Color.YELLOW);
        }
        else if (switchTrue == 1 && toggleTrue == 0)
        {
            cons.setBackgroundColor(Color.GREEN);
        }
        else
        {
            cons.setBackgroundColor(Color.RED);
        }
    }
}