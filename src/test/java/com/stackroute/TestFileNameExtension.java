package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestFileNameExtension {
    private static FileNameExtension _file= new FileNameExtension();

    @BeforeClass
    public static void setup(){

        _file=new FileNameExtension();
    }
    @AfterClass
    public static void teardown(){

        _file=null;
    }
    @Test
    public void TestFileNameAndContent(){

        String _fileName=".txt";
        String _filename=".#$$%$";
        assertEquals("GetFileNameGivenExtension():file not found",true,_file.CheckFileNameGivenExtension(".txt"));
        assertEquals("GetFileNameGivenExtension():file not found",false,_file.CheckFileNameGivenExtension("jdskfjks"));
        assertEquals("ReadFile():Read the content in the file",true,_file.ReadContent());
        assertTrue("get file name if file is found",_file.GetFileName().contains(_fileName));
        assertNotEquals("FileExtension should not contain of special character",true,_file.GetFileName().contains(_filename));
    }
}
