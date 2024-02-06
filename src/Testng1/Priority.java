package Testng1;

import java.time.Duration;

import org.testng.annotations.Test;

import selenium.UtilityForDemoWebShop;

public class Priority extends UtilityForDemoWebShop {
	
	@Test(priority=4)
	public void dws() {
		ChromeBrowser();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		 openDWS();
		 CloseBrowser();
	}
	@Test(priority=2)
	public void Agoda() {
		ChromeBrowser();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		 openAgodaBookingWeb();
		 CloseBrowser();
	}
	@Test(priority=1, invocationCount = 2,threadPoolSize = 2)
	public void royalEnfield() {
		ChromeBrowser();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		 driver.get("https://www.royalenfield.com/in/en/home/");
		 QuitBrowser();
	}
	@Test(priority=0)
	public void redBus() {
		ChromeBrowser();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		 openRedBus();
		 CloseBrowser();
	}
	@Test(priority=3)
	public void bmw() {
		ChromeBrowser();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		 driver.get("https://www.bmw.com/en/index.html");
		 CloseBrowser();
	}
	}


