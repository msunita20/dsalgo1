package com.dsalgo1.pageobjects;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo1.testCases.Baseclass;

public class Loginpage extends Baseclass {
	public Loginpage() {
		PageFactory.initElements(driver,this);	
			}
	
	
	@FindBy(xpath="//input[@id='id_username']")
	WebElement Txt_Username;
	
	@FindBy(xpath="//input[@id='id_password']")
	WebElement Txt_Password;
	
	@FindBy( xpath="//input[@value='Login']")
	WebElement Loginbtn;
	@FindBy(xpath="//div//ul//a[@href='/logout']")
	static
	WebElement btnSignout;
	
	public void enterUsername(String Username) {
		Txt_Username.sendKeys(Username);
	}

	public void enterPassword(String Password) {
		Txt_Password.sendKeys(Password);
}
	public void clickLoginbtn() {
		Loginbtn.click();
	}
	public static boolean SignoutbtnVisibility() {
		return btnSignout.isDisplayed();
	

	}
}

