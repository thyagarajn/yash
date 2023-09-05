package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Scren_shot {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize(); 
		      WebElement dp =driver.findElement(By.id("twotabsearchtextbox"));
		      dp.sendKeys("hfffg2222fgfg");
		      File src = dp.getScreenshotAs(OutputType.FILE);
		      File dest= new File("D:\\last\\dp.png");
		     Files.copy(src, dest);
		
	}
}
