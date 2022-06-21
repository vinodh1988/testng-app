package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTests {
 WebDriver wd;
 
   @BeforeClass
   public void initialize() {
	 wd=DriverProvider.getDriver();
  }
   
   @Test
   public void test() {
     wd.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.2.2");
     Assert.assertEquals(wd.getTitle(),"Maven Repository: org.seleniumhq.selenium » selenium-java » 4.2.2");
   }
   
   @Test
   public void test2() {
	 wd.get("https://google.co.in");  
	 Assert.assertNotNull(wd.findElement(By.name("q")));
   }
}
