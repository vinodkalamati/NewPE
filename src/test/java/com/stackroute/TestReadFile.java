package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.*;

public class TestReadFile {
    private static ReadFile _file=new ReadFile();


    @BeforeClass
    public static void setup(){
        _file=new ReadFile();
    }
    @AfterClass
    public static void teardown() throws IOException {

        File file=new File( "/home/cgi/Documents/MyFile.txt");
        FileWriter Writer =new FileWriter(file);
        Writer.write("i am a man ,\n" +
                "i like to sleep ,\n" +
                "i have a home.");
        String _content="I AM A MAN,I LIKE TO SLEEP,I HAVE A NAME";
        String _content2="@@@@@@@@@@@@@@@@@";

        assertTrue(_file.ContentRead());
        assertEquals("UpperCaseCheck():Convert all chars in a file to upper case",_content,_file.UpperCaseCheck());
        assertEquals("isUpperCase():all the characters in the file should be UpperCase and length of the file-No of Words",10,_file.length_of_the_file());
        assertNotEquals("UpperCaseCheck():Convert all chars in a file to upper case","Iam a Man,I like to sleep,I have A name",_file.UpperCaseCheck());
        assertNotEquals("UpperCaseCheck():Convert all chars in a file to upper case",_content2,_file.UpperCaseCheck());
        assertNotNull(_file.length_of_the_file());
    }
}
