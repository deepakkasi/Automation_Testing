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
	private By firstName=By.xpath("//input[@id=\"AccountFrm_firstname\"]");
	private By lastName=By.xpath("//input[@id=\"AccountFrm_lastname\"]");
	private By email=By.xpath("//input[@id=\"AccountFrm_email\"]");
	private By address=By.xpath("//input[@id=\"AccountFrm_address_1\"]");
	private By newsletter=By.xpath("//label[@for=\"AccountFrm_newsletter1\"]/input");
	private By city=By.xpath("//input[@id=\"AccountFrm_city\"]");
	private By zoneDropdodown=By.xpath("//select[@id=\"AccountFrm_zone_id\"]/option[text()=\"Karnataka\"]");
	private By zipCode=By.xpath("//input[@id=\"AccountFrm_postcode\"]");
	private By countryDropdown=By.xpath("//select[@id=\"AccountFrm_country_id\"]/option[text()=\"India\"]");
	private By username=By.xpath("//input[@id=\"AccountFrm_loginname\"]");
	private By password=By.xpath("//input[@name=\"password\"]");
	private By company_name=By.xpath("//input[@id=\"AccountFrm_company\"]");
	private By confirm_password=By.xpath("//input[@name=\"confirm\"]");
	private By agreeCheckBox=By.xpath("//input[@id=\"AccountFrm_agree\"]");
	private By register_btn=By.xpath("//button[@title=\"Continue\"]");
	
	
	
	  public boolean registerUser() { try {
		  
	//click(gender_female);
	clearAndFill(firstName,"guna");
	clearAndFill(lastName,"deepika");
	 clearAndFill(email,"abc987@gmail.com");
	 //clearAndFill(password,"pass");
	 clearAndFill(company_name,"abc pvt ltd");
	 clearAndFill(address,"abc pvt ltd");
	 selectDropdown(countryDropdown, "India");
	 selectDropdown(zoneDropdodown, "Karnataka");
	 clearAndFill(city,"Hubli");
	 clearAndFill(zipCode,"546321");
	  click(newsletter);
	  clearAndFill(username,"user1436");
	  clearAndFill(password,"pass@12345");
	  clearAndFill(confirm_password,"pass@12345");
	  click(agreeCheckBox);
	  click(register_btn);
	  
	  
	  return true; } catch(Exception ex) { System.out.println(ex); return false; }
	 }
}
