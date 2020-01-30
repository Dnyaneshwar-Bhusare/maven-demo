package com.lti.pdf;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestingTest {

	Testing t=new Testing();
	@Test
	public void testifaddisworkingornot() {

		int result=t.add(10, 20);
		int expected=30;
		assertEquals(expected, result);
		
	}
	@Test
	public void testing2(){
		int result1=t.sub(20, 10);
		int expected1=10;
		assertEquals(expected1, result1);
	}

}
