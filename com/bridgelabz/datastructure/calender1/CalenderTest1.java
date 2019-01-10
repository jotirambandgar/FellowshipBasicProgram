package com.bridgelabz.datastructure.calender1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class CalenderTest1 {

	@Test
	public void testFindDayCode()
	{
		int dayCode = Implementation.findDcode(1, 1, 2019);
        String day[]= {"sun", "mon", "tues", "wed", "thu", "fri" , "sat"};
        String dayAtDate = day[dayCode];
        
        assertEquals("tues", dayAtDate);
	}
	
	@Test
	public void testLeapYear()
	{
		String result = Implementation.leapYear(2012);
		  assertEquals("leap year", result);
	}
	@Test
	public void testNumberOfDayInMonth()
	{
		int numberOfDayInMonth = Implementation.numberOfDaysInMonth(1, 2019);
		assertEquals(31, numberOfDayInMonth);
	}


}
