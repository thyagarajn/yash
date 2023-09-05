package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		

		WebDriver driver= new ChromeDriver();
		driver.get("http://127.0.0.1/login.do;jsessionid=s1tf0oi9sdrf");
		driver.manage().window().maximize(); 
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.linkText("n, thyagaga (yash)")).click();
		driver.findElement(By.xpath("//input[@value='Delete This User']")).click();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(1000);
		Alert alt2 = driver.switchTo().alert();
		alt2.accept();
				
		
	}

}
