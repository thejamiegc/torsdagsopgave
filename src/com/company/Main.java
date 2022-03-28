package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("white");
        System.out.println(colors);
        for (String s:colors) {
            System.out.println(s);
        }
        colors.add(0,"black");
        System.out.println(colors.get(2));
        colors.set(2,"pink");
        System.out.println(colors.get(2));
        colors.remove(3);
        System.out.println(colors);

        for (int i = 0; i<colors.size();i++){
            if (colors.get(i).equals("pink")){
                System.out.println("its in the list");
            }
        }
        colors.add("ahhhhhhhhhhhh");
        System.out.println(colors);
        Collections.sort(colors);
        System.out.println(colors);

    }
}
