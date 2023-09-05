package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesoure {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		// TODO Auto-generated method stub

		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	String pageSource = driver.getPageSource();
    System.out.println(pageSource);
    

    // Close the WebDriver
    driver.quit();
		
	Thread.sleep(2000);
		
	}

}
