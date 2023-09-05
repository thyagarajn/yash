package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop
{
	



	public static void main(String[] args) throws InterruptedException 
	{
		
WebDriver driver = new ChromeDriver();
        
        
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();
        
       
       List<WebElement> country= driver.findElements(By.xpath("//div[@class='dragableBoxRight']"));
       List<WebElement> capital = driver.findElements(By.xpath("//div[@class='dragableBox' and contains(@id,'box')]"));
       
       Actions act =new Actions(driver);
       for(int i=0;i<=country.size()-1; i++)
       {
    	   
    	   for(int j=0; j<=capital.size()-1; j++)
    		   
    	   {
    		   act.dragAndDrop(capital.get(j),country.get(i)).perform();
    		   
    		//   System.out.println(capital.get(j).getCssValue("background-color"));
    		   
    		   
    		  if(capital.get(j).getCssValue("background-color").contains("rgb(0, 255, 0, 1)"));
    		   {
    			   
    			   capital=driver.findElements(By.xpath("//div[@class='dragableBox' and contains(@id,'box'"));
    			   break;
    			   
    			   
    		   }
    		   
    		   
    			   
    		   else 
    		   {
    			   act.dragAndDrop(capital.get(j),driver.findElement(By.id("dropContent"))).perform();
				
			}   
    		   
    
    		   
    	   }
    	   
    	   
  
    		   
    			
    	       
               
    		   
    		   
    		   
    		   
    		   
   
    	   
       
       
    		   
       
        
        
       
        

	
