package com.dsalgo1.pageobjects;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo1.testCases.Baseclass;

public class GetstartedPage extends Baseclass {

	
	 public GetstartedPage() 
	 {
		
		 PageFactory.initElements(driver,this);
	 }
	 

	 @FindBy(xpath="//button[normalize-space()='Get Started']")
   WebElement Getstartedbtn;
	 
	 public void ClickGetStartedButton()
	 {
		 Getstartedbtn.click();
		 	 }
	
	}
	
	               
	
		
	


