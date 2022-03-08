package com.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class StringCompressTest {

	@Test
	public void testMultiply() {
		StringCompress sc = new StringCompress();
		assertEquals("10 x 5 must be 50", 50, sc.multiply(10, 5));
		//fail("Not yet implemented");
	}
	
	@BeforeClass
    public static void oneTimeSetUp() {
        // one-time initialization code   
    	System.out.println("@BeforeClass - oneTimeSetUp");
    }

}
