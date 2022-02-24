package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basic2 {

	@Test(groups= {"smoke"})
	public void Demo3() {
		
		System.out.println("testNG3");	
	}
	
	@BeforeTest      // execute at the beginning of "Personal Loan"
	public void prerequiste() {
		
		System.out.println("before test - Personal Loan");	
	}
	
	

}
