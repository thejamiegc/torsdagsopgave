package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
    int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };
    divisible(getRandom(arr));
    printRecursive(10);
    fibunacci(1,1);
    }

    static int getRandom(int[] arr){
        Random rand = new Random();
        int randomInt = rand.nextInt(arr.length);
        return arr[randomInt];
    }

    static void divisible(int num){
        for(int i = 0;i<=100;i++){
            if(i%num==0){
                System.out.println(i);
            }
        }
    }

    static void printRecursive(int num){
        if (num>0){
            System.out.println(num);
            printRecursive(num-1);
        }
    }

    static void fibunacci(int num, int num2){
        if(num<10000||num2<10000){
            System.out.println(num + "\t" + num2);
            fibunacci(num2,num+num2);
        }
    }
}
