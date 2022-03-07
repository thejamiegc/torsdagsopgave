package com.company;

import java.util.ArrayList;

public class Game {
    ArrayList<Player> players = new ArrayList<>();
    FileIO fileIO = new FileIO();
    public Game(){


        ArrayList<String> data = new ArrayList<>();
        data = fileIO.readGameData();
        for (String s:data) {
            //System.out.println(s);
            String[] values = s.split(": ");
            int balance = Integer.parseInt(values[1]);
            Player p1 = new Player(values[0],balance);
            players.add(p1);
        }
    }

}
