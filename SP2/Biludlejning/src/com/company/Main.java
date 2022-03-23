package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FleetOfCars fleet = new FleetOfCars();
        Car gaso = new GasolineCar("gigachad200","fiat","500",4,10);
        Car dies = new DieselCar("lol","porche","911",2,10,true);
        Car elec = new ElectricCar("gottagofast","tesla","x",5,75,380);

        fleet.addCar(gaso);
        fleet.addCar(dies);
        fleet.addCar(elec);
        System.out.println("The total registration fee for the fleet is: " + fleet.getTotalRegistrationFeeForFleet());
        System.out.println(fleet);
    }
}
