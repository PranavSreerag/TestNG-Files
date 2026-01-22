package Testng.TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DependsOnTestNG {
	WebDriver driver=new ChromeDriver();
  @Test(priority=1,timeOut=2000)
  public void loginPage() throws InterruptedException {
	  Thread.sleep(4000);
	  System.out.println("This is the login page");
  }
  @Test(priority=2,dependsOnMethods="loginPage")
  public void HomePage() {
	  System.out.println("This is the home page");
  }
  @Test(priority=3,dependsOnMethods= {"loginPage","HomePage"})
  public void logoutPage() {
	  System.out.println("This is the logout page");
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
