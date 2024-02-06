package popUp;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium.UtilityForDemoWebShop;

public class NewWindowAction extends UtilityForDemoWebShop{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		openDWS();
		//find the targeted webelemtn
		List<WebElement> products=driver.findElements(By.xpath("//ul[@class='top-menu']/li"));
		Actions a = new Actions(driver);
		for(WebElement web: products) {
			a.moveToElement(web).keyDown(Keys.SHIFT).click().build().perform();
			Thread.sleep(2000);
		}
		driver.quit();
				
		
	}

}
