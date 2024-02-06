package JavaScriptExecutor;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import selenium.OpenDemoWebPage;
import selenium.UtilityForDemoWebShop;

public class ScrollIntoView extends UtilityForDemoWebShop{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//openSkillRaryPage();
		openDWS();
		//WebElement facebook=driver.findElement(By.xpath("//a[text()='Facebook']"));
		List<WebElement> radio= driver.findElements(By.xpath("//ul[@class=\"poll-options\"]/li/label"));
		//WebElement learn_more=driver.findElement(By.xpath("//a[text()=' LEARN MORE']"));
		//downcasting driver class
		JavascriptExecutor js= (JavascriptExecutor) driver;
		//argument[0]-based on the webelement index, scrollIntoView(false)- targeted elemtn wil be present at bottom, ScrollIntoView(true)- will be present at the top
		//js.executeScript("arguments[0].scrollIntoView(false);", facebook);
		
		js.executeScript("arguments[1].scrollIntoView(true);", radio);
	}

}
