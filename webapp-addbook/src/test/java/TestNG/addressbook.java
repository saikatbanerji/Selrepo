package TestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class addressbook {
	WebDriver driver;
	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://35.185.48.162:32768/addressbook/");
		driver.manage().window().maximize();
	}
  @Test
  public void verifyaddbook() {
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
	  driver.findElement(By.id("gwt-uid-5")).sendKeys("Devops");
	 driver.findElement(By.id("gwt-uid-7")).sendKeys("Training");
	 driver.findElement(By.id("gwt-uid-9")).sendKeys("987654321");
	 driver.findElement(By.id("gwt-uid-11")).sendKeys("devops@gmail.com");
	 driver.findElement(By.id("gwt-uid-13")).sendKeys("11/06/1985");
	 driver.findElement(By.xpath("//div[@class='v-button v-widget primary v-button-primary']")).click();
	 
  }
  
  @AfterMethod
  public void close() {
	  driver.close();
	  
  }
}
