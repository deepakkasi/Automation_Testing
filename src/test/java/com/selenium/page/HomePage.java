package com.selenium.page;

import org.openqa.selenium.By;

public class HomePage {
	
	private By userEmail=By.xpath("//input[@dataid=\"sh_email1\"]");
	private By password=By.xpath("//input[@id=\"pass\"]");
	private By company=By.xpath("(//input[@name=\"company\"])[1]");
	private By submit_button=By.xpath("(//button[text()='Submit']");
	private By downloadLink=By.xpath("//a[text()='DownLoad Link']");
	private By userRole=By.xpath("//table[@id=\"resultTable\"]/tbody/tr/td/a[text()='Garry.White']/parent::td/following-sibling::td[1]");
	private By training=By.id("#training");
	private By alert=By.xpath("//button[text()=\"Click To Open Window Alert\"]");
	private By prompt=By.xpath("//button[text()=\"Click To Open Window Prompt Alert\"]");
	private By serach=By.xpath("//input[@id=\"dt-search-0\"]");
	

}
