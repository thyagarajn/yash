package Selenium;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Srshoot {

	

	private static final String BY = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.id("nav-logo-sprites"));
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		BufferedImage fullimage = ImageIO.read(screenshot);
		org.openqa.selenium.Point location = element.getLocation();
		int width = element.getSize().getWidth();
		int height = element.getSize().getHeight();
		BufferedImage dest = fullimage.getSubimage(location.getX(), location.getY(), width, height);
		ImageIO.write(dest, "png", screenshot);
		Files.copy(screenshot, new File("D:\\screenshots//element.png"));
		driver.quit();
		
		
		
		
		
	}

}
