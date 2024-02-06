package POM;

import org.testng.annotations.Test;

import Testng1.BaseClass;

public class ExecuteRegisterLinkDws extends BaseClass{

	@Test
	public void registerLink() throws InterruptedException {
		driver.get("https://demowebshop.tricentis.com/");
		DwsHomePage homePage=new DwsHomePage(driver);
		DwsRegisterPage registerPage=new DwsRegisterPage(driver);
		homePage.register();
		registerPage.firstName("Malathi");
		registerPage.lastName("Nachiyappan");
		registerPage.emailIdField("MalathiN@gmail.com");
		registerPage.password("Passwrod@23");
		registerPage.confirmPassword("Passwrod@23");
		registerPage.registerButton();
	}
}
