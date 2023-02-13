package com.elevatortech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiondriver.ActionDriver;

public class MicroController_page {

	public WebDriver driver;

	public MicroController_page(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//a[@class='has-submenu'])[3]")
	WebElement stcbtn;

	@FindBy(xpath = "(//a[@class='has-submenu'])[4]")
	WebElement mcbtn;

	@FindBy(xpath = "//a[text()='8051 Microcontroller']")
	WebElement mccontrolbtn;

	@FindBy(xpath = "//div[text()='8051 MICROCONTROLLER']")
	WebElement controlpage;

	@FindBy(xpath = "//a[text()='ARM']")
	WebElement armbtn;

	@FindBy(xpath = "//div[text()='ARM Controller']")
	WebElement armcontrolpage;

	@FindBy(xpath = "//a[text()='AVR']")
	WebElement avrbtn;

	@FindBy(xpath = "//div[text()='AVR Based Embedded Systems']")
	WebElement avrcontrolpage;

	@FindBy(xpath = "//a[text()='PIC']")
	WebElement picbtn;

	@FindBy(xpath = "//div[text()='PIC Microcontroller Training']")
	WebElement picpage;

	public void clickingmicrocontroller() {

		stcbtn.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		mcbtn.click();
		ActionDriver.mouseHoverAndClickonElement(mccontrolbtn);

	}

	public boolean enteringmcPage() throws InterruptedException {

		Thread.sleep(2000);

		ActionDriver.scrollByVisibilityofElement(driver, controlpage);

		Thread.sleep(2000);

		return ActionDriver.isDisplayed(driver, controlpage);

	}

	public boolean enteringArmpage() throws InterruptedException {

		stcbtn.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		mcbtn.click();
		ActionDriver.mouseHoverAndClickonElement(armbtn);

		Thread.sleep(2000);

		return ActionDriver.isDisplayed(driver, armcontrolpage);

	}

	public boolean enteringAvmcontrolpage() throws InterruptedException {

		stcbtn.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		mcbtn.click();
		ActionDriver.mouseHoverAndClickonElement(avrbtn);

		Thread.sleep(2000);

		return ActionDriver.isDisplayed(driver, avrcontrolpage);

	}

	
	public boolean enteringpicpage() throws InterruptedException {

		stcbtn.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		mcbtn.click();
		ActionDriver.mouseHoverAndClickonElement(picbtn);

		Thread.sleep(2000);

		return ActionDriver.isDisplayed(driver, picpage);

	}
	
	
	
	
	
	
	
	
	
	
	
	
}
