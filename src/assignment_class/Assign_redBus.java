package assignment_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium.UtilityForDemoWebShop;

public class Assign_redBus extends UtilityForDemoWebShop{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		 driver=new ChromeDriver(options);
		 driver.manage().window().maximize();
		WebDriverWait explicit=new WebDriverWait(driver, Duration.ofSeconds(15));
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         openRedBus();
         Actions action = new Actions(driver);
         driver.findElement(By.id("src")).sendKeys("Bangalore");
         explicit.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//text[text()='Bangalore']")));
         action.keyDown(Keys.ENTER).build().perform();
         driver.findElement(By.id("dest")).sendKeys("chennai");
         explicit.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//text[text()='Chennai']")));
         action.keyDown(Keys.ENTER).build().perform();
         driver.findElement(By.cssSelector("//div[@class='labelCalendarContainer']")).click();
         //Thread.sleep(2000);
         driver.findElement(By.xpath("//span[text()='20']")).click();
         Thread.sleep(2000);
         driver.findElement(By.id("search_button")).click();
         
	}

}
