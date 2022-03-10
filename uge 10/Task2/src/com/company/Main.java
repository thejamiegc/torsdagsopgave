package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Room r1 = new Room(4,1,3,2);
        Room r2 = new Room(5,3,7,3);
        Room r3 = new Room(3,1,0,2);
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);
        Building building = new Building(rooms,1,4,false);
        System.out.println("The total numbers of lamps are: " + building.totalNumbersOfLamps());
        building.oddBuilding();
    }
}
