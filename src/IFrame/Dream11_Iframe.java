package IFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import selenium.UtilityForDemoWebShop;

public class Dream11_Iframe extends UtilityForDemoWebShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		 driver=new ChromeDriver(options);
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		openDream11();
		//IFrame webelement- transfer the controller to Iframe- from parent to child webpage
		//using IframeIdex- as in dream11- there is only one Iframe so 0 index passed
		//driver.switchTo().frame(0);
		//using Iframe String
		//driver.switchTo().frame("send-sms-iframe");
		//using webelement Iframe
		WebElement web=driver.findElement(By.className("send-sms-iframe"));
		//using webelement for Iframe
		driver.switchTo().frame(web);
		driver.findElement(By.id("regEmail")).sendKeys("9606593879");
		
		//switch controller from Iframe to parent frame
		driver.switchTo().parentFrame();
		driver.findElement(By.id("hamburger")).click();
		Actions a= new Actions(driver);
		WebElement list= driver.findElement(By.xpath("(//a[text()='Fantasy Football'])[1]"));
		a.moveToElement(list).click().build().perform();
	}

}
