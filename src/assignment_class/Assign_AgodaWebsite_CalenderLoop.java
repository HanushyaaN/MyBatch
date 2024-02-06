package assignment_class;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import selenium.UtilityForDemoWebShop;

public class Assign_AgodaWebsite_CalenderLoop extends UtilityForDemoWebShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ChromeBrowser();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		 driver=new ChromeDriver(options);
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		openAgodaBookingWeb();
		
	}

}
