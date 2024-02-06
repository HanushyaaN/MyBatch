package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsRegisterPage {
		public DwsRegisterPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		@FindBy(id = "gender-male")
		WebElement maleRadioBt;
		
		@FindBy(id = "gender-female")
		WebElement femaleRadioBt;
		@FindBy(id = "FirstName")
		WebElement fName;
		@FindBy(name = "LastName")
		WebElement lName;
		@FindBy(id = "Email")
		WebElement emailId;
		@FindBy(name = "Password")
		WebElement pwd;
		@FindBy(id = "ConfirmPassword")
		WebElement confirmPwd;
		@FindBy(id = "register-button")
		WebElement registerButton;
		public void genderMale() {
			maleRadioBt.click();
		}
		public void genderFemale() {
			femaleRadioBt.click();
		}
		public void firstName(String fname) {
			fName.sendKeys(fname);
		}
		public void lastName(String lname) {
			lName.sendKeys(lname);
		}
		public void emailIdField(String mail) {
			emailId.sendKeys(mail);
		}
		
		public void password(String passwrd) {
			pwd.sendKeys(passwrd);
		}
		public void confirmPassword(String conPasswrd) {
			confirmPwd.sendKeys(conPasswrd);
		}
		public void registerButton() {
			registerButton.click();
		}
	}

