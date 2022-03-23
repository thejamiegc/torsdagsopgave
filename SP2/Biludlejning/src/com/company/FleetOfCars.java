package com.company;

import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> fleet;
    public FleetOfCars(){
        fleet = new ArrayList<Car>();
    }
    public void addCar(Car car){
        fleet.add(car);
    }
    int getTotalRegistrationFeeForFleet(){
        int sum=0;
        for (Car car: fleet){
            sum += car.getRegistrationFee();
        }
        return sum;
    }

    @Override
    public String toString(){
        return "Fleet: " + fleet;
    }
}
