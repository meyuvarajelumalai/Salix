package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Base_Class;
import com.excelutility.ExcelUtility;
import com.interfaceelements.SalixPharmaceuticalsApplicationElements;

public class SalixPharmaceuticalsEngagementCreatPage extends Base_Class implements SalixPharmaceuticalsApplicationElements {

	@FindBy(xpath = engagementCreate_xpath)
	private WebElement creat;
	
	@FindBy(xpath = selectProduct_xpath)
	private WebElement selectProduct;
	
	@FindBy(xpath = selectEngagementType_xpath )
	private WebElement selectEngagementType;
	
	@FindBy(xpath = selectTopic_xpath )
	private WebElement selectEngagementTopic;
	
	@FindBy(xpath = selectDate_xpath )
	private WebElement selectDate;
	
	@FindBy(xpath = selectTimeZone_xpath )
	private WebElement selectTimeZone;
	
	@FindBy(xpath = selectTime_xpath )
	private WebElement selectTime;
	
	@FindBy(xpath = dateContinue_xpath )
	private WebElement dateContinue;
	
	@FindBy(xpath = dateNext_xpath )
	private WebElement dateNext;
	
	public SalixPharmaceuticalsEngagementCreatPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	public void creatingAnEngagement() throws InterruptedException {
	elementClick(creat);
	elementClick(selectProduct);
	elementClick(selectEngagementType);
	javaScriptClick(selectEngagementTopic);
	elementClick(selectDate);
	selectByVisibleText(selectTimeZone, ExcelUtility.getCellValue("Registration","user","timeZone"));
	localWait(5000);
	javaScriptClick(selectTime);
	javaScriptClick(dateContinue);
	elementClick(dateNext);
	
	
	
	
	
	
	
	}
	
}
