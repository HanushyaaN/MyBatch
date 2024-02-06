package TestNgParallelGroupParameterise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.UtilityForDemoWebShop;

public class Bmw extends UtilityForDemoWebShop{
	@Test(groups = "smoke")
	public void BmwMotorrad() {
		//opens the browser and maximise it using utility class
		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.bmw-motorrad.in/en/home.html#/filter-all");
		WebElement BmwMotorrad_title= driver.findElement(By.id("logo"));
	if (BmwMotorrad_title.isDisplayed()) {
		System.out.println("BmwMotorrad_title Bike webpage entered successfully");
		CloseBrowser();
	}
	else {
		System.out.println("BmwMotorrad_title Bike webpage was unsuccessfull");
		CloseBrowser();
	}
	}
}
