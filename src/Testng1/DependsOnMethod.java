package Testng1;

import java.time.Duration;

import org.testng.annotations.Test;

import selenium.UtilityForDemoWebShop;

public class DependsOnMethod extends UtilityForDemoWebShop{
//depends on methhod is a helper method which is depend on redbus. Agoda webpage  executes after red bus
	@Test(priority=1, dependsOnMethods = "redBus")
	public void Agoda() {
		ChromeBrowser();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		 openAgodaBookingWeb();
		 CloseBrowser();
	}
	@Test(priority=2)
	public void royalEnfield() {
		ChromeBrowser();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		 driver.get("https://www.royalenfield.com/in/en/home/");
		 QuitBrowser();
	}
	@Test(priority=3)
	public void redBus() {
		ChromeBrowser();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		 openRedBus();
		 CloseBrowser();
	}
}
