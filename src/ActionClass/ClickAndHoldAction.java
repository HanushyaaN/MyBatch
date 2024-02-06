package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import selenium.UtilityForDemoWebShop;

public class ClickAndHoldAction extends UtilityForDemoWebShop{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//opens drag and drop html page
		openDTmlForDragDrop();
		//webelement created for drag and drop
		WebElement capital=driver.findElement(By.id("box5"));
		WebElement countries=driver.findElement(By.id("box105"));
		Actions a= new Actions(driver);
		//click and hold method for action class
		a.clickAndHold(capital).click().moveToElement(countries).release().build().perform();
		
		CloseBrowser();
	}

}
