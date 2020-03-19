package HomeDepotBoot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	WebDriver driver;

	@FindBy(id="email")
	WebElement email;
	@FindBy(id="password-input-field")
	WebElement password;
	@FindBy(xpath="//input[@id='zipCode']")
	WebElement zipcode;
	@FindBy(xpath="//input[@id='phone']")
	WebElement phone;
	@FindBy(xpath="//span[contains(text(),'Create an Account')]")
	WebElement button;
	
	
	public Register(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void EmailIdFieldHomeD() {
		email.sendKeys("tommmmmmm@gmail.com");
	}
	public void PasswordFieldHomeD() {
		password.sendKeys("BerrY123");
	}
	public void ZipCodeFieldHomeD() {
		password.sendKeys("10111");
	}
	public void PhoneFieldHomeD() {
		password.sendKeys("8976799087");
	}
	public void LoginButtonHomeD() {
		button.click();
	}
	
	
	
}



