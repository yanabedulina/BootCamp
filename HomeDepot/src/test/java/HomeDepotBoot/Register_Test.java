package HomeDepotBoot;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Register_Test {
	public WebDriver driver;
  @Test
  public void f() {
	  Register test=new Register(driver);
	  test.EmailIdFieldHomeD();
	  test.PasswordFieldHomeD();
	  test.ZipCodeFieldHomeD();
	  test.PhoneFieldHomeD();
	  test.LoginButtonHomeD();
	  
  }
  @BeforeClass
  @Parameters({"url","browser"})
  public void beforeClass(String website, String br) {
	  if(br.equalsIgnoreCase("Chrome")) {
    	  System.setProperty("webdriver.chrome.driver", "/Users/yanabedulina/Desktop/chromedriver");
		  driver = new ChromeDriver();
		  driver.navigate().to(website);
      }else if(br.equalsIgnoreCase("Firefox")) {
    	  System.setProperty("webdriver.gecko.driver", "/Users/yanabedulina/Desktop/geckodriver");
          driver = new FirefoxDriver();
          driver.navigate().to(website);
      }else{
    	  System.out.println("Check name");
      }
  }

  @AfterClass
  public void afterClass() {
  }

}
