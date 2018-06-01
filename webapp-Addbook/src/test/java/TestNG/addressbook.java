package TestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class addressbook {
	    ChromeDriver driver;
	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--headless");
		driver = new ChromeDriver(Options);
		driver.get("http://35.231.90.148:32768/addressbook/");
		driver.manage().window().maximize();
	}
	
  @Test
  public void verfiyaddbook() {
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
	  driver.findElement(By.id("gwt-uid-5")).sendKeys("Selenium");
	  driver.findElement(By.id("gwt-uid-7")).sendKeys("Eddevops");
	  driver.findElement(By.id("gwt-uid-9")).sendKeys("9876543210");
	  driver.findElement(By.id("gwt-uid-11")).sendKeys("devops@edu.co");
	  driver.findElement(By.id("gwt-uid-13")).sendKeys("01/06/2018");
	  driver.findElement(By.className("v-button-primary")).click();
	  
  }
  
  @AfterMethod
    public void logout() {
	  driver.close();
  }
}
