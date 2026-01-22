package GroupPackages;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FirstGroups {
	WebDriver driver=new ChromeDriver();
  @Test(priority=1,enabled=true,groups="userSide")
  public void loginPage() {
	  System.out.println("This is the user login page");
  }
  @Test(priority=2,enabled=true,groups="userSide")
  public void HomePage() {
	  System.out.println("This is the user homepage");
  }
  @Test(priority=3,enabled=true,groups="userSide")
  public void Purchase() {
	  System.out.println("this is the user purchase page");
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
