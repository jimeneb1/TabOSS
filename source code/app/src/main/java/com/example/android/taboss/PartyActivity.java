package com.example.android.taboss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class PartyActivity extends Activity {

    private final double TAX_RATE = 1.07;

    EditText name1, name2, name3, name4, name5, name6, name7, name8;
    EditText item1, item2, item3, item4, item5, item6, item7, item8;
    EditText price1, price2, price3, price4, price5, price6, price7, price8;
    Spinner spinner1, spinner2, spinner3, spinner4, spinner5, spinner6, spinner7, spinner8;
    ArrayAdapter<String> adapter;
    List<Person> Party = new ArrayList<Person>();
    List<Item> ItemsList = new ArrayList<Item>();
    List<Person> Entries = new ArrayList<Person>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_party_activity);

        name1 = (EditText) findViewById(R.id.inName1);
        name2 = (EditText) findViewById(R.id.inName2);
        name3 = (EditText) findViewById(R.id.inName3);
        name4 = (EditText) findViewById(R.id.inName4);
        name5 = (EditText) findViewById(R.id.inName5);
        name6 = (EditText) findViewById(R.id.inName6);
        name7 = (EditText) findViewById(R.id.inName7);
        name8 = (EditText) findViewById(R.id.inName8);

        item1 = (EditText) findViewById(R.id.inItem1);
        item2 = (EditText) findViewById(R.id.inItem2);
        item3 = (EditText) findViewById(R.id.inItem3);
        item4 = (EditText) findViewById(R.id.inItem4);
        item5 = (EditText) findViewById(R.id.inItem5);
        item6 = (EditText) findViewById(R.id.inItem6);
        item7 = (EditText) findViewById(R.id.inItem7);
        item8 = (EditText) findViewById(R.id.inItem8);

        price1 = (EditText) findViewById(R.id.inPrice1);
        price2 = (EditText) findViewById(R.id.inPrice2);
        price3 = (EditText) findViewById(R.id.inPrice3);
        price4 = (EditText) findViewById(R.id.inPrice4);
        price5 = (EditText) findViewById(R.id.inPrice5);
        price6 = (EditText) findViewById(R.id.inPrice6);
        price7 = (EditText) findViewById(R.id.inPrice7);
        price8 = (EditText) findViewById(R.id.inPrice8);

        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();

        setupHomeButton();
        setupHomeButton2();
        setupHomeButton3();
        setupHomeButton4();
        setupToItemsButton();
        setupToSplitButton();
        setupToTotalsButton();
        setupSplitRefreshButton();
        setupNameRefreshButton();
        setupListView();

        TabHost.TabSpec tabSpec = tabHost.newTabSpec("Party");
        tabSpec.setContent(R.id.party);
        tabSpec.setIndicator("Party");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("Items");
        tabSpec.setContent(R.id.items);
        tabSpec.setIndicator("Items");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("Split");
        tabSpec.setContent(R.id.split);
        tabSpec.setIndicator("Split");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("Totals");
        tabSpec.setContent(R.id.totals);
        tabSpec.setIndicator("Totals");
        tabHost.addTab(tabSpec);
    }
                                            //There are multiple home button declarations for the different tab screens
    private void setupHomeButton() {
        Button homeBtn = (Button) findViewById(R.id.homeBtn);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void setupHomeButton2() {
        Button homeBtn2 = (Button) findViewById(R.id.homeBtn2);
        homeBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void setupHomeButton3() {
        Button homeBtn3 = (Button) findViewById(R.id.homeBtn3);
        homeBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void setupHomeButton4() {
        Button homeBtn4 = (Button) findViewById(R.id.homeBtn4);
        homeBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

                                                        //Save party info input, Transition to Items tab
    private void setupToItemsButton() {
        Button toItemsBtn = (Button) findViewById(R.id.toItemsBtn);
        toItemsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name1.getText().toString() == "")
                    addPerson("N/A", 0.00);
                else
                    addPerson(name1.getText().toString(), 0.00);
                if(name2.getText().toString() == "")
                    addPerson("N/A", 0.00);
                else
                    addPerson(name2.getText().toString(), 0.00);
                if(name3.getText().toString() == "")
                    addPerson("N/A", 0.00);
                else
                    addPerson(name3.getText().toString(), 0.00);
                if(name4.getText().toString() == "")
                    addPerson("N/A", 0.00);
                else
                    addPerson(name4.getText().toString(), 0.00);
                if(name5.getText().toString() == "")
                    addPerson("N/A", 0.00);
                else
                    addPerson(name5.getText().toString(), 0.00);
                if(name6.getText().toString() == "")
                    addPerson("N/A", 0.00);
                else
                    addPerson(name6.getText().toString(), 0.00);
                if(name7.getText().toString() == "")
                    addPerson("N/A", 0.00);
                else
                    addPerson(name7.getText().toString(), 0.00);
                if(name8.getText().toString() == "")
                    addPerson("N/A", 0.00);
                else
                    addPerson(name8.getText().toString(), 0.00);

                Toast.makeText(PartyActivity.this, "All Party Members Registered, Continue to Items Tab", Toast.LENGTH_SHORT).show();
            }
        });
    }
                                                        //Save Item info, Transition to Split tab
    private void setupToSplitButton() {
        Button toSplitBtn = (Button) findViewById(R.id.toSplitBtn);
        toSplitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItem(item1.getText().toString(), price1.getText().toString());
                addItem(item2.getText().toString(), price2.getText().toString());
                addItem(item3.getText().toString(), price3.getText().toString());
                addItem(item4.getText().toString(), price4.getText().toString());
                addItem(item5.getText().toString(), price5.getText().toString());
                addItem(item6.getText().toString(), price6.getText().toString());
                addItem(item7.getText().toString(), price7.getText().toString());
                addItem(item8.getText().toString(), price8.getText().toString());

                Toast.makeText(PartyActivity.this, "All Items Registered, Continue to Split Tab", Toast.LENGTH_SHORT).show();
            }
        });
    }
                                                    //Save allocations, make Entries, Transition to Total
    private void setupToTotalsButton() {
        Button toTotalsBtn = (Button) findViewById(R.id.toTotalsBtn);
        toTotalsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Person entry1 = new Person(spinner1.getSelectedItem().toString(), ItemsList.get(0).getPrice());
                Person entry2 = new Person(spinner2.getSelectedItem().toString(), ItemsList.get(1).getPrice());
                Person entry3 = new Person(spinner3.getSelectedItem().toString(), ItemsList.get(2).getPrice());
                Person entry4 = new Person(spinner4.getSelectedItem().toString(), ItemsList.get(3).getPrice());
                Person entry5 = new Person(spinner5.getSelectedItem().toString(), ItemsList.get(4).getPrice());
                Person entry6 = new Person(spinner6.getSelectedItem().toString(), ItemsList.get(5).getPrice());
                Person entry7 = new Person(spinner7.getSelectedItem().toString(), ItemsList.get(6).getPrice());
                Person entry8 = new Person(spinner8.getSelectedItem().toString(), ItemsList.get(7).getPrice());

                Entries.add(entry1);
                Entries.add(entry2);
                Entries.add(entry3);
                Entries.add(entry4);
                Entries.add(entry5);
                Entries.add(entry6);
                Entries.add(entry7);
                Entries.add(entry8);

                setupTotalsTab();                   //Totals Tab will not be generated until the entries are made by associating items with people, which is done by clicking the "To Totals Tab" button

                Toast.makeText(PartyActivity.this, "All Items Have Been Associated, Continue to Totals Tab", Toast.LENGTH_SHORT).show();
            }
        });
    }
                                                    //On Split tab, allows user to update item info onto Split screen
    private void setupSplitRefreshButton() {
        Button splitRefreshBtn = (Button) findViewById(R.id.splitRefreshBtn);
        splitRefreshBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setupListView();
                Toast.makeText(PartyActivity.this, "Items have been refreshed.", Toast.LENGTH_SHORT).show();
            }
        });
    }
                                                    //On Split tab, allow user to update spinners with party names. 11/22/2016 Currently Broken
    private void setupNameRefreshButton() {
        Button nameRefreshBtn = (Button) findViewById(R.id.nameRefreshBtn);
        nameRefreshBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setupSpinners();
                Toast.makeText(PartyActivity.this, "Names have been refreshed. Drop down menus are updated.", Toast.LENGTH_SHORT).show();
            }
        });
    }
                                                    //On Split tab, renders Items into TextViews, called from setupSplitRefreshButton()
    private void setupListView() {
        TextView itemsplit1 = (TextView) findViewById(R.id.splitItem1);
        TextView itemsplit2 = (TextView) findViewById(R.id.splitItem2);
        TextView itemsplit3 = (TextView) findViewById(R.id.splitItem3);
        TextView itemsplit4 = (TextView) findViewById(R.id.splitItem4);
        TextView itemsplit5 = (TextView) findViewById(R.id.splitItem5);
        TextView itemsplit6 = (TextView) findViewById(R.id.splitItem6);
        TextView itemsplit7 = (TextView) findViewById(R.id.splitItem7);
        TextView itemsplit8 = (TextView) findViewById(R.id.splitItem8);
        itemsplit1.setText(item1.getText());
        itemsplit2.setText(item2.getText());
        itemsplit3.setText(item3.getText());
        itemsplit4.setText(item4.getText());
        itemsplit5.setText(item5.getText());
        itemsplit6.setText(item6.getText());
        itemsplit7.setText(item7.getText());
        itemsplit8.setText(item8.getText());
    }
                                                    //On Split tab, renders Items into Spinners, called from setupNamesRefreshButton()
    private void setupSpinners(){
        spinner1 = (Spinner) findViewById(R.id.spinnerItem1);
        spinner2 = (Spinner) findViewById(R.id.spinnerItem2);
        spinner3 = (Spinner) findViewById(R.id.spinnerItem3);
        spinner4 = (Spinner) findViewById(R.id.spinnerItem4);
        spinner5 = (Spinner) findViewById(R.id.spinnerItem5);
        spinner6 = (Spinner) findViewById(R.id.spinnerItem6);
        spinner7 = (Spinner) findViewById(R.id.spinnerItem7);
        spinner8 = (Spinner) findViewById(R.id.spinnerItem8);
                                                    //Populate temp String Array that will store names for use in the spinners
        String[] partyStringArray = new String[Party.size()];
        Iterator<Person> it = Party.iterator();
        for(int i=0; it.hasNext(); i++){
            partyStringArray[i] = it.next().getName();
        }

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, partyStringArray);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);
        spinner3.setAdapter(adapter);
        spinner4.setAdapter(adapter);
        spinner5.setAdapter(adapter);
        spinner6.setAdapter(adapter);
        spinner7.setAdapter(adapter);
        spinner8.setAdapter(adapter);

    }


                                                        //Calculates individual totals with tax taken into account
    private void calculateTotals(){
        Person tempPerson;
        double tempTotal;
        for(int i = 0; i < Entries.size(); i++){
            tempPerson = Entries.get(i);
            tempTotal = tempPerson.getAmountOwed() * TAX_RATE;
            tempPerson.setAmountOwed(tempTotal);
            Entries.set(i, tempPerson);
        }
    }

                                                        //Set up Totals Tab, only occurs when the "To Totals Tab" button on the "Split" tab has been pressed
    private void setupTotalsTab(){
        TextView totalEntry1 = (TextView) findViewById(R.id.totalEntry1);
        TextView totalEntry2 = (TextView) findViewById(R.id.totalEntry2);
        TextView totalEntry3 = (TextView) findViewById(R.id.totalEntry3);
        TextView totalEntry4 = (TextView) findViewById(R.id.totalEntry4);
        TextView totalEntry5 = (TextView) findViewById(R.id.totalEntry5);
        TextView totalEntry6 = (TextView) findViewById(R.id.totalEntry6);
        TextView totalEntry7 = (TextView) findViewById(R.id.totalEntry7);
        TextView totalEntry8 = (TextView) findViewById(R.id.totalEntry8);
        calculateTotals();
        totalEntry1.setText(Entries.get(0).getName() + "      Total: $" + Entries.get(0).getAmountOwed());
        totalEntry2.setText(Entries.get(1).getName() + "      Total: $" + Entries.get(1).getAmountOwed());
        totalEntry3.setText(Entries.get(2).getName() + "      Total: $" + Entries.get(2).getAmountOwed());
        totalEntry4.setText(Entries.get(3).getName() + "      Total: $" + Entries.get(3).getAmountOwed());
        totalEntry5.setText(Entries.get(4).getName() + "      Total: $" + Entries.get(4).getAmountOwed());
        totalEntry6.setText(Entries.get(5).getName() + "      Total: $" + Entries.get(5).getAmountOwed());
        totalEntry7.setText(Entries.get(6).getName() + "      Total: $" + Entries.get(6).getAmountOwed());
        totalEntry8.setText(Entries.get(7).getName() + "      Total: $" + Entries.get(7).getAmountOwed());

    }

                                                        //Add new person to Party list
    private void addPerson(String name, double amountOwed) {
        Party.add(new Person(name, amountOwed));
    }
                                                        //Add new item to ItemList
    private void addItem(String name, String sPrice) {
        double price;
        if(sPrice == null)
            price = 0.00;
        else
            price = Float.valueOf(sPrice);
        ItemsList.add(new Item(name, price));
    }
                                                        //Add new entry to Entries for Totals screen and MyTab screen
    private void makeEntry(String name, double amountOwed) {
        Entries.add(new Person(name, amountOwed));
    }

}