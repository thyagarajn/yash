package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.graph.ElementOrder.Type;
import com.google.common.io.Files;

public class Actitime_4 {

	public static void main(String[] args) throws InterruptedException, IOException
	{
	WebDriver driver = new ChromeDriver();
	 driver.get("http://127.0.0.1/login.do;jsessionid=27h7bv35661vw");
	 
      // Use explicit wait to wait for an element on the page to be visible
   //   WebDriverWait wait = new WebDriverWait(driver, null);
    //  WebElement someElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className

    //  File screenshotFile = someElement.getScreenshotAs(OutputType.FILE);
   //   File destinationFile = new File("D:\\last\\un.png");
   //   Files.copy(screenshotFile, destinationFile);

      
	 
	 
	 //get("http://127.0.0.1/login.do;jsessionid=27h7bv35661vw");
	
	// Use explicit wait to wait for an element on the page to be visible
   //  WebDriverWait wait = new WebDriverWait(driver, 10);
    // WebElement someElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("yourElementId")));

   //  File screenshotFile = someElement.getScreenshotAs(OutputType.FILE);
   //  File destinationFile = new File("D:\\last\\un.png");
    // Files.copy(screenshotFile.toPath(), destinationFile.toPath());

     //driver.quit();
	
	              
	//WebElement un = driver.findElement(By.className("textField"));
	//un.sendKeys("yrtyrytry");
	//WebElement pwd= driver.findElement(By.name("pwd"));
		//	pwd.sendKeys("manager");
	//WebElement lgn = driver.findElement(By.id("loginButton"));
		//	lgn.click();
			//un.sendKeys("yrtyrytry");
			//Thread.sleep(2000);
			//file scrc =un.getScreenshotAs(OutputType.FILE);
			//File dest = new File("D:\\last\\un.png");
			//Files.copy(scrc, dest);
			


	
	

	}

}
