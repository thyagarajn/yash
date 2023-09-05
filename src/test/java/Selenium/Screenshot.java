package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v113.runtime.model.ConsoleAPICalled.Type;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement vp = driver.findElement(By.id("nav-search-bar-form"));
		vp.sendKeys("watches");
		Thread.sleep(2000);
		File prc= vp.getScreenshotAs(OutputType.FILE);
		File dest= new File("D:\\last.vp.png");
		Files.copy(prc, dest);
	
	}

}
