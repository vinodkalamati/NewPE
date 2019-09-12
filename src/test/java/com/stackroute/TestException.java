package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
    public void TestingException_throwsException_PrintErrorMessage(){
        _exception.main();
        ByteArrayOutputStream Printcontent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(Printcontent));
        assertEquals("Finally block has to executed", "message:Error.....",Printcontent.toString());
    }

    @Test
    public void TestingException_throwsException_PrintErrorMessageFailure(){
        _exception.main();
        ByteArrayOutputStream PrintContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(PrintContent));
        assertNotEquals("Execute finally block", "message:Error.....",PrintContent.toString());

        assertNotNull("Failure",PrintContent.toString());
    }
}
