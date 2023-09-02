package com.bootcoding.JUnitTesting.array;

import java.util.ArrayList;

public class ArryaSum {
    public int getSum(int numbers[]){
        int sum =0 ;
        for(int n:numbers){
            sum += n;
        }
        return sum;
    }

    public int getMax(int numbers[]){
        int n =numbers[0];
        for (int num: numbers){
            if(n<num){
                n= num;
            }
        }
        return n;
    }

    public int[] getEvenArray(int numbers[]){

        int evenCount=0;
        for(int num: numbers){
            if(num%2==0){
                evenCount++;
            }
        }
        int newArray[]= new int[evenCount];
        int i =0 ;
        for (int num : numbers){
           if (num%2 ==0){
               newArray[i++]=num;
           }

        }
        return newArray;
    }


}
