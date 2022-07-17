package com.dsalgo1.testCases;

import org.testng.annotations.Test;


import com.dsalgo1.pageobjects.Homepage;

public class Homepage_TC1 extends Baseclass{
	@Test
public void HomePageTest() throws InterruptedException {
	Homepage sn=new Homepage();
	 sn.ClickRegisterButton();

}
}
