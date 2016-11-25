package com.example.android.taboss;

public class Item {

    //Attributes
    private String name;
    private double price;

    //Constructors
    public Item(){
        name = "No Item Name";
        price = 0.00;
    }
    public Item(String newName, double newPrice){
        name = newName;
        price = newPrice;
    }

    //Get Methods
    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    //Set Methods
    public void setName(String newName){
        name = newName;
    }

    public void setPrice(double newPrice){
        price = newPrice;
    }
}
