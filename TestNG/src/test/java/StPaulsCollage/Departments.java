package StPaulsCollage;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Departments {
	WebDriver driver=new ChromeDriver();
  @Test(priority=1,enabled=true)
  public void ARTS() throws InterruptedException {
	  
	  Actions act=new Actions(driver);
	  Thread.sleep(1000);
	  //departments
	  WebElement dropdown1=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]"));
	  act.moveToElement(dropdown1).perform();
	  Thread.sleep(1000);
	  //arts
	  WebElement dropdown2=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]"));
	  act.moveToElement(dropdown2).perform();
	  Thread.sleep(1000);
	  //Economics
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  Thread.sleep(1000);
	  
	  WebElement dropdown1a=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]"));
	  act.moveToElement(dropdown1a).perform();
	  Thread.sleep(1000);
	  //arts
	  WebElement dropdown2a=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]"));
	  act.moveToElement(dropdown2a).perform();
	  Thread.sleep(1000);
	  //Economics
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  Thread.sleep(1000);
	  //1
	  WebElement dropdown1b=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]"));
	  act.moveToElement(dropdown1b).perform();
	  Thread.sleep(1000);
	  //arts
	  WebElement dropdown2b=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]"));
	  act.moveToElement(dropdown2b).perform();
	  Thread.sleep(1000);
	  //Economics
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[3]/a[1]/span[1]")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  Thread.sleep(1000);
	  
	  //2
	  WebElement dropdown1c=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]"));
	  act.moveToElement(dropdown1c).perform();
	  Thread.sleep(1000);
	  //arts
	  WebElement dropdown2c=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]"));
	  act.moveToElement(dropdown2c).perform();
	  Thread.sleep(1000);
	  //Economics
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[4]/a[1]/span[1]")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  Thread.sleep(1000);
	  
	  //3
	  WebElement dropdown1d=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]"));
	  act.moveToElement(dropdown1d).perform();
	  Thread.sleep(1000);
	  //arts
	  WebElement dropdown2d=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]"));
	  act.moveToElement(dropdown2d).perform();
	  Thread.sleep(1000);
	  //Economics
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  Thread.sleep(1000);
	  
	  //4
	  WebElement dropdown1e=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]"));
	  act.moveToElement(dropdown1e).perform();
	  Thread.sleep(1000);
	  //arts
	  WebElement dropdown2e=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]"));
	  act.moveToElement(dropdown2e).perform();
	  Thread.sleep(1000);
	  //Economics
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  Thread.sleep(1000);
	  
	  //5
	  WebElement dropdown1f=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]"));
	  act.moveToElement(dropdown1f).perform();
	  Thread.sleep(1000);
	  //arts
	  WebElement dropdown2f=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]"));
	  act.moveToElement(dropdown2f).perform();
	  Thread.sleep(1000);
	  //Economics
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[7]/a[1]/span[1]")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  Thread.sleep(1000);
	  
	  //6
	  WebElement dropdown1g=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]"));
	  act.moveToElement(dropdown1g).perform();
	  Thread.sleep(1000);
	  //arts
	  WebElement dropdown2g=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]"));
	  act.moveToElement(dropdown2g).perform();
	  Thread.sleep(1000);
	  //Economics
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[8]/a[1]/span[1]")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  Thread.sleep(1000);
	  
	  //7
	  WebElement dropdown1h=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]"));
	  act.moveToElement(dropdown1h).perform();
	  Thread.sleep(1000);
	  //arts
	  WebElement dropdown2h=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]"));
	  act.moveToElement(dropdown2h).perform();
	  Thread.sleep(1000);
	  //Economics
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[9]/a[1]/span[1]")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  Thread.sleep(1000);  
  }
  
  @Test(priority=2,enabled=true)
  public void Science() throws InterruptedException {
	  Thread.sleep(1000);
	  Actions act=new Actions(driver);
	  
	  //
	  WebElement dropdown1=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]"));
	  act.moveToElement(dropdown1).perform();
	  Thread.sleep(1000);
	  //
	  WebElement dropdown2=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]"));
	  act.moveToElement(dropdown2).perform();
	  Thread.sleep(1000);
	  //
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  Thread.sleep(1000);
	  
	  
	  //
	  WebElement dropdown1a=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]"));
	  act.moveToElement(dropdown1a).perform();
	  Thread.sleep(1000);
	  //
	  WebElement dropdown2a=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]/span[1]"));
	  act.moveToElement(dropdown2a).perform();
	  Thread.sleep(1000);
	  //
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  Thread.sleep(1000);
	  
	  //
	  WebElement dropdown1b=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]"));
	  act.moveToElement(dropdown1b).perform();
	  Thread.sleep(1000);
	  //
	  WebElement dropdown2b=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]/span[1]"));
	  act.moveToElement(dropdown2b).perform();
	  Thread.sleep(1000);
	  //
	  driver.findElement(By.xpath("")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  Thread.sleep(1000);
	  
	  //
	  WebElement dropdown1c=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]"));
	  act.moveToElement(dropdown1c).perform();
	  Thread.sleep(1000);
	  //
	  WebElement dropdown2c=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]/span[1]"));
	  act.moveToElement(dropdown2c).perform();
	  Thread.sleep(1000);
	  //
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/ul[1]/li[4]/a[1]/span[1]")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  Thread.sleep(1000);
	  
	  //
	  WebElement dropdown1d=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]"));
	  act.moveToElement(dropdown1d).perform();
	  Thread.sleep(1000);
	  //
	  WebElement dropdown2d=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]/span[1]"));
	  act.moveToElement(dropdown2d).perform();
	  Thread.sleep(1000);
	  //
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/ul[1]/li[5]/a[1]/span[1]")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  Thread.sleep(1000);
	  
  }
  
  
  @Test(priority=3,enabled=true)
  public void Vocational() throws InterruptedException {
	  Thread.sleep(1000);
	  Actions act=new Actions(driver);
	  
	  //
	  WebElement dropdown1=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]"));
	  act.moveToElement(dropdown1).perform();
	  Thread.sleep(1000);
	  //
	  WebElement dropdown2=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[3]/a[1]/span[1]"));
	  act.moveToElement(dropdown2).perform();
	  Thread.sleep(1000);
	  //
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[3]/ul[1]/li[1]/a[1]/span[1]")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  Thread.sleep(1000);
	  
	  //
	  WebElement dropdown1a=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]"));
	  act.moveToElement(dropdown1a).perform();
	  Thread.sleep(1000);
	  //
	  WebElement dropdown2a=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[3]/a[1]/span[1]"));
	  act.moveToElement(dropdown2a).perform();
	  Thread.sleep(1000);
	  //
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[3]/ul[1]/li[2]/a[1]/span[1]")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  Thread.sleep(1000);
	  
	  //
	  WebElement dropdown1b=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]"));
	  act.moveToElement(dropdown1b).perform();
	  Thread.sleep(1000);
	  //
	  WebElement dropdown2b=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[3]/a[1]/span[1]"));
	  act.moveToElement(dropdown2b).perform();
	  Thread.sleep(1000);
	  //
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[3]/ul[1]/li[3]/a[1]/span[1]")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  Thread.sleep(1000);
	  
	  //
	  WebElement dropdown1c=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]"));
	  act.moveToElement(dropdown1c).perform();
	  Thread.sleep(1000);
	  //
	  WebElement dropdown2c=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[3]/a[1]/span[1]"));
	  act.moveToElement(dropdown2c).perform();
	  Thread.sleep(1000);
	  //
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[3]/ul[1]/li[4]/a[1]/span[1]")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  Thread.sleep(1000);
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver.get("https://www.stpauls.ac.in/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
