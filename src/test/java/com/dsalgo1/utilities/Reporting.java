package com.dsalgo1.utilities;

import org.testng.TestListenerAdapter;


    import java.io.File;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.util.Date;

	import org.testng.ITestContext;
	import org.testng.ITestResult;
	
	
	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.Status;
	import com.aventstack.extentreports.markuputils.ExtentColor;
	import com.aventstack.extentreports.markuputils.MarkupHelper;
	
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

	import com.aventstack.extentreports.reporter.configuration.*;

	public class Reporting extends TestListenerAdapter
	{
		public ExtentSparkReporter htmlReporter;
	static	public ExtentReports extent;
		public ExtentTest logger;
     static String repName;

		public void onStart(ITestContext testContext)
		{
			String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
			String repName="Test-Report-"+timeStamp+".html";
//            File file=new File("C:\\Users\\msuni\\eclipse-workspace\\dsalgo1\\test-output"+repName);
			htmlReporter=new ExtentSparkReporter("C:\\Users\\msuni\\eclipse-workspace\\dsalgo1\\test-output"+repName);//specify location of the report
			try {
			htmlReporter.loadXMLConfig("C:\\Users\\msuni\\eclipse-workspace\\dsalgo1\\extent-config.xml");
			}catch(IOException e) {
				e.printStackTrace();
			}
			extent=new ExtentReports();

			extent.attachReporter(htmlReporter);
			extent.setSystemInfo("Host name","localhost");
			extent.setSystemInfo("Environemnt","QA");
			extent.setSystemInfo("user","pavan");

			htmlReporter.config().setDocumentTitle("dsalgo1"); // Title of report
			htmlReporter.config().setReportName("Functional Test Automation Report"); // name of the report

			htmlReporter.config().setTheme(Theme.DARK);
		}

		public void onTestSuccess(ITestResult tr)
		{
			logger=extent.createTest(tr.getName()); // create new entry in th report
			logger.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN)); // send the passed information to the report with GREEN color highlighted
		}

		public void onTestFailure(ITestResult tr)
		{
			logger=extent.createTest(tr.getName()); // create new entry in th report
			logger.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.RED)); // send the passed information to the report with GREEN color highlighted

//			String screenshotPath=(System.getProperty("C:\\Users\\msuni\\eclipse-workspace\\dsalgo1\\Screenshots\\"+tr.getName()+".png"));
			String screenshotPath=System.getProperty("user.dir")+"\\Screenshots\\"+tr.getName()+".png";

			File f = new File(screenshotPath); 

			if(f.exists())
			{
			logger.fail("Screenshot is below:" + logger.addScreenCaptureFromPath(screenshotPath));
			}

		}

		public void onTestSkipped(ITestResult tr)
		{
			logger=extent.createTest(tr.getName()); // create new entry in th report
			logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE));
		}

		public void onFinish(ITestContext testContext)
		{
			extent.flush();
//			
//			try {
//				Desktop.getDesktop().browse(new File(repName).toURI());
//			
//		}catch(IOException e) {
			
//	    e.printStackTrace();
	}
		}
//	}


