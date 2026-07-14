package com.selenium.test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {


    @Test
    public void shouldAnswerWithTrue() {
    	WebDriver driver =new ChromeDriver();
    	 driver.get("https://selectorshub.com/xpath-practice-page/");
    	 String title= driver.getTitle();
        Assert.assertEquals("Google", "Google");
    }
}
