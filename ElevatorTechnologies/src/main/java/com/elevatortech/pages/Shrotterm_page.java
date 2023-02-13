package com.elevatortech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiondriver.ActionDriver;

public class Shrotterm_page {

	public WebDriver driver;
	

	public Shrotterm_page(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//a[@class='has-submenu'])[3]")
	WebElement stcbtn;

	@FindBy(xpath = "//a[text()='Back-end Cadence Training Course']")
	WebElement btc;

	@FindBy(tagName = "h2")
	WebElement stcpage;

	@FindBy(xpath = "(//a[text()='Bigdata'])[2]")
	WebElement bigdatabtn;

	@FindBy(xpath = "//h4[text()='3.	MapReduce – Part1']")
	WebElement bigdatapage;

	@FindBy(xpath = "(//a[text()='Cloud Computing'])[2]")
	WebElement Cloudbtn;

	@FindBy(xpath = "//h4[text()='1.	Introduction to Cloud Computing']")
	WebElement cloudpage;
	
	@FindBy(xpath = "//a[text()='VHDL']")
	WebElement vhdlbtn;

	@FindBy(xpath = "//h4[text()='Course objectives:']")
	WebElement vhdlpage;
	
	
	@FindBy(xpath = "//a[text()='Verilog']")
	WebElement verilogbtn;
	
	@FindBy(xpath = "//div[text()='VERILOG']")
	WebElement verilogpage;
	
	
	@FindBy(xpath = "//a[text()='System Verilog']")
	WebElement systemverilogbtn;
	
	@FindBy(xpath = "//div[text()='SYSTEM VERILOG']")
	WebElement systemverilogpage;
	
	@FindBy(xpath = "//a[text()='Summer Training']")
	WebElement summertrainingbtn;
	
	@FindBy(xpath = "//div[text()='SUMMER TRAINING']")
	WebElement summertrainingpage;
	
	@FindBy(xpath = "//a[text()='Workshops']")
	WebElement workshopbtn;
	
	@FindBy(xpath = "//div[text()='OUR WORKSHOPS']")
	WebElement workshopPage;
	
	
	
	public boolean VHDLpage() throws InterruptedException {

		stcbtn.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ActionDriver.mouseHoverAndClickonElement(vhdlbtn);
		
		Thread.sleep(2000);
		
		ActionDriver.scrollByVisibilityofElement(driver, vhdlpage);
	return	ActionDriver.isDisplayed(driver, vhdlpage);

	}

	
	public boolean VeriLogPage() {

		stcbtn.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ActionDriver.mouseHoverAndClickonElement(verilogbtn);
	return	ActionDriver.isDisplayed(driver, verilogpage);

	}

	public boolean SummerTrainingPage() throws InterruptedException {

		stcbtn.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ActionDriver.mouseHoverAndClickonElement(summertrainingbtn);
		Thread.sleep(2000);
	return	ActionDriver.isDisplayed(driver, summertrainingpage);

	}
	
	public boolean SystemVeriLogPage() {

		stcbtn.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ActionDriver.mouseHoverAndClickonElement(systemverilogbtn);
	return	ActionDriver.isDisplayed(driver, systemverilogpage);

	}
	
	public boolean workShopPage() {

		stcbtn.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ActionDriver.mouseHoverAndClickonElement(workshopbtn);
	return	ActionDriver.isDisplayed(driver, workshopPage);

	}
	
	
	
	
	
	public void shrotTermoption() {

		stcbtn.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ActionDriver.mouseHoverAndClickonElement(btc);

	}

	public boolean enteringShrotTermPage() {

		return ActionDriver.isDisplayed(driver, stcpage);

	}

	public void bigDataoption() {

		stcbtn.click();

		ActionDriver.mouseHoverAndClickonElement(bigdatabtn);

	}

	public boolean enteringBigDataPage() {

		return ActionDriver.isDisplayed(driver, bigdatapage);

	}

	public void cloudComputing() {

		stcbtn.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ActionDriver.mouseHoverAndClickonElement(Cloudbtn);

	}

	public boolean enteringCloudComputingPage() throws InterruptedException {

		ActionDriver.scrollByVisibilityofElement(driver, cloudpage);
		
		Thread.sleep(2000);
		
		return ActionDriver.isDisplayed(driver, cloudpage);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
