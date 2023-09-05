package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Email {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver .get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AXo7B7UsSMmfiOH27-0EJWCjFDOmab_0Jn2oIlMZxsenEJjPiTt03AnMQF4SL3BRCDqW_syvmMefLg&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-1526459238%3A1692171095388694");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("thyagaraj371@gmail.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("thyagaraj371@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']/ancestor::button")).click();
		
		
		
	}

}
