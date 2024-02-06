package TestNgParallelGroupParameterise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.UtilityForDemoWebShop;

public class TvsMotor extends UtilityForDemoWebShop {
	@Test
	public void TvsMotorBike() {
		//opens the browser and maximise it using utility class
		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.tvsmotor.com/");
		WebElement TvsMOtor_title= driver.findElement(By.xpath("//a[@class='navbar-brand']"));
	if (TvsMOtor_title.isDisplayed()) {
		System.out.println("TvsMotor Bike webpage entered successfully");
		QuitBrowser();
	}
	else {
		System.out.println("TvsMotor Bike webpage was unsuccessfull");
		QuitBrowser();
	}
	}
}
