package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/login.do;jsessionid=6fvsbqvsbvnsp");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		//driver.findElement(By.xpath("//td[input[@type='password']]")).sendKeys("manager");
		//driver.findElement(By.xpath("//a[div[text()='Users']]")).click();
		driver.navigate().back();
		Thread.sleep(2000);
	driver.navigate().forward();
		driver.navigate().refresh();
		
		//td[input[@type='text']]
		
		
	    
		
		
		

	}

}
