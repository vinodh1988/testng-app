package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.MathAPP;

public class TestUnit {

	@Test
	 public void factTest() {
		 Assert.assertEquals(new Long(120), MathAPP.factorial(5));
		
	 }
}
