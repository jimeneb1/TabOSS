package com.example.android.taboss;

public class Person {                           //Person class holds party members' names and individual totals. Will be used as ArrayList type in "PartyActivity.java".
    //Attributes
    private String name;
    private double amountOwed;

    //Constructors
    public Person(String newName, double newAmountOwed){
        name = newName;
        amountOwed = newAmountOwed;
    }

    public Person(){

        name = "No Name Given";
        amountOwed = 0.00;
    }

    //Get Methods
    public String getName() {
        return name;
    }

    public double getAmountOwed() {
        return amountOwed;
    }

    //Set Methods
    public void setName(String newName){
        name = newName;
    }

    public void setAmountOwed(double newAmount){
        amountOwed = newAmount;
    }

}