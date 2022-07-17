package com.dsalgo1.testCases;

import org.testng.annotations.Test;


import com.dsalgo1.pageobjects.Registerpage;

public class Registerpage_TC1 extends Baseclass{
	@Test
	public void RegisterpageTest(){
		Registerpage rp=new Registerpage();
		 rp.Username(Username);
		 rp.Password(Password);
		 rp.ConfirmPassword(ConfirmPassword);
		 rp.ClickLoginButton();
		 


}
}
