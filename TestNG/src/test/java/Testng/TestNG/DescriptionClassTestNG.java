package Testng.TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DescriptionClassTestNG {
	WebDriver driver=new ChromeDriver();
  @Test(priority=1,description="This is the login page",enabled=true,groups="sanity")
  public void firstNG() {
	  System.out.println("This is the first page");
  }
  
  @Test(priority=3,description="This is the about page",enabled=true,groups={"smoke","sanity"})
  public void secondNG() {
	  System.out.println("This is the second page");
  }
  
  @Test(priority=2,description="This is the home page",enabled=true,groups="sanity")
  public void thirdNG() {
	  System.out.println("This is the third page");
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
