package com.company;

public abstract class ACar implements Car{
    private String registrationNumber;
    final String make;
    final String model;
    final int numberOfDoors;

    public ACar(String registrationNumber,String make, String model, int numberOfDoors){
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    public String getRegistrationNumber(){
        return this.registrationNumber;
    }
    public String getMake(){
        return this.make;

    }
    public String getModel(){
        return this.model;

    }
    public int getNumberOfDoors(){
        return this.numberOfDoors;

    }
    @Override
    public String toString(){
        return "\nthis is a car made by: " + make +
                "\nthe model: " + model +
                "\nthe registrationnumber: " + getRegistrationNumber() + "" +
                "\nthe number of doors: " + numberOfDoors;
    }
}
