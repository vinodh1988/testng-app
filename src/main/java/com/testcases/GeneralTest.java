package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GeneralTest {

	  @Test
	  public void operationsTest() {
		  Assert.assertEquals(2+3, 5);
	  }
}
