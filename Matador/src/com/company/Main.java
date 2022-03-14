package com.company;

public class Main {

    public static void main(String[] args) {
	    Game game = new Game();
        System.out.println(game.players);
        Dice dice = new Dice();
        System.out.println(dice.rollDiceSum());
    }
    }

