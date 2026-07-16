package com.selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.base.BasePage;

public class RegisterPage  extends BasePage {
	
	public RegisterPage(WebDriver webDriver) {
		super(webDriver);
	}
	private By gender_male=By.xpath("//input[@id=\"gender-male\"]");
	private By gender_female=By.xpath("//input[@id=\"gender-female\"]");
	private By firstName=By.id("#FirstName");
	private By lastName=By.xpath("//input[@id=\"LastName\"]");
	private By email=By.xpath("//input[@id=\"Email\"]");
	private By company_name=By.xpath("//input[@id=\"Company\"]");
	private By newsletter=By.xpath("//label[text()='Newsletter']/following-sibling::input[@id=\"NewsLetterSubscriptions_0__IsActive\"]");
	private By password=By.xpath("//input[@id=\"Password\"]");
	private By confirm_password=By.xpath("//input[@id=\"ConfirmPassword\"]");
	private By register_btn=By.xpath("//button[@id=\"register-button\"]");
	
	
	
	  public boolean registerUser() { try {
		  
	click(gender_female);
	clearAndFill(firstName,"guna");
	clearAndFill(lastName,"deepika");
	 clearAndFill(email,"abc@gmail.com");
	 clearAndFill(password,"pass");
	 clearAndFill(company_name,"abc pvt ltd");
	  click(newsletter);
	  clearAndFill(password,"pass@12345");
	  clearAndFill(confirm_password,"pass@12345");
	  click(register_btn);
	  
	  
	  return true; } catch(Exception ex) { System.out.println(ex); return false; }
	 }
}
