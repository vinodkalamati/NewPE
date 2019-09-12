package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;
public class Test_date {

    private static Fdate_Ldate_Week date_ = new Fdate_Ldate_Week();


    @BeforeClass
    public static void setup() {
        date_ = new Fdate_Ldate_Week();
    }

    @AfterClass
    public static void teardown() {
        date_ = null;
    }

    @Test
    public void Test_FirstDate_LastDate_OfAWeek() {

        Date _date = new Date(2019, 9, 9);
        assertEquals("FirstDay():first day of a week", _date, date_.FirstDay(37,2019));

        _date = new Date(2019, 9, 15);
        assertEquals("FirstDay():Last day of a week", _date, date_.LastDay(37,2019));

        assertNull("LastDay():Last day of a week:week number is out of range", date_.LastDay(54,2020));

        _date = new Date(2020,12,28);
        assertEquals("FirstDay():first day of a week:",_date,date_.FirstDay(53,2020));

    }


}