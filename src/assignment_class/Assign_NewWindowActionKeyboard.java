package assignment_class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium.UtilityForDemoWebShop;

public class Assign_NewWindowActionKeyboard extends UtilityForDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeBrowser();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//opens kalki fashion shopping website
		openKalkiFashionWeb();
		//create list for webelement 
		List<WebElement> newWindow = driver.findElements(By.xpath("(//div[@id='desktop-nav'])[1]/div"));
		Actions a= new Actions(driver);
		for(WebElement web: newWindow) {
			//opens the new window for the tabs present
			a.moveToElement(web).keyDown(Keys.SHIFT).click().build().perform();
			//Thread.sleep(2000);
		}
		//closes all the browser opened
		QuitBrowser();
	}

}
