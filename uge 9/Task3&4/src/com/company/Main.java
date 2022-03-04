package com.company;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        File data = new File("src\\com\\company\\data.txt");
        Scanner scan = new Scanner(data);
        String text="";
        while (scan.hasNextLine()) {
            text = text + scan.nextLine() + " ";
        }
        text = text.toLowerCase(Locale.ROOT);
        printMostFrequentLetter(text);
        printLeastFrequentLetter(text);
    }

    static void printMostFrequentLetter(String text){
        char[] charArr = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','æ','ø','å'};
        int[] intArr = new int[charArr.length];
        int tempint;
        char tempchar;
        int max=0;
        for(int i=0;i< charArr.length;i++){
           for(int j=0;j<text.length();j++){
               if(text.charAt(j)==charArr[i]){
                   intArr[i]++;
               }

           }
           if(intArr[i]>max){
               max=intArr[i];
           }
        }
        for(int i=0;i<intArr.length;i++){
            for (int j=i;j< intArr.length;j++){
                if(intArr[j]>intArr[i]){
                    tempint = intArr[i];
                    tempchar = charArr[i];
                    intArr[i] = intArr[j];
                    charArr[i] = charArr[j];
                    intArr[j] = tempint;
                    charArr[j] = tempchar;
                }
            }
        }
            System.out.println("Top 10 most used letters:");
        for(int i=0;i< 10;i++){
            System.out.println(charArr[i] + " shows up " + intArr[i] + " times!");
        }
    }
    static void printLeastFrequentLetter(String text){
        char[] charArr = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','æ','ø','å'};
        int[] intArr = new int[charArr.length];
        int min=Integer.MAX_VALUE;
        int tempint;
        char tempchar;
        for(int i=0;i< charArr.length;i++){
            for(int j=0;j<text.length();j++){
                if(text.charAt(j)==charArr[i]){
                    intArr[i]++;
                }
            }
            if(intArr[i]<min){
                min=intArr[i];

            }
        }

        for(int i=0;i<intArr.length;i++){
            for (int j=i;j< intArr.length;j++){
                if(intArr[j]<intArr[i]){
                    tempint = intArr[i];
                    tempchar = charArr[i];
                    intArr[i] = intArr[j];
                    charArr[i] = charArr[j];
                    intArr[j] = tempint;
                    charArr[j] = tempchar;
                }
            }
        }
        System.out.println("\nTop 10 least used letters:");
        for(int i=0;i<10;i++){
            System.out.println(charArr[i] + " shows up " + intArr[i] + " time(s)!");
        }
    }
}




