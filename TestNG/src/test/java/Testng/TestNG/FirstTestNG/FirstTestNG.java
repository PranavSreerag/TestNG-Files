package Testng.TestNG.FirstTestNG;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FirstTestNG {
	WebDriver driver=new ChromeDriver();
	
  @Test
  public void a() {
	  System.out.println("This is the first page");
  }
  @Test
  public void b() {
	  System.out.println("This is the second page ");
  }
  @Test
  public void c() {
	  System.out.println("This is the thrid page");
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
