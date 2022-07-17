package com.dsalgo1.utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.dsalgo1.testCases.Baseclass;

import io.qameta.allure.Attachment;


public class Allurelistener implements ITestListener {
	private  static String getTestMethodName(ITestResult iTestResult) {
		return iTestResult.getMethod().getConstructorOrMethod().getName();
		
	}
	 
	 
	@Attachment(value="screenshot", type="image/png")
	 
	 
	public byte[] saveFailureScreenshotAllure(WebDriver driver) {
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	
		
}
	
	public void onTestFailure(ITestResult iTestResult) {
		System.out.println("I am in Test failure method" +getTestMethodName(iTestResult)+"failed");
		Object testClass=iTestResult.getInstance();
		WebDriver driver=Baseclass.getdriver();
		saveFailureScreenshotAllure(Baseclass.driver);
			
		}
	}
	

