package com.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest extends BaseTest {


    @Test
    public void shouldAnswerWithTrue() {
    	 String title= driver.getTitle();
        Assert.assertEquals("Google", "Google");
    }
}
