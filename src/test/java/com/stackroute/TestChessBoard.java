package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
public class TestChessBoard {
    private static ChessBoard _Pattern=new ChessBoard();

    @BeforeClass
    public static void setup(){
        _Pattern=new ChessBoard();
    }
    @AfterClass
    public static void teardown(){
        _Pattern=null;
    }

    @Test
    public void Test_PrintingChessPattern(){
    String[][] pattern={

            {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
            {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
            {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
            {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
            {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
            {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
            {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
            {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}

                    };
    assertArrayEquals("return 8X8 chess pattern with BlackBox  as BB and WhiteBox as WW:Expected Array doesn't match with actual array",pattern,_Pattern.PatternOf8x8ChessBoard());

    String Element="BB|";
    assertEquals("return Element in a two dimensional array,given index",Element,_Pattern.CharacterInAChessArray(1,3));
    assertNotEquals("|BB",_Pattern.CharacterInAChessArray(2,3));
    Element="|BB";
    assertEquals("return Element in a two dimensional array,given index",Element,_Pattern.CharacterInAChessArray(7,7));
    assertNull("Expected Result doesn't match with actual result",_Pattern.CharacterInAChessArray(8,8));

    }
}
