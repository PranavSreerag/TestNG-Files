package GroupPackages;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ThirdGroups {
	WebDriver driver=new ChromeDriver();
  @Test(priority=1,enabled=true,groups={"userSide","customerSide","adminSide"})
  public void LoginPagess() {
	  System.out.println("This is the admin loginpage");
  }
  @Test(priority=2,enabled=true,groups={"userSide","customerSide","adminSide"})
  public void HomePagess() {
	  System.out.println("This is the admin homepage");
  }
  @Test(priority=3,enabled=true,groups={"userSide","customerSide","adminSide"})
  public void Purchasess() {
	  System.out.println("this is the admin purchase page");
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
