package com.example.android.taboss;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupCalcButton();
        setupMyTabButton();
    }
                                                //"Tab" application main functionality, takes user through to calculate individual party totals
    private void setupCalcButton(){
        Button newCalcButton = (Button) findViewById(R.id.calcButton);
        newCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, PartyActivity.class));
            }
        });
    }
                                                //"MyTab" not yet set up, clicking the button will cause the app to crash
    private void setupMyTabButton(){
        Button myTabButton = (Button) findViewById(R.id.myTabButton);
        myTabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MyTabActivity.class));
            }
        });
    }
}
