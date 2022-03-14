package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class TextUI {

    public ArrayList<String> getPlayerNames(String message) {
        ArrayList<String> data = new ArrayList<>();
        String input = "";
        Scanner scan = new Scanner(System.in);

        while (data.size()<6){
            System.out.println(message);
            input = scan.nextLine();
            if (input.equalsIgnoreCase("Q")){
                break;
            }
            data.add(input);
        }
        return data;
    }
}
