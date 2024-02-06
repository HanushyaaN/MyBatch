package Assigne_ShoeTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.UtilityForDemoWebShop;

public class MetroShoe extends UtilityForDemoWebShop {
	@Test
	public void metroshoes() {
		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.metroshoes.com/");
		WebElement title=driver.findElement(By.xpath("(//span[text()='WELCOME TO METRO SHOES'])[1]"));
		//verifying using webelement
		if(title.isDisplayed()) {
			System.out.println("entered into metroshoes page successfully");
			CloseBrowser();
		}
		else {
			System.out.println("metroshoes page unsuccessfull");
			CloseBrowser();
		}
	}
}
