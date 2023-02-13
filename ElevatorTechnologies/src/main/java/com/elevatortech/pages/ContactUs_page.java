package com.elevatortech.pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiondriver.ActionDriver;

public class ContactUs_page {

	public WebDriver driver;

	public ContactUs_page(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='name']")
	WebElement namefield;

	@FindBy(xpath = "//input[@id='email']")
	WebElement emailfield;

	@FindBy(xpath = "//input[@id='mobile']")
	WebElement mobilefield;

	@FindBy(xpath = "//input[@id='city']")
	WebElement cityfield;

	@FindBy(xpath = "//input[@id='state']")
	WebElement statefield;

	@FindBy(xpath = "//textarea[@name='mess']")
	WebElement msgfield;

	@FindBy(name = "btnreset")
	WebElement resetbtn;

	@FindBy(name = "send")
	WebElement sendbtn;

	@FindBy(xpath = "//a[text()='Contact Us']")
	WebElement contactus;

	public void contactFormReset(String uname, String uemail, String uph, String ucity, String ustate, String umsg)
			throws InterruptedException {

		ActionDriver.click(driver, contactus);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		ActionDriver.type(namefield, uname);

		Thread.sleep(2000);

		ActionDriver.type(emailfield, uemail);

		Thread.sleep(2000);

		ActionDriver.type(mobilefield, uph);

		Thread.sleep(2000);

		ActionDriver.type(cityfield, ucity);

		Thread.sleep(2000);

		ActionDriver.type(statefield, ustate);

		Thread.sleep(2000);

		ActionDriver.type(msgfield, umsg);
		Thread.sleep(4000);

		ActionDriver.click(driver, resetbtn);

	}

	public String contactFormSubmit(String uname, String uemail, String uph, String ucity, String ustate, String umsg)
			throws InterruptedException {

		ActionDriver.click(driver, contactus);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		ActionDriver.type(namefield, uname);

		Thread.sleep(2000);

		ActionDriver.type(emailfield, uemail);

		Thread.sleep(2000);

		ActionDriver.type(mobilefield, uph);

		Thread.sleep(2000);

		ActionDriver.type(cityfield, ucity);

		Thread.sleep(2000);

		ActionDriver.type(statefield, ustate);

		Thread.sleep(2000);

		ActionDriver.type(msgfield, umsg);
		Thread.sleep(4000);

		ActionDriver.click(driver, sendbtn);

		Thread.sleep(3000);

		Alert alt = driver.switchTo().alert();
		
		Thread.sleep(3000);

		String altmsg = alt.getText();

		Thread.sleep(2000);

		alt.accept();

		return altmsg;
		
		

	}

}
