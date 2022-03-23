package com.company;

public class DieselCar extends AFuelCar {
    private boolean particleFilter;
    public DieselCar(String registrationNumber,String make, String model, int numberOfDoors, int kmPrLitre,boolean particleFilter){
        super(registrationNumber,make,model,numberOfDoors,kmPrLitre);
        this.particleFilter = particleFilter;
    }

    String getFuelType(){
        return "Diesel";
    }

    public boolean hasParticleFilter(){
        return this.particleFilter;
    }

    public int getRegistrationFee(){
        int sum=0;
        if(kmPrLitre<=50 && kmPrLitre>=20){
            sum =  330+130;
        }else if(kmPrLitre<=20 && kmPrLitre>=15){
            sum =  1050+1390;
        }else if(kmPrLitre<=15 && kmPrLitre>=10){
            sum = 2340+1850;
        }else if(kmPrLitre<=10 && kmPrLitre>=5){
            sum = 5500+2770;
        }else if(kmPrLitre<5){
            sum = 10470+15260;
        }
        if(particleFilter){
            return sum;
        }else{
            return sum+1000;
        }

    }
    public String toString(){
        return "this is a Diesel car made by:" + make + " the model: " + model + " the registrationnumber: " + getRegistrationNumber() + " number of doors: " + numberOfDoors + " KM/litre: " + kmPrLitre + " does it have a particle: " + particleFilter +"\n";
    }
}
