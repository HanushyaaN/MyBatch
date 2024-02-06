package Assigne_ShoeTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import selenium.UtilityForDemoWebShop;

public class HushPuppies extends UtilityForDemoWebShop{
	@Test(priority = 2)
	public void hushpuppies() {
		String hushpuppies_url="https://www.hushpuppies.com/US/en/home";
		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://www.hushpuppies.com/US/en/home");
		String hushpuppiescurent_url=driver.getCurrentUrl();
		//explicit wait condition for discount offer pop up
		WebElement Decline_offer=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Decline Offer']")));
		//verifying the webpage using page url
		if(hushpuppies_url.equals(hushpuppiescurent_url)) {
			System.out.println("entered into hushpuppies shoe page successfully");
			//click on decline offer button if pavge is displayed
			Decline_offer.click();
			CloseBrowser();
		}
		else {
			System.out.println("hushpuppies shoe page unsuccessfull");
			CloseBrowser();
		}
	}
}
