package Asserts;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class HardAsserts {
	WebDriver driver=new ChromeDriver();
  @Test
  public void f() {
	  String news="Hello";
	  String newss="Hell";
	  
	  Assert.assertEquals(newss, news);
	  System.out.println("Assertion has been completed");
	  
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
