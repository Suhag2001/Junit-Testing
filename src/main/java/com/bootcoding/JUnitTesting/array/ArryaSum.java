package com.bootcoding.JUnitTesting.array;

public class ArryaSum {
    public int getSum(int numbers[]){
        int sum =0 ;
        for(int n:numbers){
            sum += n;
        }
        return sum;
    }

}
