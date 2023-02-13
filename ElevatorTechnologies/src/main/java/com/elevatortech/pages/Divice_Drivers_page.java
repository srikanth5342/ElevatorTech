package com.elevatortech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiondriver.ActionDriver;

public class Divice_Drivers_page {

	
	
	public WebDriver driver;

	public Divice_Drivers_page(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "(//a[@class='has-submenu'])[3]")
	WebElement stcbtn;
	
	
	@FindBy(xpath = "(//a[@class='has-submenu'])[5]")
	WebElement devicebtn;
	
	
	@FindBy(xpath = "//a[text()='Device Drivers For ARM9']")
	WebElement devicearmbtn;
	
	@FindBy(xpath = "//div[text()='DEVICE DRIVERS FOR ARM9']")
	WebElement devicearmpage;
	
	@FindBy(xpath = "//a[text()='Device Drivers For PC']")
	WebElement devicepcbtn;
	

	@FindBy(xpath = "//div[text()='DEVICE DRIVERS FOR PC']")
	WebElement devicepcpage;
	
	
	
	public void clickingDeviceDrivers() {

		stcbtn.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		devicebtn.click();
		ActionDriver.mouseHoverAndClickonElement(devicearmbtn);

	}

	
	public boolean enteringDeviceARMpage() throws InterruptedException {

		

		Thread.sleep(2000);

		return ActionDriver.isDisplayed(driver, devicearmpage);

	}

	public boolean enteringpcpage() throws InterruptedException {

		stcbtn.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		devicebtn.click();
		ActionDriver.mouseHoverAndClickonElement(devicepcbtn);

		Thread.sleep(2000);

		return ActionDriver.isDisplayed(driver, devicepcpage);

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
