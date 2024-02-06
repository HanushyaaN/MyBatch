package Assigne_ShoeTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import selenium.UtilityForDemoWebShop;

public class BataShoe extends UtilityForDemoWebShop{

	@Test
	public void Bata() {
		String given_title="Bata End of Season Sale - UPTO 70% OFF";
		//open and maximize the browser using utility class
		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.bata.com/in/");
		String curent_title=driver.getTitle();
		//verifying using page title
		if(given_title.equals(curent_title)) {
			System.out.println("entered into bata shoe page successfully");
			CloseBrowser();
		}
		else {
			System.out.println("bata shoe page unsuccessfull");
			CloseBrowser();
		}
	}
}
