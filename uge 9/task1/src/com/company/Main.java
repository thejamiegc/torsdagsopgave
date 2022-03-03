package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String text = "Where is the longest word in this sentence";
        printLongestWord(text);
        wordsWithLessThenTwoVocals(text);
    }

    static void printLongestWord(String text){
        String[] arr = text.split(" ");
        String longestWord = "";
        for(int i = 0;i< arr.length;i++){
            if(arr[i].length()>longestWord.length()){
                longestWord = arr[i];
            }
        }
        System.out.println(longestWord);
    }

    static void wordsWithLessThenTwoVocals(String text){
        String[] arr = text.split(" ");
        int vocals;
        for (int i=0;i<arr.length;i++){
            vocals =0;
            for (int j=0;j<arr[i].length();j++){
                if(arr[i].charAt(j) == 'a'||arr[i].charAt(j) == 'e'||arr[i].charAt(j) == 'i'|| arr[i].charAt(j) == 'o'||arr[i].charAt(j) == 'u' || arr[i].charAt(j) == 'A'||arr[i].charAt(j) == 'E'||arr[i].charAt(j) == 'I'|| arr[i].charAt(j) == 'O'||arr[i].charAt(j) == 'U'){
                    vocals++;
                }

            }
            if(vocals<2) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
