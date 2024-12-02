package com.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.baseclass.Base_Class;

public class ITestListenerClass extends Base_Class implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		
		try {
			ExtentReport_Test.extenttest.pass(result.getMethod().getMethodName()+ " : " + "Test Pass"
		,MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void onTestFailure(ITestResult result) {
		try {
			ExtentReport_Test.extenttest.fail(result.getMethod().getMethodName()+ " : " + "Test Fail",
					MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
