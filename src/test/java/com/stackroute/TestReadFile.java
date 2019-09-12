package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestReadFile {
    private static ReadFile _file=new ReadFile();


    @BeforeClass
    public static void setup(){
        _file=new ReadFile();
    }
    @AfterClass
    public static void teardown(){


        assertTrue(_file.ContentRead());
        assertTrue(_file.isUpperCase());
        assertNotNull(_file.length_of_the_file());
        assertNotEquals("isUpperCase():all the characters in the file should be UpperCase",false,_file.isUpperCase());
    }
}
