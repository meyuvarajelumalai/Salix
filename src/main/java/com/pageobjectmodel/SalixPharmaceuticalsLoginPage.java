package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Base_Class;
import com.interfaceelements.SalixPharmaceuticalsApplicationElements;
import com.srcmainresources.FileReaderManger;

public class SalixPharmaceuticalsLoginPage extends Base_Class implements SalixPharmaceuticalsApplicationElements{
	

	@FindBy(name = username_name)
	private WebElement username;
	
	@FindBy(name = password_name)
	private WebElement password;
	
	@FindBy(xpath = login_xpath )
	private WebElement login;

	public SalixPharmaceuticalsLoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);

	}
	
	public void validUserNameAndValidPassword() throws IOException {
	
	FileReaderManger data = new FileReaderManger();
	launchUrl(data.getDataProperty("url"));
	implicitWait(30);
	passInput(username, data.getDataProperty("loginusername"));
	passInput(password, data.getDataProperty("loginpassword"));
	elementClick(login);
	}
}
