package com.elevatortech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiondriver.ActionDriver;

public class Operating_Systempage {

	public WebDriver driver;

	public Operating_Systempage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//a[@class='has-submenu'])[3]")
	WebElement stcbtn;

	@FindBy(xpath = "(//a[@class='has-submenu'])[6]")
	WebElement osbtn;

	@FindBy(xpath = "//a[text()='Linux Internals']")
	WebElement linuxbtn;

	@FindBy(xpath = "//a[text()='Embedded Linux']")
	WebElement embeddedbtn;

	@FindBy(xpath = "//a[text()='VXWorks']")
	WebElement vxbtn;

	@FindBy(xpath = "//a[text()='RT Linux']")
	WebElement rtlinuxbtn;

	@FindBy(xpath = "//a[text()='RTX51']")
	WebElement rtxbtn;

	@FindBy(xpath = "//div[text()='LINUX INTERNALS']")
	WebElement linuxpage;

	@FindBy(xpath = "//div[text()='EMBEDDED LINUX']")
	WebElement embeddedpage;

	@FindBy(xpath = "//div[text()='VX-WORKS']")
	WebElement vxpage;

	@FindBy(xpath = "//div[text()='RT LINUX']")
	WebElement rtlinuxpage;

	@FindBy(xpath = "//div[text()='RTX51']")
	WebElement rtxpage;

	public void clickingOperatingSystem() {

		stcbtn.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		osbtn.click();

	}

	public boolean Linuxinternals() throws InterruptedException {
		
		Thread.sleep(2000);

		ActionDriver.mouseHoverAndClickonElement(linuxbtn);

		return ActionDriver.isDisplayed(driver, linuxpage);

	}

	public boolean embeddedLinux() throws InterruptedException {
		
		Thread.sleep(2000);

		ActionDriver.mouseHoverAndClickonElement(embeddedbtn);

		return ActionDriver.isDisplayed(driver, embeddedpage);

	}
	
	
	public boolean vxWorks() throws InterruptedException {
		
		Thread.sleep(2000);

		ActionDriver.mouseHoverAndClickonElement(vxbtn);

		return ActionDriver.isDisplayed(driver, vxpage);

	}
	
	
	public boolean RTlinux() throws InterruptedException {
		
		Thread.sleep(2000);

		ActionDriver.mouseHoverAndClickonElement(rtlinuxbtn);

		return ActionDriver.isDisplayed(driver, rtlinuxpage);

	}
	
	public boolean RTX() throws InterruptedException {
		
		Thread.sleep(2000);

		ActionDriver.mouseHoverAndClickonElement(rtxbtn);

		return ActionDriver.isDisplayed(driver, rtxpage);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
