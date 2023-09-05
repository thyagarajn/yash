package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowexchane {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage()	.window()	.maximize();
		
		
	driver.findElement(By.linkText("/deals?ref_=nav_cs_gb")).click();
		
	Thread.sleep(1000);
	//driver.findElement(By.xpath("//a[@id='nav-xshop']")).click();
	
	String tittle =driver.getTitle();
	System.out.println(tittle);
	//class="nav-a-content"
			//*[@id="nav-xshop"]/a[4]
	}

}
//*[@id="nav-xshop"]/a[4]