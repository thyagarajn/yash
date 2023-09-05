package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1/login.do;jsessionid=10lphdg91kgir");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
	//	driver.findElement(By.xpath("//"))
		
		
		
		

	}

}
