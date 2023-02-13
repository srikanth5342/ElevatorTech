package com.elevatortech.pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiondriver.ActionDriver;

public class Home_page {

	public WebDriver driver;

	public Home_page(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//img[@alt='Elevator Technologies']")
	WebElement logo;

	@FindBy(xpath = "//a[text()='Contact Us']")
	WebElement contactus;

	@FindBy(xpath = "(//a[@target='_blank']/img)[1]")
	WebElement facebookicon;

	public boolean logo() throws IOException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		File source = logo.getScreenshotAs(OutputType.FILE);

		File dest = new File(".\\Screenshots\\Logo.jpg");

		FileUtils.copyFile(source, dest);

		return ActionDriver.isDisplayed(driver, logo);

	}

	public String clickContactUs() {

		ActionDriver.click(driver, contactus);

		String url = driver.getTitle();

		return url;

	}

	public void facebook() throws InterruptedException {

		ActionDriver.click(driver, facebookicon);

		String parentwindowtitle = driver.getWindowHandle();

		System.out.println(parentwindowtitle);

		Set<String> allwindows = driver.getWindowHandles();

		for (String window : allwindows) {

			if (!window.equals(parentwindowtitle)) {

				Thread.sleep(2000);

				driver.switchTo().window(window);

				break;

			}
		
			
		}

	}

}
