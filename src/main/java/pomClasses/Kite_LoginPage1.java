package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_LoginPage1 {
	
	// Declaration
	
	@FindBy(xpath="//input[@id='userid']") private WebElement userId;
	@FindBy(xpath="//input[@id='password']") private WebElement password;
	@FindBy(xpath="//button[@type='submit']") private WebElement login;
	@FindBy(xpath="(//span[@class='su-message'])[1]") private WebElement errorMsg1;
	@FindBy(xpath="(//span[@class='su-message'])[2]") private WebElement errorMsg2;
	
	// Initialization
	
	Kite_LoginPage1(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	// Usage
	
	public void enterUserId() {
		userId.sendKeys(" ");
	}
	
	public void enterPassword() {
		password.sendKeys(" ");
	}
	
	public void clickOnLogin() {
		login.click();
	}
	public void getErrorMsg1() {
		String actualText2 = errorMsg1.getText();
	}
	public void getErrorMsg2() {
		
		String actualText2 = errorMsg2.getText();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
