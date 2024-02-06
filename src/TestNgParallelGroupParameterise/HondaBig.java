package TestNgParallelGroupParameterise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.UtilityForDemoWebShop;

public class HondaBig extends UtilityForDemoWebShop{
	@Test(groups = "smoke")
	public void Hondabigwing() {
		//opens the browser and maximise it using utility class
		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.hondabigwing.in/");
		WebElement Hondabigwing_title= driver.findElement(By.xpath("//h1[text()='The Honda Spirit']"));
	if (Hondabigwing_title.isDisplayed()) {
		System.out.println("Hondabigwing Bike webpage entered successfully");
		QuitBrowser();
	}
	else {
		System.out.println("Hondabigwing Bike webpage was unsuccessfull");
		QuitBrowser();
	}
	}
}
