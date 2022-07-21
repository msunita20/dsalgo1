package com.dsalgo1.testCases;


import java.io.IOException;




import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.dsalgo1.pageobjects.GetstartedPage;
import com.dsalgo1.utilities.Allurelistener;




@Listeners({Allurelistener.class})
public class GetstartedPage_TC1 extends Baseclass {
	@Test
	public void GetstartedTest() throws  IOException 
	{
      driver.get(baseUrl);
      GetstartedPage gs =new GetstartedPage();
      gs.ClickGetStartedButton();
      
      
    if(driver.getTitle().equalsIgnoreCase("NumpyNinja")) {
    	
    	Assert.assertTrue(true);
    }
    else {
    	captureScreen(driver,"GetstartedPage_TC1");
    	Assert.assertTrue(false);
    	Logger.info("Getstarted Page failed");
    	
//    	saveScreenshotAllure(Baseclass.driver);
//    
//    	@Attachment(value="screenshot", type="image/png")
//    		public byte[] saveScreenshotAllure(WebDriver driver) {
//    			return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    			
    		}
    }
    
	
	}



