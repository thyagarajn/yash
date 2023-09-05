package Selenium;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class Asot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		AShot ScreenShot = new AShot();
		Screenshot   sh  =  ScreenShot.shootingStrategy(ShootingStrategies.viewportPasting(5000)).takeScreenshot(driver);
		
		ImageIO.write(sh.getImage(), "jpg", new File("D:\\Popup\\.jpg " ));
		
		
		
		
		
		
		
		
	
		

		
		
		
		
		
	}

}
