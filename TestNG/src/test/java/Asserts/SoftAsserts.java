package Asserts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SoftAsserts {
	WebDriver driver=new ChromeDriver();
  @Test
  public void f() {
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  
	  SoftAssert lol=new SoftAssert();
	  
	  String exp=driver.getTitle();
	  String act="Googl";
	  
	  lol.assertEquals(exp, act);
	  System.out.println("Soft Assertion has been complete");
	  lol.assertAll();
	  
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
