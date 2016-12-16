package com.example.android.taboss;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TabHost;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyTabActivity extends Activity {

    Context context;
    final String FILE_NAME = context.getFilesDir() + "/" + "MyTab_Totals.txt";
    TextView name1, name2, name3, name4, name5, name6, name7, name8;
    TextView total1, total2, total3, total4, total5, total6, total7, total8;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mytab_activity);

        name1 = (TextView) findViewById(R.id.MyTabName1);
        name2 = (TextView) findViewById(R.id.MyTabName2);
        name3 = (TextView) findViewById(R.id.MyTabName3);
        name4 = (TextView) findViewById(R.id.MyTabName4);
        name5 = (TextView) findViewById(R.id.MyTabName5);
        name6 = (TextView) findViewById(R.id.MyTabName6);
        name7 = (TextView) findViewById(R.id.MyTabName7);
        name8 = (TextView) findViewById(R.id.MyTabName8);

        total1 = (TextView) findViewById(R.id.MyTabTotal1);
        total2 = (TextView) findViewById(R.id.MyTabTotal2);
        total3 = (TextView) findViewById(R.id.MyTabTotal3);
        total4 = (TextView) findViewById(R.id.MyTabTotal4);
        total5 = (TextView) findViewById(R.id.MyTabTotal5);
        total6 = (TextView) findViewById(R.id.MyTabTotal6);
        total7 = (TextView) findViewById(R.id.MyTabTotal7);
        total8 = (TextView) findViewById(R.id.MyTabTotal8);


        TabHost tabHost = (TabHost) findViewById(R.id.MyTabHost);
        tabHost.setup();

        setupHomeButton();
        readFile();

        TabHost.TabSpec tabSpec = tabHost.newTabSpec("MyTab");
        tabSpec.setContent(R.id.MyTab);
        tabSpec.setIndicator("MyTab");
        tabHost.addTab(tabSpec);
    }

    private void setupHomeButton() {
        Button homeBtn = (Button) findViewById(R.id.MyTabHomeBtn);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void setupEditBtn() {
        Button homeBtn = (Button) findViewById(R.id.editMyTabBtn);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void readFile(){
        try {
            String entry;
            FileInputStream fileInputStream = openFileInput(FILE_NAME);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuffer stringBuffer = new StringBuffer();
            while((entry = bufferedReader.readLine()) != null){
                if (name1 == null)
                    name1.setText(entry.toString());
                else if (total1 == null)
                    total1.setText(entry.toString());
                else if (name2 == null)
                    name2.setText(entry.toString());
                else if (total2 == null)
                    total2.setText(entry.toString());
                else if (name3 == null)
                    name3.setText(entry.toString());
                else if (total3 == null)
                    total3.setText(entry.toString());
                else if (name4 == null)
                    name4.setText(entry.toString());
                else if (total4 == null)
                    total4.setText(entry.toString());
                else if (name5 == null)
                    name5.setText(entry.toString());
                else if (total5 == null)
                    total5.setText(entry.toString());
                else if (name6 == null)
                    name6.setText(entry.toString());
                else if (total6 == null)
                    total6.setText(entry.toString());
                else if (name7 == null)
                    name7.setText(entry.toString());
                else if (total7 == null)
                    total7.setText(entry.toString());
                else if (name8 == null)
                    name8.setText(entry.toString());
                else if (total8 == null)
                    total8.setText(entry.toString());
            }
            inputStreamReader.close();
            bufferedReader.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
