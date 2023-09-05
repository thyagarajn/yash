package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draga_drop2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
WebDriver driver = new ChromeDriver();
        
		
		 driver.get("http://www.dhtmlgoodies.com/scripts/dg-crop/dg-crop.html");
	        driver.manage().window().maximize();
	        
	       
	      WebElement b1 = driver.findElement(By.xpath("//div[@class=dg-resize-handle']"));
	        WebElement b2= driver.findElement(By.xpath("//div[@class='dg-movable']"));
	        
	        
	        Actions actions = new Actions(driver);
	         Thread.sleep(2000);
	       
	      //  actions.dragAndDrop(b1, b2).perform();
	        
	        Thread.sleep(2000);
	        
		
		
		
		
	}

}
