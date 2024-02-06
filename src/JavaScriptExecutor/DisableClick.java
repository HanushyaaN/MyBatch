package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import selenium.UtilityForDemoWebShop;

public class DisableClick extends UtilityForDemoWebShop{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		openOracleDownloadsPage();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement download_link=driver.findElement(By.linkText("jdk-11.0.21_windows-x64_bin.zip"));
		//using javascrpt it is scrollIntoView to the particular webelement
		js.executeScript("arguments[0].scrollIntoView(false);", download_link);
		download_link.click();
		WebElement disable_button=driver.findElement(By.linkText("Download jdk-11.0.21_windows-x64_bin.zip"));
		//without click on check box the disable button working and navigating using javascript
		js.executeScript("arguments[0].click();", disable_button);
		
	}

}
