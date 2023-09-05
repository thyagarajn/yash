package Selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pra1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		String correcturl=driver.getCurrentUrl();
		System.out.println(correcturl);

String tittle =driver.getTitle();
System.out.println(tittle);
driver.manage().window().maximize();
String urlss= "https://www.flipkart.com/";
driver.getCurrentUrl();
System.out.println(urlss);


	}

}
