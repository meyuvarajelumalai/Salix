package com.pageobjectmanager;


import com.baseclass.Base_Class;
import com.pageobjectmodel.SalixPharmaceuticalsLoginPage;
import com.pageobjectmodel.SalixPharmaceuticalsSelectDetailsPage;
import com.pageobjectmodel.SalixPharmaceuticalsEngagementCreatPage;
import com.srcmainresources.FileReaderManger;

public class SalixPharmaceuticalsPageOjectManager extends Base_Class {
	
	private SalixPharmaceuticalsLoginPage loginPage;
	private SalixPharmaceuticalsEngagementCreatPage creatPage;
	private SalixPharmaceuticalsSelectDetailsPage selectPage;
	private FileReaderManger fileReader;
	
	public SalixPharmaceuticalsLoginPage getLoginPage() {
		if (loginPage == null) {
			loginPage = new SalixPharmaceuticalsLoginPage(driver);
		}
		return loginPage;
	}
	public SalixPharmaceuticalsEngagementCreatPage getCreatPage() {
		if (creatPage == null) {
			creatPage = new SalixPharmaceuticalsEngagementCreatPage(driver);
		}
		return creatPage;
	}
	public SalixPharmaceuticalsSelectDetailsPage getSelectPage() {
		if (selectPage == null) {
			selectPage = new SalixPharmaceuticalsSelectDetailsPage(driver);
		}
		return selectPage;
	}
	public FileReaderManger getFileReader() {
		if (fileReader == null) {
			fileReader = new FileReaderManger();
		}
		return fileReader;
	}
	
	}

	

