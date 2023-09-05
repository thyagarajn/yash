package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demoactitime {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Amazon miniTV")).click();
		//driver.findElement(By.xpath("//a[@href='/minitv?ref_=nav_avod_desktop_topnav']")).click();
	//	driver.findElement(By.linkText("Sell")).click();
		//driver.findElement(By.linkText("Fashion")).click();
		//driver.findElement(By.className("Men's clothing	")).click();
		driver.findElement(By.id("nav-hamburger-menu")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='nav-sprite hmenu-close-icon'][1]")).click();
		
		
		
		
		
		//driver.findElement(By.name("username")).sendKeys("admin");
		//driver.findElement(By.name("pwd")).sendKeys("manager");
		//driver.findElement(By.id("loginButton")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("(//img[@class='sizer'])[1]")).click();
		//driver.findElement(By.className("navItem relative")).click();
	//	WebElement menu= driver.findElement(By.linkText("/gp/bestsellers/?ref_=nav_cs_bestsellers "));
		//Actions actions = new Actions(driver);
		//actions.moveToElement(menu).build().perform();


		
		
				
		
		
				
				
		
		
		

		
	}

}
