package Testng1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selenium.UtilityForDemoWebShop;

public class AddToCartByChronologicalOrder extends UtilityForDemoWebShop {
 //@Before has precondition
@BeforeClass
public void openBrowser() {
	ChromeBrowser();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	openDWS();
}
//@before method- write soe compulsory steps executs before @test annotations
//enabled=true -if want to execute the method/steps
@BeforeMethod(enabled = true)
public void login() {
	driver.findElement(By.className("ico-login")).click();
	driver.findElement(By.id("Email")).sendKeys("");
	driver.findElement(By.id("Password")).sendKeys("");
	driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
}
//@test is for test cases and writing test scripts
@Test
public void addToCart() {
	System.out.println("succesfull entered addto Cart...........");
	driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
}
//enables helper method skips the method-if it is false
//@aftermethod-post the order condition
@AfterMethod(enabled = false)
public void logOut() {
	driver.findElement(By.className("ico-logout")).click();
}
@AfterClass
public void closeBrowser() {
	closeBrowser();
}
}
