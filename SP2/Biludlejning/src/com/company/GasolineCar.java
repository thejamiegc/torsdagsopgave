package com.company;

public class GasolineCar extends AFuelCar{

    public GasolineCar(String registrationNumber,String make, String model, int numberOfDoors, int kmPrLitre){
        super(registrationNumber,make,model,numberOfDoors,kmPrLitre);
    }

    String getFuelType(){
        return "gasoline";
    }

    public int getRegistrationFee(){
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
    @Override
    public String toString(){
        return super.toString() + "\n";
    }
}
