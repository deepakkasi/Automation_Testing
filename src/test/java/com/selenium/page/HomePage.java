package com.selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.base.BasePage;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver webDriver) {
		super(webDriver);
	}
	
	private By register=By.xpath("//a[text()='Register']");
	private By login=By.xpath("//a[text()='Log in']");
	private By wishList=By.xpath("//a/span[text()='Wishlist']");
	private By searchBar=By.xpath("//input[@id=\"small-searchterms\"]");
	private By searchBtn=By.xpath("//button[text()='Search']");
	private By currency=By.xpath("//select[@id=\"customerCurrency\"]");
	private By shoppingCart=By.id("//a/span[text()='Shopping cart']");
	private By computerMenu=By.xpath("//a[text()='Computers']");
	private By electronicsMenu=By.xpath("//a[text()='Electronics']");
	private By electronicCategory=By.xpath("//a/img[@title='Show products in category Electronics']");
	
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
