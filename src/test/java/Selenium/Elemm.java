package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elemm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		String URL = " https://Amazon.com";
		driver.get(URL);
		Thread .sleep(5000);
		driver .manage().window().maximize();
	driver.navigate().to("https://demo.guru99.com/");
	Thread .sleep(5000);
		
	driver.navigate().back();
	Thread.sleep(5000);
	
	driver.navigate().forward();
	
		
	}

}
