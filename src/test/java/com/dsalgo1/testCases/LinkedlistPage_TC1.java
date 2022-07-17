package com.dsalgo1.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dsalgo1.pageobjects.LinkedlistPage;


public class LinkedlistPage_TC1 extends Baseclass {
	
		@Test
		public void LinkedlistPageTest() throws InterruptedException  {
		LinkedlistPage ll=new LinkedlistPage();
		ll.clickGetstarted();
		
		ll.clickIntroduction();
		ll.tryHere();
		ll.clickCreateLinked();
		ll.tryHere();
		ll.clickTypesofLinked();
		ll.tryHere();
		ll.clickImplementlink();
		ll.tryHere();
		ll.clickTraversal();
		ll.tryHere();
		ll.clickInsertion();
		ll.tryHere();
		ll.clickDeletion();
		ll.tryHere();
		driver.navigate().to(HomeUrl);
		
	}
//	@Test
//	public void VerifyLinkedlisttitle() {
//		String TreePageTitle=driver.getTitle();
//		System.out.println("Title of page is:");
//		Assert.assertEquals(TreePageTitle, "Linked List");
//		
	}
		
		
	


