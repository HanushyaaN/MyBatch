package Assigne_ShoeTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.UtilityForDemoWebShop;

public class Mochi_Shoe extends UtilityForDemoWebShop {
	@Test(priority = 1)
	public void mochishoes() {
		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.mochishoes.com/");
		WebElement Mochi_title=driver.findElement(By.xpath("//img[@alt='Mochi Shoes Logo']"));
		//verifying using webelement
		if(Mochi_title.isDisplayed()) {
			System.out.println("entered into mochishoes page successfully");
			CloseBrowser();
		}
		else {
			System.out.println("mochishoes page unsuccessfull");
			CloseBrowser();
		}
	}
}
