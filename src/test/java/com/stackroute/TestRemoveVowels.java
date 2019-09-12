package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;
public class TestRemoveVowels {

    private static RemoveVowels places_=new RemoveVowels();

    @AfterClass
    public static void setup(){
        places_=new RemoveVowels();
    }

    @BeforeClass
    public static void teardown(){
        places_=null;
    }

    @Test
    public void Test_RemovingVowelsFromPlaceNames(){
        String[] _places={"Ind","Untd Stts","Grmny","Egypt","czchslvk"};
        assertArrayEquals("RemoveVowels():Vowels has to be removed from the strings excluding the first letter:Expected Array is not matching with the Actual Array",_places,places_.RemoveVowel(new String[]{"India","United States","Germany","Egypt","czechoslovakia"}));

        _places= new String[]{"Untd Ind","Blgm"};
        assertArrayEquals("RemoveVowels():Vowels has to be removed from the strings excluding the first letter:Expected Array is not matching with the Actual Array:Remove Unwanted Characters",_places,places_.RemoveVowel(new String[]{"United India","  ","Belgium",")(&8","7584"}));

        assertNotNull("RemoveVowels():Vowels has to be removed from the strings excluding the first letter:Expected Array is not matching with the Actual Array",places_.RemoveVowel(new String[] {"  ","p=-3=","2323@"}));

    }
}
