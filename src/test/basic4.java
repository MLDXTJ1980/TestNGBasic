package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class basic4 {
	@Parameters({"URL"})
	@Test
	public void WebLoginHomeLoan(String uname)
	{
		//selenium	
		System.out.println("webloginHome");
		System.out.println(uname);
	}
	@Test(groups= {"smoke"})
	public void MobileLoginHomeLoan()
	{
		//Appium
		System.out.println("MobileloginHome");
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{
		//Rest API automation
		System.out.println("APIloginHome");
	}

}
