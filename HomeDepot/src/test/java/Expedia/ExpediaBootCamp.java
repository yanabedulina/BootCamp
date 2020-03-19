package Expedia;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class ExpediaBootCamp {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.navigate().to("https://www.expedia.com/");
	  driver.findElement(By.xpath("//*[@id='primary-header-flight']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id='flight-origin-flp']")).clear();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id='flight-origin-flp']")).sendKeys("New York");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id='aria-option-0']/div[2]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id='flight-destination-flp']")).sendKeys("Miami");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id='aria-option-0']/div[2]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id='flight-departing-wrapper-flp']/label/span[2]/span")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id='flight-departing-wrapper-flp']/div/div[2]/div[2]/table/tbody/tr[4]/td[4]/button")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id='flight-returning-wrapper-flp']/label/span[2]/span")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id='flight-returning-wrapper-flp']/div/div[2]/div[2]/table/tbody/tr[4]/td[6]/button")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id='gcw-flights-form-flp']/div[7]/label/button")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id='flight-module-2020-03-25t10:57:00-04:00-coach-ewr-mia-ua-1415_2020-03-27t10:00:00-04:00-coach-mia-ewr-ua-2435_']/div[1]/div[1]/div[2]/div/div[2]/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id='basic-economy-tray-content-1']/div/div/div[1]/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id='flight-module-2020-03-25t10:57:00-04:00-coach-ewr-mia-ua-1415_2020-03-27t11:23:00-04:00-coach-mia-ewr-ua-1077_']/div[1]/div[1]/div[2]/div/div[2]/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id='basic-economy-tray-content-2']/div/div/div[1]/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id='forcedChoiceNoThanks']")).click();
	  Thread.sleep(5000);
	  //switching tabs
	  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tabs.get(1));
	  driver.findElement(By.xpath("//*[@id='bookButton']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id='firstname[0]']")).sendKeys("Tom");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id='lastname[0]']")).sendKeys("Becker");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id='phone-number[0]']")).sendKeys("4788569586");
	  Thread.sleep(2000);
	  driver.close();  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "/Users/yanabedulina/Desktop/chromedriver");
	  driver = new ChromeDriver();
  }
  @AfterClass
  public void afterClass() {
  }

}
