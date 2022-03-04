package com.company;

import java.io.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
     File data = new File("src\\com\\company\\data.txt");

        Scanner scan = new Scanner(data);
        Scanner scan2 = new Scanner(data);
        printLongestWord(scan);
        wordsWithLessThenTwoVocals(scan2);
    }

    static void printLongestWord(Scanner scan){
        String longestWord = "";
        String input;
        while(scan.hasNext()){
            input = scan.next();
            if(input.length()>longestWord.length()){
                longestWord = input;
            }
        }
        System.out.println(longestWord);
    }

    static void wordsWithLessThenTwoVocals(Scanner scan){
        String currentWord;
        int vocals;
        while (scan.hasNext()){
            vocals = 0;
            currentWord = scan.next();
            for(int i=0;i<currentWord.length();i++){
                if(currentWord.charAt(i) == 'a'||currentWord.charAt(i) == 'e'||currentWord.charAt(i) == 'i'||currentWord.charAt(i) == 'o'||currentWord.charAt(i) == 'u'||currentWord.charAt(i) == 'y'||currentWord.charAt(i) == 'æ'||currentWord.charAt(i) == 'ø'||currentWord.charAt(i) == 'å'||currentWord.charAt(i) == 'A'||currentWord.charAt(i) == 'E'||currentWord.charAt(i) == 'I'||currentWord.charAt(i) == 'O'||currentWord.charAt(i) == 'U'||currentWord.charAt(i) == 'Y'||currentWord.charAt(i) == 'Æ'||currentWord.charAt(i) == 'Ø'||currentWord.charAt(i) == 'Å'){
                    vocals++;
                }
            }
            if(vocals<2){
                System.out.print(currentWord + " ");
            }
        }
    }
}
