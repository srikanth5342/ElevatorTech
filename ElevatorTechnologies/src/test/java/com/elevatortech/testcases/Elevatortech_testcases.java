package com.elevatortech.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.elevatortech.base.BaseClass;
import com.elevatortech.pages.ContactUs_page;
import com.elevatortech.pages.Divice_Drivers_page;
import com.elevatortech.pages.Home_page;
import com.elevatortech.pages.MicroController_page;
import com.elevatortech.pages.Mobile_page;
import com.elevatortech.pages.Operating_Systempage;
import com.elevatortech.pages.Programming_page;
import com.elevatortech.pages.RandD_page;
import com.elevatortech.pages.Shrotterm_page;

public class Elevatortech_testcases extends BaseClass {

	Home_page homepage;
	ContactUs_page contactus;
	RandD_page rdpage;
	Shrotterm_page shrotpage;
	Programming_page propage;
	MicroController_page micropage;
	Divice_Drivers_page devicedriver;
	Operating_Systempage operating;
	Mobile_page mobileapp;

	@Test(priority = 1)
	public void test() throws IOException {

		homepage = new Home_page(driver);

		boolean flag = homepage.logo();

		Assert.assertTrue(flag);

	}

	@Test(priority = 2)
	public void verifyclick() {

		String actual = homepage.clickContactUs();

		String exp = "Elevator Technologies";

		Assert.assertEquals(actual, exp);

	}

	@Test(priority = 3)
	public void verifyContactformReset() throws InterruptedException {

		contactus = new ContactUs_page(driver);

		contactus.contactFormReset(prop.getProperty("name"), prop.getProperty("email"), prop.getProperty("mobile"),
				prop.getProperty("city"), prop.getProperty("state"), prop.getProperty("msg"));

	}

	@Test(priority = 4)
	public void verifyContactformSubmit() throws InterruptedException {

		contactus = new ContactUs_page(driver);

		String actual = contactus.contactFormSubmit(prop.getProperty("name"), prop.getProperty("email"),
				prop.getProperty("mobile"), prop.getProperty("city"), prop.getProperty("state"),
				prop.getProperty("msg"));

		String exp = "Email Successfully Sent";

		Assert.assertEquals(actual, exp);

	}

	@Test(priority = 5)
	public void verifyFacebookicon() throws InterruptedException {

		homepage.facebook();

	}

	@Test(priority = 6)
	public void verifyRandDoption() throws Exception {

		rdpage = new RandD_page(driver);

		boolean result = rdpage.clickRandDoption();

		Assert.assertTrue(result);

		driver.navigate().back();
	}

	@Test(priority = 7)
	public void verifyBackendTrainingCourse() {

		shrotpage = new Shrotterm_page(driver);
		shrotpage.shrotTermoption();

		boolean result = shrotpage.enteringShrotTermPage();

		Assert.assertTrue(result);

		driver.navigate().back();

	}

	@Test(priority = 8)
	public void verifyBigDataPage() {

		shrotpage = new Shrotterm_page(driver);
		shrotpage.bigDataoption();

		boolean flag = shrotpage.enteringBigDataPage();

		Assert.assertTrue(flag);

		driver.navigate().back();

	}

	@Test(priority = 9)
	public void verifycloudcomputingpage() throws InterruptedException {

		shrotpage = new Shrotterm_page(driver);

		shrotpage.cloudComputing();

		boolean flag = shrotpage.enteringCloudComputingPage();

		Assert.assertTrue(flag);

		driver.navigate().back();

	}

	@Test(priority = 10)
	public void verifyclangpage() throws InterruptedException {

		propage = new Programming_page(driver);

		propage.clickingProgramming();

		boolean flag = propage.enteringClangPage();

		Assert.assertTrue(flag);

		driver.navigate().back();

	}

	@Test(priority = 11)
	public void verifycplusgpage() throws InterruptedException {

		propage = new Programming_page(driver);

		boolean flag = propage.clickingcplusbutton();

		Assert.assertTrue(flag);

		driver.navigate().back();

	}

	@Test(priority = 12)
	public void verifydatastructurepage() throws InterruptedException {

		propage = new Programming_page(driver);

		boolean flag = propage.clickingDataStructurebutton();

		Assert.assertTrue(flag);

		driver.navigate().back();

	}

	@Test(priority = 13)
	public void verifyobjectivepage() throws InterruptedException {

		propage = new Programming_page(driver);

		boolean flag = propage.enteringObjectivepage();

		Assert.assertTrue(flag);

		driver.navigate().back();

	}

	@Test(priority = 14)
	public void verifymicrocontrolpage() throws InterruptedException {

		micropage = new MicroController_page(driver);

		micropage.clickingmicrocontroller();

		boolean flag = micropage.enteringmcPage();

		Assert.assertTrue(flag);

		driver.navigate().back();

	}

	@Test(priority = 15)
	public void verifyarmcontrolpage() throws InterruptedException {

		micropage = new MicroController_page(driver);

		boolean flag = micropage.enteringArmpage();

		Assert.assertTrue(flag);

		driver.navigate().back();

	}

	@Test(priority = 16)
	public void verifyavmcontrolpage() throws InterruptedException {

		micropage = new MicroController_page(driver);

		boolean flag = micropage.enteringAvmcontrolpage();

		Assert.assertTrue(flag);

		driver.navigate().back();

	}

	@Test(priority = 17)
	public void verifypicControlpage() throws InterruptedException {

		micropage = new MicroController_page(driver);

		boolean flag = micropage.enteringpicpage();

		Assert.assertTrue(flag);

		driver.navigate().back();

	}

	@Test(priority = 18)
	public void verifydevicedriversarmepage() throws InterruptedException {

		devicedriver = new Divice_Drivers_page(driver);
		devicedriver.clickingDeviceDrivers();
		boolean flag = devicedriver.enteringDeviceARMpage();

		Assert.assertTrue(flag);

		driver.navigate().back();

	}

	@Test(priority = 19)
	public void verifydevicedriverspcpage() throws InterruptedException {

		devicedriver = new Divice_Drivers_page(driver);

		boolean flag = devicedriver.enteringpcpage();

		Assert.assertTrue(flag);

		driver.navigate().back();

	}

	@Test(priority = 20)
	public void verifylinuxinternalpage() throws InterruptedException {

		operating = new Operating_Systempage(driver);
		operating.clickingOperatingSystem();
		boolean flag = operating.Linuxinternals();

		Thread.sleep(2000);

		Assert.assertTrue(flag);

		driver.navigate().back();

	}

	@Test(priority = 21)
	public void verifyEmbeddedlinuxpage() throws InterruptedException {

		operating = new Operating_Systempage(driver);
		operating.clickingOperatingSystem();
		boolean flag = operating.embeddedLinux();

		Thread.sleep(2000);

		Assert.assertTrue(flag);

		driver.navigate().back();

	}

	@Test(priority = 22)
	public void verifyvxWorkpage() throws InterruptedException {

		operating = new Operating_Systempage(driver);
		operating.clickingOperatingSystem();
		boolean flag = operating.vxWorks();

		Thread.sleep(2000);

		Assert.assertTrue(flag);

		driver.navigate().back();

	}

	@Test(priority = 23)
	public void verifyrtlinuxpage() throws InterruptedException {

		operating = new Operating_Systempage(driver);
		operating.clickingOperatingSystem();
		boolean flag = operating.RTlinux();

		Thread.sleep(2000);

		Assert.assertTrue(flag);

		driver.navigate().back();

	}

	@Test(priority = 24)
	public void verifyrtxpage() throws InterruptedException {

		operating = new Operating_Systempage(driver);
		operating.clickingOperatingSystem();
		boolean flag = operating.RTX();

		Thread.sleep(2000);

		Assert.assertTrue(flag);

		driver.navigate().back();

	}

	@Test(priority = 25)
	public void verifyIphonepage() throws InterruptedException {

		mobileapp = new Mobile_page(driver);
		mobileapp.clickingMobileApplication();
		Thread.sleep(2000);
		boolean flag = mobileapp.Iphone();
		Thread.sleep(2000);

		Assert.assertTrue(flag);

		driver.navigate().back();

	}

	@Test(priority = 26)
	public void verifyAndroidpage() throws InterruptedException {

		mobileapp = new Mobile_page(driver);
		mobileapp.clickingMobileApplication();
		boolean flag = mobileapp.Android();
		Thread.sleep(2000);

		Assert.assertTrue(flag);

		driver.navigate().back();

	}

	@Test(priority = 27)
	public void verifyWindowsmobilepage() throws InterruptedException {

		mobileapp = new Mobile_page(driver);
		mobileapp.clickingMobileApplication();
		boolean flag = mobileapp.WindowsMobile();
		Thread.sleep(2000);

		Assert.assertTrue(flag);

		driver.navigate().back();

	}

	@Test(priority = 28)
	public void verifyBlackBerrypage() throws InterruptedException {

		mobileapp = new Mobile_page(driver);
		mobileapp.clickingMobileApplication();
		boolean flag = mobileapp.BlackBerry();
		Thread.sleep(2000);

		Assert.assertTrue(flag);

		driver.navigate().back();

	}

	@Test(priority = 29)
	public void verifyVHDLpage() throws InterruptedException {

		shrotpage = new Shrotterm_page(driver);
		boolean flag = shrotpage.VHDLpage();

		Thread.sleep(2000);

		Assert.assertTrue(flag);

		driver.navigate().back();

	}

	@Test(priority = 30)
	public void verifyVerilogPage() throws InterruptedException {

		shrotpage = new Shrotterm_page(driver);
		boolean flag = shrotpage.VeriLogPage();

		Thread.sleep(2000);

		Assert.assertTrue(flag);

		driver.navigate().back();

	}

	@Test(priority = 31)
	public void verifySystemVerilogPage() throws InterruptedException {

		shrotpage = new Shrotterm_page(driver);
		boolean flag = shrotpage.SystemVeriLogPage();

		Thread.sleep(2000);

		Assert.assertTrue(flag);

		driver.navigate().back();

	}

	@Test(priority = 32)
	public void verifySummerTrainingPage() throws InterruptedException {

		shrotpage = new Shrotterm_page(driver);
		boolean flag = shrotpage.SummerTrainingPage();

		Thread.sleep(2000);

		Assert.assertTrue(flag);

		driver.navigate().back();

	}

	@Test(priority = 33)
	public void verifyworkshopPage() throws InterruptedException {

		shrotpage = new Shrotterm_page(driver);
		boolean flag = shrotpage.workShopPage();

		Thread.sleep(2000);

		Assert.assertTrue(flag);

		driver.navigate().back();

	}

}
