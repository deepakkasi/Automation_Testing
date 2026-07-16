package com.selenium.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
	
	protected boolean clearAndFill(By locator,String value) {
		try {
		WebElement element=//driver.findElement(locator);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		element.clear();
		element.sendKeys(value);
		}
		catch(Exception ex) {
			System.out.print(ex);
			return false;
		}
		return true;
	}
	protected boolean clearAndFill(WebElement element,String value) {
		try {
		element.clear();
		element.sendKeys(value);
		}
		catch(Exception ex) {
			System.out.print(ex);
			return false;
		}
		return true;
	}
	protected boolean click(By locator) {
		try {
			WebElement element=wait.until(
					ExpectedConditions.elementToBeClickable(locator));
			element.click();
		}
		catch(Exception ex) {
			System.out.println(ex);
			return false;
		}
		return true;
	}

}
