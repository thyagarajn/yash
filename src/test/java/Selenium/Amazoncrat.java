package Selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazoncrat {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/?ref_=nav_custrec_signin&");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement sign= driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute']"));
		act.moveToElement(sign).perform();
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		driver.findElement(By.id("ap_email")).sendKeys("8217407499");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("83173@Yash#$%");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple iPhone 14 (128 GB) - Blue");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.linkText("Apple iPhone 14 (128 GB) - Blue")).click();
		Set<String> s =driver.getWindowHandles();
	    Iterator<String> it = s.iterator();
	    String parent = it.next();
	    String child = it.next();
	    System.out.println(parent);
	    System.out.println(child);
	    driver.switchTo().window(child);
	    driver.findElement(By.id("add-to-cart-button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("attach-close_sideSheet-link")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@href='https://www.amazon.in/gp/cart/view.html?ref_=nav_cart']")).click();
	    
	   	// driver.findElements(By.xpath("//a[@href='https://www.amazon.in/gp/cart/view.html?ref_=nav_cart']"));
	   	// driver.findElement(By.id("proceed-to-checkout-action")).click();
	   	 //driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]")).click();
	   //	WebElement totalPriceElement = driver.findElement(By.id("sc-subtotal-label-activecart"));
	  
	   	List<WebElement> cost=driver.findElements(By.xpath("(//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'])[2]"));
	   	System.out.println(cost.size());
	   	for(int i=0;i<=cost.size()-1;i++) 
	   	{
	   		System.out.println(cost.get(i).getText());
	   	}
	   	
	   	
	   	List<WebElement> name = driver.findElements(By.xpath("//span[@class='a-truncate-cut']"));
	   	System.out.println(name.size());
	   	
	   	for(int i =0;i<=name.size()-1;i++) 
	   	{
	   		System.out.println(name.get(i).getText());
	   		
	   	}
	    

        // Extract the text of the element
      //  String totalPriceText = totalPriceElement.getText();

        // Print the extracted total price
     //   System.out.println("Total Price: " + totalPriceText);

	 //  	=get( totalPriceElement).getCssValue("background-color").contains("rgb(0, 255, 0, 1)"));
        

        // Extract the total amount from the cart
        
       // String totalAmount = totalPriceElement.getText();

        // Print the total amount
      //  System.out.println("Total Amount: " + totalAmount);

	    
	   	
	  // 	Set<String> cost1 =driver.getWindowHandles();
	   // Iterator<String> cost2 = s.iterator();
	   // String price= it.next();
	   // System.out.println(price);
	  
   
	    //driver.navigate().back();
	  // WebElement dp= driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']"));
	   //dp.click();
	   //Select sp = new Select(dp);
	   //sp.selectByIndex(1);
	   //Thread.sleep(2000);
	   //sp.selectByValue(child);
	   
	    
	    

		
		
		
		
		
		
		
		
		
		
	}

}
