package com.company;

public class Main {

    public static void main(String[] args) {
	    Algorithms myAlgo = new Algorithms();
        int[] myArray = new int[]{ 8, 9, 1, 5, 11, 13, 7, 4, 6, 3, 12, 10, 2 };
        boolean isSorted = false;
        while(!isSorted) {
            myArray = myAlgo.arraySort(myArray);
            isSorted = myAlgo.checkSort(myArray);
        }
        System.out.println(isSorted);
    }
}
