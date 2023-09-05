package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendr {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='sc-12foipm-22 oSYrJ fswDownArrow']")).click();
		
		String mm ="Dec";
		String dd = "17";
		String  yy = "2023";
		
		
		int i =1;
		while (i<=12)
			
		{
			try 
			{
				driver.findElement(By.xpath("//div[contains(@aria-label,'"+mm+" "+dd+" "+yy+"')]")).click();
				
				driver.findElement(By.xpath("//span[text()='Done']")).click();
				driver.findElement(By.xpath("//a[text()='Cancel']")).click();
				
				break;
				
				
			}
			
			catch(Throwable t)
			
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				
				
	}
			
		}
		
			
			
		
			
		
		
		
		
		
		
		
		
		
		
	}

	private static void While() {
		// TODO Auto-generated method stub
		
	}

}
