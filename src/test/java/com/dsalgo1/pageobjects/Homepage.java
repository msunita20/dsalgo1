package com.dsalgo1.pageobjects;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo1.testCases.Baseclass;

public class Homepage extends Baseclass {


public Homepage() 
	 {
	
    PageFactory.initElements(driver,this);
	 }

@FindBy(linkText="Register")
  WebElement Registerbtn;

public  void ClickRegisterButton() 
{
	
	 Registerbtn.click();

	 	 }
 
		 
	}



	
	

