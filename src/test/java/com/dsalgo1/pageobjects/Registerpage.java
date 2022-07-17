package com.dsalgo1.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo1.testCases.Baseclass;

public class Registerpage extends Baseclass {
	
	public Registerpage(){
	PageFactory.initElements(driver,this);
		}
	@FindBy(xpath="//input[@id='id_username']")
	WebElement txt_Username;
	
	@FindBy(xpath="//input[@id='id_password1']")
	WebElement txt_Password;
	
	@FindBy(xpath="//input[@id='id_password2']")
	WebElement txt_ConfirmPassword;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement Loginbtn;
	
	public void Username(String Username) {
		txt_Username.sendKeys(Username);
	}

	public void Password(String Password1) {
		txt_Password.sendKeys(Password1);
		
	}
	public void ConfirmPassword(String Password2) {
		txt_ConfirmPassword.sendKeys(Password2);
}
	public void ClickLoginButton() {
		Loginbtn.click();
	}
	
}
