package Assigne_ShoeTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.UtilityForDemoWebShop;

public class CrocsShoe extends UtilityForDemoWebShop{
	@Test(groups = {"smoke","regression"})
	public void Crocs() {
		String Crocs_url="https://www.crocs.com/";
		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.crocs.com/");
		String Crocscurent_url=driver.getCurrentUrl();
		WebElement verify_human_checkBox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		//verifying using page url
		if(Crocs_url.equals(Crocscurent_url)) {
			System.out.println("entered into Crocs shoe page successfully");
			verify_human_checkBox.click();
			//CloseBrowser();
		}
		else {
			System.out.println("Crocs shoe page unsuccessfull");
			CloseBrowser();
		}
	}
}
