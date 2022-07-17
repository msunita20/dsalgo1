package com.dsalgo1.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo1.testCases.Baseclass;

public class LinkedlistPage extends Baseclass {
	public LinkedlistPage() {
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='linked-list']")
	WebElement Getstartedbttn;
	
	@FindBy(xpath="//a[normalize-space()='Introduction']")
	WebElement Introductionbtn;
    @FindBy(xpath="//a[normalize-space()='Creating Linked LIst']")
	WebElement CreateLinkedlistbtn;
	@FindBy(xpath="//a[normalize-space()='Types of Linked List']")
	WebElement Typesoflinkedlistbtn;
	@FindBy(xpath="//a[normalize-space()='Implement Linked List in Python']")
	WebElement Implementlinklistbtn;
	@FindBy(xpath="//a[normalize-space()='Traversal']")
	WebElement Traversalbtn;
	@FindBy(xpath="//a[normalize-space()='Insertion']")
	WebElement Insertionbtn ;
	@FindBy(xpath="//a[normalize-space()='Deletion']")
	WebElement Deletionbtn;
	

	
	By tryHereClick = By.xpath("//a[@href='/tryEditor']");
	By textAreaInput = By.cssSelector(".CodeMirror textarea");
	By runButton = By.xpath("//button[contains(text(),'Run')]");
	By runButtonPractice = By.xpath("//button[@onclick='runit()']");
	
public void clickGetstarted() {
	Getstartedbttn.click();
	
}
public void clickIntroduction() {
	Introductionbtn.click();
	}
public void clickCreateLinked() {
	CreateLinkedlistbtn.click();
}
public void clickTypesofLinked() {
	Typesoflinkedlistbtn.click();
}
public void clickImplementlink() {
	Implementlinklistbtn.click();
}
public void clickTraversal() {
	Traversalbtn.click();
}
public void clickInsertion() {
	Insertionbtn.click();
}
public void clickDeletion() {
	Deletionbtn.click();
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











