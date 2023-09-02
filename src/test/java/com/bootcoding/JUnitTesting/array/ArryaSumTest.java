package com.bootcoding.JUnitTesting.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArryaSumTest {
    ArryaSum arryaSum = new ArryaSum();
    @Test
    public void addTest(){
//        ArryaSum arryaSum = new ArryaSum();
        int[] arr = {1,2};
        int actulValue = arryaSum.getSum(arr);
        int expectedValue=3;
        assertEquals(actulValue,expectedValue);
    }


    @Test
    public void addTest2(){
//        ArryaSum arryaSum = new ArryaSum();
        int[] arr = {-1,-2};
        int actulValue = arryaSum.getSum(arr);
        int expectedValue= -3;
        assertEquals(actulValue,expectedValue);
    }

    @Test
    public void testMax(){
//        ArryaSum arryaSum = new ArryaSum();
        int[] arr={1,2,3};
        int actulValue = arryaSum.getMax(arr);
        int expectedValue=3;
        assertEquals(actulValue,expectedValue);
    }
    @Test
    public void testEvenArray(){
//        ArryaSum arryaSum = new ArryaSum();
        int[] arr={1,2,3,4};
        int actulArray[] = arryaSum.getEvenArray(arr);
        int expectedArry[]={2,4};
        assertArrayEquals(actulArray,expectedArry);
    }


}