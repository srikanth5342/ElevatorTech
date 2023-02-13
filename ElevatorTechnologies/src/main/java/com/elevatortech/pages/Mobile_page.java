package com.elevatortech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiondriver.ActionDriver;

public class Mobile_page {

	public WebDriver driver;

	public Mobile_page(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//a[@class='has-submenu'])[3]")
	WebElement stcbtn;

	@FindBy(xpath = "(//a[@class='has-submenu'])[7]")
	WebElement mobileappbtn;

	@FindBy(xpath = "//a[text()='Iphone']")
	WebElement iphonebtn;

	@FindBy(xpath = "(//a[text()='Android'])[2]")
	WebElement androidbtn;

	@FindBy(xpath = "//a[text()='Windows Mobile']")
	WebElement windowsbtn;

	@FindBy(xpath = "//a[text()='Blackberry']")
	WebElement blackberrybtn;

	@FindBy(xpath = "//span[text()='IPhone']")
	WebElement iphonepage;

	@FindBy(xpath = "//div[text()='ANDROID']")
	WebElement androidpage;

	@FindBy(xpath = "//div[text()='WINDOWS MOBILE']")
	WebElement windowspage;

	@FindBy(xpath = "//div[text()='BLACKBERRY']")
	WebElement blackberrypage;

	public void clickingMobileApplication() {

		stcbtn.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		mobileappbtn.click();

	}

	public boolean Iphone() throws InterruptedException {

		Thread.sleep(2000);

		ActionDriver.mouseHoverAndClickonElement(iphonebtn);
		
		Thread.sleep(2000);

		return ActionDriver.isDisplayed(driver, iphonepage);

	}
	
	
	public boolean Android() throws InterruptedException {

		Thread.sleep(2000);

		ActionDriver.mouseHoverAndClickonElement(androidbtn);

		return ActionDriver.isDisplayed(driver, androidpage);

	}
	
	
	public boolean WindowsMobile() throws InterruptedException {

		Thread.sleep(2000);

		ActionDriver.mouseHoverAndClickonElement(windowsbtn);

		return ActionDriver.isDisplayed(driver, windowspage);

	}
	
	public boolean BlackBerry() throws InterruptedException {

		Thread.sleep(2000);

		ActionDriver.mouseHoverAndClickonElement(blackberrybtn);

		return ActionDriver.isDisplayed(driver, blackberrypage);

	}
	
	
	
	
	
	
	
	
	
	
	
	

}
