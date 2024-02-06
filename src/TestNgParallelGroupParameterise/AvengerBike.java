package TestNgParallelGroupParameterise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import selenium.UtilityForDemoWebShop;

public class AvengerBike extends UtilityForDemoWebShop{

	@Test(priority = 3)
	public void Avenger() {
		//opens the browser and maximise it using utility class
		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.bajajauto.com/bikes/avenger");
		WebElement title= driver.findElement(By.xpath("//h1[text()='Bajaj Avenger Range']"));
	if (title.isDisplayed()) {
		System.out.println("Avenger Bike webpage entered successfully");
		CloseBrowser();
	}
	else {
		System.out.println("Avenger Bike webpage was unsuccessfull");
		CloseBrowser();
	}
	}
}
