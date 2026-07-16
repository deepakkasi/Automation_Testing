package com.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	WebDriver driver ;
	
	@BeforeMethod
	public void beforeMethod() {
		driver =new ChromeDriver();
		 driver.get("https://demo.nopcommerce.com/");
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
