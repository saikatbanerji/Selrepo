package TestNg;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class addressbook  {
	WebDriver driver;
  @BeforeMethod
  public void launch() {
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	  ///ChromeOptions chromeoptions = new ChromeOptions();
	  driver = new ChromeDriver();
	  driver.get("http://35.229.56.15:32768/addressbook/");
  }
  @Test
  public void verifylogin() throws InterruptedException {
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 // driver.findElement(By.className("v-widget")).click();
	  driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
	  Thread.sleep(5000);
	   driver.findElement(By.id("gwt-uid-5")).sendKeys("Edureka");
	   driver.findElement(By.id("gwt-uid-7")).sendKeys("Devops");
	   driver.findElement(By.id("gwt-uid-9")).sendKeys("9848020165");
	   driver.findElement(By.id("gwt-uid-11")).sendKeys("devops@ed.co");
	   driver.findElement(By.id("gwt-uid-13")).sendKeys("06/11/2017");
	   driver.findElement(By.className("v-button-primary")).click();
	     }
    @AfterMethod
  public void logout() {
	  driver.quit();
  }
}
