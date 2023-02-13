package com.elevatortech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiondriver.ActionDriver;

public class Programming_page {

	public WebDriver driver;

	public Programming_page(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//a[@class='has-submenu'])[3]")
	WebElement stcbtn;

	@FindBy(xpath = "(//a[@class='has-submenu'])[3]")
	WebElement programbtn;

	@FindBy(xpath = "//a[text()='C Programming']")
	WebElement cprogrambtn;

	@FindBy(xpath = "//h4[text()='Course Objective:']")
	WebElement cprogrampage;

	@FindBy(xpath = "//a[text()='C++ Programming']")
	WebElement cplusprogrambtn;

	@FindBy(tagName = "h2")
	WebElement cplusprogrampage;

	@FindBy(xpath = "//a[text()='C/C++ with Data Structures']")
	WebElement datastructurebtn;

	@FindBy(xpath = "//h4[text()='C Basics']")
	WebElement datastructurepage;

	@FindBy(xpath = "//a[text()='Objective C']")
	WebElement objectivebtn;

	@FindBy(xpath = "//h4[text()='Course objectives:']")
	WebElement objectivepage;

	public void clickingProgramming() {

		stcbtn.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		programbtn.click();
		ActionDriver.mouseHoverAndClickonElement(cprogrambtn);

	}

	public boolean enteringClangPage() throws InterruptedException {

		ActionDriver.scrollByVisibilityofElement(driver, cprogrampage);

		Thread.sleep(2000);

		return ActionDriver.isDisplayed(driver, cprogrampage);

	}

	public boolean clickingcplusbutton() {

		stcbtn.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		programbtn.click();
		ActionDriver.mouseHoverAndClickonElement(cplusprogrambtn);
		return ActionDriver.isDisplayed(driver, cplusprogrampage);

	}

	public boolean clickingDataStructurebutton() {

		stcbtn.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		programbtn.click();
		ActionDriver.mouseHoverAndClickonElement(datastructurebtn);

		ActionDriver.scrollByVisibilityofElement(driver, datastructurepage);
		return ActionDriver.isDisplayed(driver, datastructurepage);

	}

	public boolean enteringObjectivepage() {

		stcbtn.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		programbtn.click();

		ActionDriver.mouseHoverAndClickonElement(objectivebtn);

		ActionDriver.scrollByVisibilityofElement(driver, objectivepage);
		return ActionDriver.isDisplayed(driver, objectivepage);

	}

}
