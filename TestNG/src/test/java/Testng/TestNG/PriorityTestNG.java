package Testng.TestNG;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class PriorityTestNG {
	WebDriver driver=new ChromeDriver();
	
  @Test(enabled=false)
  public void a() {
	  System.out.println("This is the first page");
  }
  @Test(priority=2)
  public void b() {
	  System.out.println("This is the second page ");
  }
  @Test(priority=1)
  public void c() {
	  System.out.println("This is the thrid page");
  }
}
  