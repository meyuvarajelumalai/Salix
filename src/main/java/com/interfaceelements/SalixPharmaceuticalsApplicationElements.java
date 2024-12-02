package com.interfaceelements;

public interface SalixPharmaceuticalsApplicationElements {
	
	// Login Elements
	
	String username_name = "email";
	
	String password_name = "password";
	
	String login_xpath = "//button[text()='Log in']";
	
	// Engagement Create Page Elements
	
	String engagementCreate_xpath = "//a[text()='Create']";
	String selectProduct_xpath = "//*[text()='TRULANCE']";
	String selectEngagementType_xpath = "//li[text()=' Virtual All Remote (No Meal)']";
	String selectTopic_xpath = "//div[@class='col-xs-10']";
	String selectDate_xpath = "(//table)[6]/tbody/tr[5]/td[7]";
	String selectTimeZone_xpath = "//select[@name='timezone']";
	String selectTime_xpath = "//*[text()='10:00 AM']";
	String dateContinue_xpath = "//a[text()='Continue']";
	String dateNext_xpath = "//button[@class='btn-sm btn-default pull-right']";
	
	// Engagement Select Details Page Elements
	
	String selectSpeaker_xpath = "//*[text()=' Yes ']";
	String selectSpeakerCount_id = "dtltxt_25";
	String selectSpeakerNext_xpath = "(//a[@class='btn btn-success done-btn ng-star-inserted'])";
	
	

}
