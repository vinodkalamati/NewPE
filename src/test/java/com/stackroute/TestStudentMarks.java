package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestStudentMarks {

    private static  StudentMarks  Marks=new StudentMarks();

    @BeforeClass
    public  static void setup(){
        Marks=new StudentMarks();
    }
    @AfterClass
    public static void teardown(){
        Marks=null;
    }
    @Test
    public void StudentMarks_test(){

        assertEquals("StudentGrades():Grades should be between 0 to 100",true,StudentMarks.ClassData(3,new int[]{50,80,60}));
        assertNotEquals("StudentGrades():Unexpected result",true,StudentMarks.ClassData(5,new int[]{76,'@',34,57,90}));
        assertEquals("StudentGrades():Grades should be between 0 to 100",false,StudentMarks.ClassData(3,new int[]{50,800,60}));
        assertNotNull("array is null return an empty array",StudentMarks.ClassData(4,new int[]{}));
    }
}
