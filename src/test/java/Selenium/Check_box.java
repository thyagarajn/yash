package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_box {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("http://127.0.0.1/login.do;jsessionid=s1tf0oi9sdrf");
		driver.manage().window().maximize(); 
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[div[text()='Tasks']]")).click();
		Thread.sleep(2000);
 chk=driver.findElement(By.xpath("//table[@class='listTable']/descentant::input[@type='check box']"));
		
		
		
		
		
		
		
	}

}
