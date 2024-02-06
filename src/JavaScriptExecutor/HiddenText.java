package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import selenium.UtilityForDemoWebShop;

public class HiddenText extends UtilityForDemoWebShop{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.navigate().to("https://www.facebook.com/reg/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//passing hidden webelemetn value
		WebElement gender=driver.findElement(By.name("custom_gender"));
		js.executeScript("arguments[0].value='Successfully';", gender);
	}

}
