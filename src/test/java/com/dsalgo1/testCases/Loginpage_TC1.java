package com.dsalgo1.testCases;




import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dsalgo1.pageobjects.Loginpage;
import com.dsalgo1.utilities.XLUtils;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class Loginpage_TC1 extends Baseclass{
	@Test(dataProvider="Logindata")
	
	public void LoginpageTest(String user,String pwd) throws InterruptedException {
		Loginpage lp =new Loginpage();
		lp.enterUsername(user);
		Logger.info("Username Entered");
		lp.enterPassword(pwd);
		Logger.info("Password entered");
		lp.clickLoginbtn();
		
	}
	@Test(priority=2,description="verify Signout button")
	@Severity(SeverityLevel.BLOCKER)
	public void Loginvalidity() {
		Assert.assertTrue(Loginpage.SignoutbtnVisibility(),"Signoutbutton not displayed");
	    
		}
	
   @DataProvider(name="Logindata")
	String[][] getData() throws Exception
	{
		String path="C:\\Users\\msuni\\eclipse-workspace\\dsalgo1\\src\\test\\java\\com\\dsalgo1\\testData\\testdata1 (1).xlsx";
		int rownum=XLUtils.getRowCount(path,"Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String [rownum][colcount];
		
		for(int i=1;i<=rownum;i++) 
		{
		for(int j=0;j<colcount;j++) {
			
			logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
		}
		
		}
		return logindata;
	}

}
