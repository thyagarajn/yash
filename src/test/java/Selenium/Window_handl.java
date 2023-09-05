package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_handl {

	public static void main(String[] args) throws InterruptedException, AWTException
	
	{
		WebDriver driver= new ChromeDriver();
		driver.get("http://127.0.0.1/login.do;jsessionid=s1tf0oi9sdrf");
		driver.manage().window().maximize(); 
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		WebElement taks=driver.findElement(By.xpath("//a[div[text()='Tasks']]"));
		Actions act = new Actions(driver);
		act.contextClick(taks).perform();
		Thread.sleep(2000);
		Robot rbt= new Robot();
		rbt.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_ENTER);
		
	Set<String>	s = driver.getWindowHandles();
	
	Iterator<String> it=s.iterator();
	String parent = it.next();
	String child = it.next();
	System.out.println(parent);
	System.out.println(child);
	driver.switchTo().window(child);
	driver.findElement(By.xpath("//input[@value='Create New Tasks']")).click();
	
	
	
	
		
		
		
		
		

	}

}
