package Testng.TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TimeoutTestNG {
	WebDriver driver=new ChromeDriver();
  @Test(priority=1,timeOut=1000)
  public void f() throws InterruptedException {
	  Thread.sleep(1000);
	  System.out.println("This is the f page");
  }
  @Test(priority=2)
  public void n() throws InterruptedException {
	  Thread.sleep(1000);
	  System.out.println("This is the n page");
  }
  @Test(priority=3)
  public void g() throws InterruptedException {
	  Thread.sleep(1000);
	  System.out.println("This is the g page");
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
