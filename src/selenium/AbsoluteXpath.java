package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath extends UtilityForDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//using utility class - precondition text scripts
		ChromeBrowser();
		openDWS();
		Thread.sleep(2000);
		//using Xpath click on Register link
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[1]/a")).click();
		//navigating back to welcome page
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//using Xpath entering data in search input text feild
		//driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/form/input[1]")).sendKeys("mobile");
		//using Xpath click on search button
		//driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/form/input[2]")).click();
		//using Xpath click on login link
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[2]/a")).click();
		//navigating back to welcome page
		driver.navigate().to("https://demowebshop.tricentis.com/");
		//using Xpath click on shoping cart link
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[3]/a")).click();
		//navigating back to welcome page
		driver.navigate().to("https://demowebshop.tricentis.com/");
		//using Xpath click on wishing list link
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[4]/a")).click();
		//navigating back to welcome page
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//using Xpath click on community poll
		driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/div[2]/div[2]/div/ul/li[1]/input")).click();
		Thread.sleep(2000);
		//using Xpath click on button for poll
		driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/div[2]/div[2]/div/div/input")).click();
		Thread.sleep(2000);
		//using utility class-post condition
		CloseBrowser();

	}

}
