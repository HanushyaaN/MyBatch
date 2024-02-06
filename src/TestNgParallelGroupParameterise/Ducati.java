package TestNgParallelGroupParameterise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.UtilityForDemoWebShop;

public class Ducati extends UtilityForDemoWebShop{
	@Test
	public void DucatiBike() {
		//opens the browser and maximise it using utility class
		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.ducati.com/in/en/home");
		WebElement Ducati_title= driver.findElement(By.className("mainlogo"));
	if (Ducati_title.isDisplayed()) {
		System.out.println("Ducati Bike webpage entered successfully");
		CloseBrowser();
	}
	else {
		System.out.println("Ducati Bike webpage was unsuccessfull");
		CloseBrowser();
	}
	}
}
