package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Driver d1 = new Driver("Jamie",23);
        Car car = new Car("McLaren","720S",2022,"aerodynamic");
        Car car2 = new Car("Fiat","500e",2019,"electric");
        car.setDriver(d1);
        car2.setDriver(d1);
        System.out.println(car + "" + car.getDriver());
        System.out.println(car2 + "" + car2.getDriver());
    }
}
