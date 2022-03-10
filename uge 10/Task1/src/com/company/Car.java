package com.company;

public class Car {
    private String make;
    private String model;
    private int year;
    private String bodyStyle;
    private Driver driver;


    public Car(String make,String model,int year,String bodyStyle){
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;
    }

    public void setDriver(Driver driver){
        this.driver = driver;
    }

    public Driver getDriver(){
        return this.driver;
    }

    @Override
    public String toString(){
        return "Make: " + this.make + " Model: " + this.model + " (" + this.year + "), Body style: " + bodyStyle;
    }

}
