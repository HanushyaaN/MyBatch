package waitCondition;

import java.time.Duration;

import org.openqa.selenium.By;

import selenium.UtilityForDemoWebShop;

public class waitingExplicitImplicit extends UtilityForDemoWebShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ChromeBrowser();
         //opens the facebook login page
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
         openFacebookPage();
         //click on facebook create account page
         driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
         //click on close button X
         driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
         //close the browser
         CloseBrowser();
         
	}

}
