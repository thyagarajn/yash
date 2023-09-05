package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wrok3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  WebDriver driver = new ChromeDriver();
  driver.get("https://www.amazon.in/");
  driver.manage().window().maximize();
//  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
  //driver.findElement(By.id("nav-search-submit-button")).click();
  driver.findElement(By.xpath("//a[@tabindex='0']")).click();
	  Thread.sleep(1000);
	 
	}

}
