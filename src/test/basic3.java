package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class basic3 {
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before executing any methods in this class");
		
	}
	
	@Parameters({"URL","APIKey/usrname"})
	@Test
	public void WebLoginCarLoan(String urlname, String key)
	{
		System.out.println("weblogincar");
		System.out.println(urlname);
		System.out.println(key);
	}
	@BeforeMethod   
	public void beforeevery()    
	{
		System.out.println("i will be executed before every method in basic3");
	}
	@AfterMethod     
	public void afterevery()    
	{
		System.out.println("i will be executed after every method in basic3");
	}
	@AfterClass
	public void afterclass()
	{
			System.out.println("after executing all the methods in this class");
	}
	//@Test(timeOut=4000) // dont fail until 40 seconds
	@Test
	public void MobileLoginCarLoan()
	{
		//Appium
		System.out.println("Mobilelogincar");
	}
	@Test(groups= {"smoke"})
	public void MobileSigninCarLoan()
	{
		//Appium
		System.out.println("MobileSignincar");
	}
	
	//@Test(enabled=false) // skip this test executation
	@Test(dataProvider="getData")
	public void MobileSignoutCarLoan(String username, String password)
	{
		//Appium
		System.out.println("Mobile Signout");
		System.out.println(username);
		System.out.println(password);
	}
	@BeforeSuite   
	public void Bfsuite()
	{
		
		System.out.println("i am no. 1 in all the executed tests");
	}
	@Test(dependsOnMethods= {"WebLoginCarLoan"})
	public void APICarLoan()
	{
		//Rest API automation
		System.out.println("APIlogincar");
	}
	@DataProvider
	public Object[][] getData()
	{
		// 1st - username password - good credit history
		// 2nd - username password - no credit history
		// 3rd - fraudelent credit history 
		Object[][] data = new  Object[3][2];
		// 1st set
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		// columns in the row are nothing but values for that particular combination
		
		// 2nd set
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";
		
		// 2nd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
	}

}
