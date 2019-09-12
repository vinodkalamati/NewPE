package com.stackroute;

import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class TestGenerateException {

    private static GenerateExceptions test;
    @BeforeClass
    public void setUp() throws Exception {
        test = new GenerateExceptions();
    }

    @AfterClass
    public void tearDown() throws Exception {
        test = null;
    }
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void GenerateNegativeArraySizeException_ThrowsException_CheckException() {
        thrown.expect(NegativeArraySizeException.class);
        thrown.expectMessage("NegativeArraySizeException");
        test.GenerateNegativeArraySizeException();
    }

    @Test
    public void GenerateIndexOutOfBoundsException_ThrowsException_CheckException() {
        thrown.expect(IndexOutOfBoundsException.class);
        thrown.expectMessage("IndexOutOfBoundsException");
        test.GenerateIndexOutOfBoundsException();
    }

    @Test
    public void GenerateNullPointerException_ThrowsException_CheckException() {
        thrown.expect(NullPointerException.class);
        thrown.expectMessage("NullPointerException");
        test.GenerateNullPointerException();
    }
}

