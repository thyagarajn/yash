package Selenium;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Downlod {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		
		

		WebDriver driver= new ChromeDriver();
		driver.get("http://127.0.0.1/login.do;jsessionid=s1tf0oi9sdrf");
		driver.manage().window().maximize(); 
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Settings")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logo & Color Scheme")).click();
		Thread.sleep(2000);
driver.findElement(By.id("uploadNewLogoOption")).click();
		
		 

	        // Provide the path to the file you want to upload
	 //String filePath = "path/to/your/file.txt";
	 //       fileInput.sendKeys(filePath);

	        // Locate the upload button
	  //      WebElement uploadButton = driver.findElement(By.id("uploadButtonId"));

	        // Click the upload button
	  //      uploadButton.click();
		
	//	   String filePath = "";
	   //     fileInput.sendKeys(filePath);

	        // Locate the upload button
	 //       WebElement uploadButton = driver.findElement(By.id("uploadButtonId"));

	        // Click the upload button
	 //       uploadButton.click();
		
		
		
	 WebElement choosefile =driver.findElement(By.xpath("(//input[@type='file'])[1]"));
	 Actions act = new Actions(driver);
	 if(choosefile.isEnabled())
	 {
	
		 act.click(choosefile).perform();
		 Thread.sleep(2000);
		 
 }
	 
		Runtime.getRuntime().exec("./upload/upload.exe");
		
		
		
		
	}

}
