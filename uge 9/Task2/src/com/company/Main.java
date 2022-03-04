package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File data = new File("src/com/company/data.txt");
        try {
        Scanner scan = new Scanner(data);
        printFirstHalfOfEachWord(scan);
        }catch(FileNotFoundException exception){
            System.out.println("file not found");
            exception.getCause();
        }
    }
    static void printFirstHalfOfEachWord(Scanner scan){
        String word;
        while(scan.hasNext()){
            word = scan.next();
            System.out.println(word.substring(0,word.length()/2));
        }
    }
}
