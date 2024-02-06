package popUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium.UtilityForDemoWebShop;

public class FetchTheWindowHandle extends UtilityForDemoWebShop{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		openDWS();
		 String dWS=driver.getWindowHandle();
		 //unique data displayed here- unique hangle- alpha numneric string value
		 System.out.println(dWS);
		 Actions a= new Actions(driver);
		 //sometimes the webelemtn in footer wnt be visible to clicm so then we can use page down
		 a.keyDown(Keys.PAGE_DOWN).build().perform();
		 a.keyDown(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		//getWindowHandle()- always get sthe parent window handle- so to get the child window we need to switch
		 Set<String> twitter=driver.getWindowHandles();
		 System.out.println(twitter);
		// driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		 //closes the recent open one-child window
		 driver.close();
		
	}

}
