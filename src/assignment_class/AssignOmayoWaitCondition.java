package assignment_class;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium.UtilityForDemoWebShop;

public class AssignOmayoWaitCondition extends UtilityForDemoWebShop{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeBrowser();
		//using implicit wait condition
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//opens the Omayo blog page
		openOmayoBlog();
		//explicit wait condition class to be created once
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		//click on drop downn button using explicit wait condition for particular webelement
		//WebElement dropDown= wait.until(ExpectedConditions.visibilityOfElementLocated
		driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
		//dropDown.click();
		//click on facebook button
		driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
		WebElement web= driver.findElement(By.xpath("(//a[@role=\"button\"])[2]"));
		if(web.isDisplayed()) {
			System.out.println("the facebook page verified");
			//navigate back to Omayo page from facebook page
			driver.navigate().to("http://omayo.blogspot.com/");
		}
		else {
			System.out.println("the facebook page not verified");
		}
		//click on timer downn button using explicit wait condition for particular webelement
		WebElement timerButton=wait.until(ExpectedConditions.elementToBeClickable(By.id("timerButton")));
		timerButton.click();
		//close the browser
		CloseBrowser();
	}

}
