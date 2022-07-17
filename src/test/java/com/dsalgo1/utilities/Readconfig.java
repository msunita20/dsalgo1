package com.dsalgo1.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	
  Properties pro;

public Readconfig() {
		File src = new File("C:\\Users\\msuni\\eclipse-workspace\\dsalgo1\\ Configuration\\config.properties");
		try
		{
			FileInputStream fis = new FileInputStream(src);
			pro= new Properties();
			pro.load(fis);
		}catch(Exception e) {
			System.out.println("Exception is " + e.getMessage());
			
			}
	}
	
public String getApplicationUrl() {
		
		String url=pro.getProperty("baseURL");
		return url;
		
	}
public String getedgepath() {
	String edgepath=pro.getProperty("edge");
	return edgepath;
	
}

public  String GetHomeUrl() {
	String Url=pro.getProperty("HomeUrl");
	return Url ;
}

public String GetUsername() {
	String Username =pro.getProperty("Username");
	return Username;
}

public String GetPassword() {
	String Password=pro.getProperty("Password");

	return Password ;
}
public String GetConfirmPassword() {
	String Confirmpassword=pro.getProperty("ConfirmPassword");
	return Confirmpassword;
}
public String getchromepath() {
	String chromepath=pro.getProperty("chrome");
	return chromepath;
}

}

