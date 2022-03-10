package com.company;

public class Room {
    private int walls;
    private int numbersOfDoors;
    private int numbersOfLamps;
    private int numbersOfWindows;
    public Room(int walls,int numbersOfDoors,int numbersOfLamps,int numbersOfWindows){
        this.walls = walls;
        this.numbersOfDoors = numbersOfDoors;
        this.numbersOfLamps = numbersOfLamps;
        this.numbersOfWindows = numbersOfWindows;
    }

    public int getWalls(){
        return this.walls;
    }

    public int getNumbersOfDoors(){
        return this.numbersOfDoors;
    }

    public int getNumbersOfLamps(){
        return this.numbersOfLamps;
    }

    public int getNumbersOfWindows(){
        return this.numbersOfWindows;
    }
}
