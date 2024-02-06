package POM;

import org.testng.annotations.Test;

import Testng1.BaseClass;

public class ExecuteLoginLinkDwsPage extends BaseClass{

	@Test
	public void loginLnk() throws InterruptedException {
		driver.get("https://demowebshop.tricentis.com/");
		DwsHomePage homePage=new DwsHomePage(driver);
		DwsLoginPage loginPage=new DwsLoginPage(driver);
		homePage.login();
		loginPage.emailIdField("MalathiN@gmail.com");
		loginPage.pwdField("Passwrod@23");
		loginPage.rememberCheck();
		loginPage.loginBtn();
}
}
