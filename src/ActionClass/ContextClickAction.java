package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium.UtilityForDemoWebShop;

public class ContextClickAction extends UtilityForDemoWebShop{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//opens the guru99 page
		openDemoGuru99();
		//object for action class
		Actions a=new Actions(driver);
		//weblement for right click
		WebElement rightClick= driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		a.contextClick(rightClick).perform();
		//click on edit button -pop up is displayed
		driver.findElement(By.xpath("//span[contains(text(),'Edit')]")).click();
		try {
			//verifying if the right click is enabled after pop up is displayed
			rightClick.isEnabled();
			System.out.println("script handled unsuccessfully");
		}
		catch(Exception e) {
			System.out.println("script handled successfully");
		}
		CloseBrowser();
	}

}
