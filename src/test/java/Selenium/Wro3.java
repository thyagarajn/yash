package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wro3 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub

		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.className( "_2doB4z")).click();
		Thread.sleep(1000);
		
		
		
		//String title = driver.getTitle();
	//	.args.out.println(title);
	//	driver.switchTo().newWindow(WindowType.TAB);
	//	String urls=" https://www.flipkart.com/";
	//	driver.get(urls);
	//	driver.findElements(By.id("container")).clear();
	}

}
