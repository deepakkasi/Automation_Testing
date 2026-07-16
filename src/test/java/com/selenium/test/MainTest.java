package com.selenium.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.page.HomePage;
import com.selenium.page.LogInPage;
import com.selenium.page.RegisterPage;

public class MainTest extends BaseTest{

	@Test
	public void fillDummyForm() {
		HomePage home=new HomePage(driver);
		boolean flag=home.navigateToRegister();
		LogInPage log=new LogInPage(driver);
		boolean LogInPage_flag=log.navigateToRegister();
		RegisterPage register=new RegisterPage(driver);
		boolean reg=register.registerUser();
		Assert.assertEquals(reg, true);
		Assert.assertEquals("https://demo.nopcommerce.com/registerresult/1?returnUrl=/", driver.getCurrentUrl());
		
		//https://demo.nopcommerce.com/registerresult/1?returnUrl=/
	}
}
