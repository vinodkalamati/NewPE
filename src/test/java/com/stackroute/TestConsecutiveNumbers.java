package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;



import static org.junit.Assert.*;
public class TestConsecutiveNumbers {

    private static ConsecutiveNumbers series_=new ConsecutiveNumbers();

    @BeforeClass
    public static void setup(){
        series_=new ConsecutiveNumbers();
    }
    @AfterClass
    public  static void teardown(){
        series_=null;
    }
    @Test
    public void TestConsecutiveNumbersInputTakenAsString(){

        assertEquals("CheckConsecutive():Numbers should be consecutive:",true,series_.CheckConsecutive("23,24,25,26,27"));
        assertNotEquals("CheckConsecutive():Numbers should be consecutive:",true,series_.CheckConsecutive("12,13,L,&"));
        assertNotEquals("CheckConsecutive():Numbers should be consecutive:",false,series_.CheckConsecutive("22.5,22.6,22.7"));
        assertEquals("CheckConsecutive():Numbers should be consecutive:",true,series_.CheckConsecutive(" 23,,24,,,25"));
        assertEquals("CheckConsecutive():Numbers should be consecutive:",true,series_.CheckConsecutive("-2,-3,-4,-5"));
    }
}

