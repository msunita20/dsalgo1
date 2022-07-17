package com.dsalgo1.testCases;

import org.testng.annotations.Test;


import com.dsalgo1.pageobjects.Stackpage;

public class Stackpage_TC1 extends Baseclass{
	
		
		@Test
		public void StackpageTest() throws InterruptedException  {
		Stackpage sp=new Stackpage();
		sp.ClickGetstarted();
		sp.ClickOperation();
		sp.tryHere();
		sp.ClickImplement();
		sp.tryHere();
		sp.ClickApplication();
		sp.tryHere();

}
}
