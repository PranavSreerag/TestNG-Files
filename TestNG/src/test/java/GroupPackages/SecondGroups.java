package GroupPackages;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SecondGroups {
	WebDriver driver=new ChromeDriver();
  @Test(priority=1,enabled=true,groups={"userSide","customerSide"})
  public void LoginPages() {
	  System.out.println("This is the customer loginpage");
  }
  @Test(priority=2,enabled=true,groups={"userSide","customerSide"})
  public void HomePages() {
	  System.out.println("This is the customer homepage");
  }
  @Test(priority=3,enabled=true,groups={"userSide","customerSide"})
  public void Purchases() {
	  System.out.println("this is the customer purchase page");
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
