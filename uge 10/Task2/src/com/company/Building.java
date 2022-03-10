package com.company;

import java.util.ArrayList;

public class Building {
    final ArrayList<Room> rooms;
    private int numbersOfBathrooms;
    private int numbersOfFloors;
    private boolean isOfficeBuilding;
    Building(ArrayList<Room> rooms,int numbersOfBathrooms,int numbersOfFloors,boolean isOfficeBuilding){
        this.rooms = rooms;
        this.numbersOfBathrooms = numbersOfBathrooms;
        this.numbersOfFloors = numbersOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public Room getRooms(int index) {
        return rooms.get(index);
    }

    public int getNumbersOfBathrooms(){
        return this.numbersOfBathrooms;
    }

    public int getNumbersOfFloors(){
        return this.numbersOfFloors;
    }

    public boolean getIsOfficeBuilding(){
        return this.isOfficeBuilding;
    }

    public int totalNumbersOfLamps(){
        int sum =0;
        for(int i =0;i<rooms.size();i++){
            sum+= rooms.get(i).getNumbersOfLamps();
        }
        return sum;
    }

    public void oddBuilding(){
        if(numbersOfFloors>rooms.size()){
            System.out.println("This is an odd building");
        }else{
            System.out.println("This is a normal building");
        }

    }
}
