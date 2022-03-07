package com.company;

public class Algorithms {

    public int[] arraySort(int[] ary){
        for(int i=0;i<ary.length-1;i++){
            if(ary[i+1]<ary[i]) {
                int temp = ary[i+1];
                ary[i+1] = ary[i];
                ary[i] = temp;
            }
        }
        return ary;
    }

    public boolean checkSort(int [] ary){
        for(int i=0;i<ary.length-1;i++){
            if(ary[i] > ary[i+1]) {
               return false;
            }
        }
        return true;
    }
}
