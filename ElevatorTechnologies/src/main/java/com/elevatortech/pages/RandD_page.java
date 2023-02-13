package com.elevatortech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiondriver.ActionDriver;

public class RandD_page {
	
	
	public WebDriver driver;

	public RandD_page(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='R & D in VLSI']")
	WebElement randdoption;
	
	@FindBy(xpath = "//h2[text()='R & D in VLSI']")
	WebElement randdpage;
	
	
	
	public boolean clickRandDoption() throws Exception{
		
		ActionDriver.click(driver, randdoption);
		
		Thread.sleep(2000);
		
	return	ActionDriver.isDisplayed(driver, randdpage);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
