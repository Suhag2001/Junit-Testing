package com.bootcoding.JUnitTesting.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArryaSumTest {

    @Test
    public void addTest(){
        ArryaSum arryaSum = new ArryaSum();
        int[] arr = {1,2};
        int actulValue = arryaSum.getSum(arr);
        int expectedValue=3;
        assertEquals(actulValue,expectedValue);
    }

    @Test
    public void addTest2(){
        ArryaSum arryaSum = new ArryaSum();
        int[] arr = {-1,-2};
        int actulValue = arryaSum.getSum(arr);
        int expectedValue= -3;
        assertEquals(actulValue,expectedValue);
    }


}