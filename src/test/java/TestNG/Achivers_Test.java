package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Achivers_Test
{
	@BeforeMethod
	public void login()
	{
		System.out.println("login to app");
	}
	
	@AfterMethod
	public void logout() {
		
		System.out.println("logout from app");	
		
	}
	
	@Test
	

public void cretecustomer() {
		
		System.out.println("create customer");

}
	
	@Test
	public void deletecretecustomer() 
	{
		System.out.println("delete customer");
		
	}
	
	
	@Test
	public void modifycustomer() {
		
		System.out.println("modify customer");
		
	}
	
	
	
	
}
