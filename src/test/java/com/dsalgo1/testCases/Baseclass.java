package com.dsalgo1.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.dsalgo1.utilities.Readconfig;



public class Baseclass {
	Readconfig readconfig =new Readconfig();
	public String baseUrl =readconfig.getApplicationUrl();
	public String HomeUrl =readconfig.GetHomeUrl();
    public String Username =readconfig.GetUsername();
	public String Password =readconfig.GetPassword();
	public String ConfirmPassword=readconfig.GetConfirmPassword();
	
	public static WebDriver driver;
	
	
	public static Logger Logger;
	
	@Parameters("browserName")
	@BeforeTest
	
	public void Startbrowser(String browser)
	{
		if(browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver","C:\\Users\\msuni\\OneDrive\\Documents\\selenium certification\\Tools\\edgedriver_win64 (1)\\msedgedriver.exe");
		      driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());
		      driver=new ChromeDriver();
	
		}
		else {
			System.out.println("We dont support the browser");
	}

		driver.get(baseUrl);
		
		
	    driver.manage().window().maximize();
		Logger = org.apache.log4j.Logger.getLogger("dsalgo1");
		PropertyConfigurator.configure("log4j.properties");
	}
	
	
	 @AfterTest
     
     public void tearDown()
     {
		driver.quit();
		
}
  public void captureScreen(WebDriver driver, String tname) throws IOException
  {
	  TakesScreenshot ts=(TakesScreenshot)driver;
	  File source = ts.getScreenshotAs(OutputType.FILE);
	  File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname +".png" );
	  FileUtils.copyFile(source, target);
	 System.out.println("Screenshot Taken"); 
	  
	  
  }


public static WebDriver getdriver() {
	// TODO Auto-generated method stub
	return null;
}
    
}



