package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Base_Class;
import com.excelutility.ExcelUtility;
import com.interfaceelements.SalixPharmaceuticalsApplicationElements;

public class SalixPharmaceuticalsSelectDetailsPage extends Base_Class implements SalixPharmaceuticalsApplicationElements {

	@FindBy(xpath = selectSpeaker_xpath)
	private WebElement selectSpeaker;
	
	@FindBy(id = selectSpeakerCount_id)
	private WebElement speakerCount;
	
	@FindBy(xpath = selectSpeakerNext_xpath )
	private WebElement selectSpeakerNext;
	
	public SalixPharmaceuticalsSelectDetailsPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	public void selectingSpeaker() {
	implicitWait(30);
	javaScriptClick(selectSpeaker);
	javaScriptSenkeys(speakerCount, ExcelUtility.getCellValue("Registration","user","speakerCount"));
	javaScriptClick(selectSpeakerNext);
	
	

	}

}
