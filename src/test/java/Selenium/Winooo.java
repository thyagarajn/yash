package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Winooo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String Win1=driver.getWindowHandle();
		System.out.println(Win1);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		String Win2=driver.getWindowHandle();
		System.out.println(Win2);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.redbus.in/");
		String Win3=driver.getWindowHandle();
		System.out.println(Win3);
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.zomato.com/");
		String Win4=driver.getWindowHandle();
		System.out.println(Win4);
		driver.switchTo().window(Win1);
		
		
		driver.findElement(By.xpath("(//inpt[@class=\"a-button-input\"][1]")).click();
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(drop);
		Thread.sleep(1000);
		s.selectByVisibleText("Deals");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
