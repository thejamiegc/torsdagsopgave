package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        File data = new File("C:\\Users\\jcall\\Desktop\\data.txt");
        Scanner scan = new Scanner(data);
        printFirstHalfOfEachWord(scan);
    }
    static void printFirstHalfOfEachWord(Scanner scan){
        String word;
        while(scan.hasNext()){
            word = scan.next();
            System.out.println(word.substring(0,word.length()/2));
        }
    }
}
