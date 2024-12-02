package com.runner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.baseclass.Base_Class;
import com.listeners.ExtentReport_Test;
import com.listeners.ITestListenerClass;
import com.pageobjectmanager.SalixPharmaceuticalsPageOjectManager;

@Listeners(ITestListenerClass.class)
public class SalixPharmaceuticalsRunner extends Base_Class {

	SalixPharmaceuticalsPageOjectManager pageObjectManager = new SalixPharmaceuticalsPageOjectManager();

	@BeforeTest
	public void setUp() throws IOException, InterruptedException {
		launchBrowser(pageObjectManager.getFileReader().getDataProperty("browser"));

	}

	@Test(priority = -5)
	private void validLoginTest() throws IOException {
		ExtentReport_Test.extenttest = extentReports
				.createTest("Login Test" + " : " + Thread.currentThread().getStackTrace()[1].getMethodName().toString())
				.info("Valid Login Test");
		pageObjectManager.getLoginPage().validUserNameAndValidPassword();

	}

	@Test(priority = -3)
	private void creatingAnEngagementTest() throws InterruptedException {
		ExtentReport_Test.extenttest = extentReports
				.createTest("Creating Engagement Test" + " : " + Thread.currentThread().getStackTrace()[1].getMethodName().toString())
				.info("Creating Engagement Test");
	pageObjectManager.getCreatPage().creatingAnEngagement();

	}

	@Test(priority = 5)
	private void selectingSpeakerTest() {
		ExtentReport_Test.extenttest = extentReports
				.createTest("selectingSpeaker Test" + " : " + Thread.currentThread().getStackTrace()[1].getMethodName().toString())
				.info("Selecting Speaker Test");
		pageObjectManager.getSelectPage().selectingSpeaker();

	}

	@AfterTest
	private void termination() {
		terminateBrowser();
	}

	@BeforeSuite
	private void extendStartUp() {
		extentReportStart("C:\\Users\\Admin\\eclipse-workspace\\SalixPharmaceuticals\\Reports");
	}
	@AfterSuite
	private void ExtendReportEnd() throws IOException {
		extentReportTearDown("C:\\Users\\Admin\\eclipse-workspace\\SalixPharmaceuticals\\Reports\\index.html");
	}

}
