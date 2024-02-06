package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium.UtilityForDemoWebShop;

public class moveToElementMen extends UtilityForDemoWebShop{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		openMyntraPage();
		WebElement men=driver.findElement(By.xpath("(//a[@data-group='men'])[1]"));
		//object for action class
		Actions action= new Actions(driver);
		//using moveToElement-move the cursor on the particular webelement
		action.moveToElement(men).perform();
		driver.findElement(By.xpath("//a[@data-reactid=\"31\"]")).click();
		CloseBrowser();
	}

}
