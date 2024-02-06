package waitCondition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium.UtilityForDemoWebShop;

public class ExplicitWait extends UtilityForDemoWebShop{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ChromeBrowser();
     openShopperstack();
     //explicit wait condition class to be created once
     WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
   //click on login button using ecplicit wait condition for particular webelement 
     WebElement login=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn")));
     login.click();
     //driver.findElement(By.id("loginBtn"));
     //click on create account button using explicit wait condition
     WebElement creatAccount = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='MuiButton-label']")));
     creatAccount.click();
     
     CloseBrowser();
	}

}
