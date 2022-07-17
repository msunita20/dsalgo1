package com.dsalgo1.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo1.testCases.Baseclass;

public class Stackpage extends Baseclass {
	public Stackpage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a[@href='stack']")
	WebElement Getstartbtn;

	@FindBy(xpath="//a[normalize-space()='Operations in Stack']")
	WebElement Operationstackbtn;
	@FindBy(xpath="//a[normalize-space()='Implementation']")
	WebElement Implementationbtn;
	@FindBy(xpath="//a[normalize-space()='Applications']")
	WebElement Applicationbtn;
	
	By tryHereClick = By.xpath("//a[@href='/tryEditor']");
	By textAreaInput = By.cssSelector(".CodeMirror textarea");
	By runButton = By.xpath("//button[contains(text(),'Run')]");
	By runButtonPractice = By.xpath("//button[@onclick='runit()']");
	

	
	public void ClickGetstarted() {
		Getstartbtn.click();
	}
	public void ClickOperation() {
		Operationstackbtn.click();
	}
		
   public void ClickImplement() {
		Implementationbtn.click();
   }
	public void ClickApplication() {
		Applicationbtn.click();
	}


	public void tryHere() {
		JavascriptExecutor	js = (JavascriptExecutor) driver;
			WebElement element = driver.findElement(tryHereClick);
			js.executeScript("arguments[0].scrollIntoView();", element);
			element.click();
			
			WebElement textarea = driver.findElement(textAreaInput);
			textarea.sendKeys("print(\"Hello World\")");
			driver.findElement(runButton).click();
			driver.navigate().back();
			
			js.executeScript("window.scrollTo(0, 0)");
		}




}
