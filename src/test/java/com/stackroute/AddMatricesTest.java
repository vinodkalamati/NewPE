package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddMatricesTest {

    private static  AddMatrices  Addmatrices=new AddMatrices();

    @BeforeClass
    public  static void setup(){
        Addmatrices=new AddMatrices();

    }
    @AfterClass
    public static void teardown(){
        Addmatrices=null;
    }
    @Test
    public void TestMatrices(){ 

        assertNull("Elements doesn't match with the provided number of rows and columns",Addmatrices.MatrixAddition(2,3, new int[]{6, 8, 6, 4, 3}, new int[]{9, 6, 5, 5, 4, 7}));
        assertArrayEquals("sum of arrays of the same dimension",new int[]{ 4,7,8,3,0,7},Addmatrices.MatrixAddition(2,3,new int[]{2,3,4,5,6,7},new int[]{2,4,4,-2,-6,0}));
        assertNull("take only integer values Exception()",Addmatrices.MatrixAddition(1,2,new int[]{(int)'@',(int)'*'},new int[]{(int)'@',(int)'*'}));
        assertNotEquals("Handles Exceptions",new int[]{8,6,6,7,7,7,7},Addmatrices.MatrixAddition(2,2,new int[]{8,6,6,7,7,7,7},new int[]{0,0,0,00,0,0,0}));
    }
}
