package com.selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.base.BasePage;

public class LogInPage extends BasePage {
	
	public LogInPage(WebDriver webDriver) {
		super(webDriver);
	}
	
	private By register=By.xpath("//button[@title=\"Continue\"]");
	
	public boolean navigateToRegister() {
		click(register);
		return true;
		
	}
	
	

}
