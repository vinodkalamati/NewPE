package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestException {
    private static Exception _exception=new Exception();

    @BeforeClass
    public static void setup(){
        _exception=new Exception();
    }
    @AfterClass
    public static void teardown(){
        _exception=null;
    }

    @Test
    public void TestingException(){

    }
}
