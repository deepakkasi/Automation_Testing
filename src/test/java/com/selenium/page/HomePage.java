package com.selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.base.BasePage;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver webDriver) {
		super(webDriver);
	}
	
	private By register=By.xpath("//a[text()='Login or register']");
	private By login=By.xpath("//a[text()='Log in']");
	private By wishList=By.xpath("//a/span[text()='Wishlist']");
	private By searchBar=By.xpath("//input[@name=\"filter_keyword\"]");
	private By searchBtn=By.xpath("//div[@class=\"button-in-search\"]");
	private By currency=By.xpath("//ul[@class=\"dropdown-menu currency\"]/preceding-sibling::a");
	private By shoppingCart=By.id("(//span[text()=\"Cart\"]/parent::a)[1]");
	private By accessories=By.xpath("//div[@class=\"subcategories\"]/preceding-sibling::a[contains(text(),\"Apparel & accessories\")]");
	private By makeUp=By.xpath("//div[@class=\"subcategories\"]/preceding-sibling::a[contains(text(),\"Makeup\")]");
	private By skinCare=By.xpath("//div[@class=\"subcategories\"]/preceding-sibling::a[contains(text(),\"Skincare\")]");
	
	/*
	 * public boolean fillDummyform() { try {
	 * clearAndFill(userEmail,"abc@gmail.com"); clearAndFill(password,"pass");
	 * click(submit_button);
	 * 
	 * return true; } catch(Exception ex) { System.out.println(ex); return false; }
	 * }
	 */
	public boolean navigateToRegister() {
		click(register);
		return true;
		
	}
	

}
