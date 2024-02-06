package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsLoginPage {
	public DwsLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "Email")
	WebElement emailId;
	@FindBy(id = "Password")
	WebElement pwd;
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement rememberMe;
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	WebElement loginButton;
	public void emailIdField(String id) {
		emailId.sendKeys(id);
	}
	public void pwdField(String passwd) {
		pwd.sendKeys(passwd);
	}
	public void rememberCheck() {
		rememberMe.click();
	}
	public void loginBtn() {
		loginButton.click();
	}
}
