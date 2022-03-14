package com.company;

import java.util.ArrayList;

public class Game {
    ArrayList<Player> players = new ArrayList<>();
    private FileIO fileIO = new FileIO();
    private TextUI textUI = new TextUI();
    public Game(){


        ArrayList<String> data = new ArrayList<>();
        data = fileIO.readGameData();
        if(data == null){
            data= textUI.getPlayerNames("Skriv spillernavn. Tast q for at quitte");
        }
        this.createPlayers(data);

    }

    private void createPlayers(ArrayList<String> data){
        for (String s:data) {
            //System.out.println(s);
            String[] values = s.split(": ");
            int balance;
            if (values.length > 1) {
                balance = Integer.parseInt(values[1]);
            }else {
                balance = Integer.parseInt("30000");
            }
            Player p1 = new Player(values[0],balance);
            players.add(p1);
        }
    }

    public String getPlayers(){
        return this.players.toString();
    }

}
