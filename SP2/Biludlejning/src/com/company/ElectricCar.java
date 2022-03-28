package com.company;

public class ElectricCar extends ACar{

    private int batterCapacity;
    private int maxRange;

    public ElectricCar(String registrationNumber,String make, String model, int numberOfDoors,int batterCapacity,int maxRange){
        super(registrationNumber,make,model,numberOfDoors);
        this.batterCapacity = batterCapacity;
        this.maxRange = maxRange;
    }

    int getBatteryCapacityKWh(){
        return batterCapacity;
    }

    int getMaxRangeKM(){
        return maxRange;
    }

    int getWhPrKm(){
        return (getBatteryCapacityKWh()*1000)/maxRange;

    }

    public int getRegistrationFee() {

        int kmPrLitre = 100/(getWhPrKm()/91);
        //System.out.println(kmPrLitre);
        if(kmPrLitre<=50 && kmPrLitre>=20){
            return 330;
        }
        if(kmPrLitre<=20 && kmPrLitre>=15){
            return 1050;
        }
        if(kmPrLitre<=15 && kmPrLitre>=10){
            return 2340;
        }
        if(kmPrLitre<=10 && kmPrLitre>=5){
            return 5500;
        }
        if(kmPrLitre<5){
            return 10470;
        }
        return 0;
    }
    public String toString(){
        return super.toString() +"\nthis car is an electric car"+ "\nwh/km: " + getWhPrKm() +"\n";
    }

}
