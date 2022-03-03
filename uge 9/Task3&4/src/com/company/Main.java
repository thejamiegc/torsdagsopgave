package com.company;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static final int ASCII_SIZE = 256;
    public static void main(String[] args) throws Exception{
        File data = new File("C:\\Users\\jcall\\Desktop\\data.txt");
        Scanner scan = new Scanner(data);
        String text="";
        while (scan.hasNextLine()) {
            text = text + scan.nextLine() + " ";
        }
        text = text.toLowerCase(Locale.ROOT);
        printMostFrequentLetter(text);
        printleastFrequentLetter(text);
    }

    static void printMostFrequentLetter(String text){
        char[] charArr = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','æ','ø','å'};
        int[] intArr = new int[charArr.length];
        int max=0;
        int index=0;
        for(int i=0;i< charArr.length;i++){
           for(int j=0;j<text.length();j++){
               if(text.charAt(j)==charArr[i]){
                   intArr[i]++;
               }

           }
           if(intArr[i]>max){
               max=intArr[i];
               index = i;
           }
        }
            System.out.println("The most frequent letter is "+ charArr[index] + " it is used " + intArr[index]);
    }
    static void printleastFrequentLetter(String text){
        char[] charArr = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','æ','ø','å'};
        int[] intArr = new int[charArr.length];
        int min=Integer.MAX_VALUE;
        int index=0;
        for(int i=0;i< charArr.length;i++){
            for(int j=0;j<text.length();j++){
                if(text.charAt(j)==charArr[i]){
                    intArr[i]++;
                }
            }
            if(intArr[i]<min){
                min=intArr[i];
                index = i;
            }
        }
        System.out.println("The least frequent letter is "+ charArr[index] + " it is used " + intArr[index]);
    }
}




