package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class basic1 {
	@AfterTest            // execute in the end of "Personal Loan"
	public void lastexecution() {
		
		System.out.println("execute last - end of Personal Loan");	
	}
	@AfterSuite       // execute the very last one
	public void Afsuite()
	{
		//Appium
		System.out.println("i am no. 1 from the last");
	}

	@Test
	public void Demo1() {
		
		System.out.println("testNG1");	
		Assert.assertTrue(false);  // test failed here
	}
	
	@Test
	public void Demo2() {
		
		System.out.println("testNG2");	
		
	}

	

}
