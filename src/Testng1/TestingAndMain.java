package Testng1;

import java.time.Duration;

import org.testng.annotations.Test;

import selenium.UtilityForDemoWebShop;

public class TestingAndMain extends UtilityForDemoWebShop {
	
	public static void main(String[] args) {
		ChromeBrowser();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		 openDWS();
		 CloseBrowser();
	}
	
@Test
public void royalEnfield() {
	ChromeBrowser();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
	 driver.get("https://www.royalenfield.com/in/en/home/");
	 CloseBrowser();
}
}
