 package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Wrk2 {
  @Test
  public void f() {
	  
	  System.out.println("main");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("1 st print");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println(" last main");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println(" last before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println(" last class afteer");
  }

}
