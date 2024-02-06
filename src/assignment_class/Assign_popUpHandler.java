package assignment_class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium.UtilityForDemoWebShop;

public class Assign_popUpHandler extends UtilityForDemoWebShop{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 
		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		openDemoGuru99();
		Actions a=new Actions(driver);
		//gets the window handle
		String window=driver.getWindowHandle();
		System.out.println(window);
		//gets the list of right click items
		WebElement right_click=driver.findElement(By.xpath("//span[text()='right click me']"));
	    List<WebElement> listOfRightItems=driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span"));
	    //looping condition for right click items-edit, cut ,copy,paste,delete,quit
		for (WebElement web : listOfRightItems) {
			a.moveToElement(right_click).contextClick().build().perform();
			Thread.sleep(2000);
			web.click();
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
		}
		
		CloseBrowser();
	}
	


}
