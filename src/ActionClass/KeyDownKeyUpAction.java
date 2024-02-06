package ActionClass;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium.UtilityForDemoWebShop;

public class KeyDownKeyUpAction extends UtilityForDemoWebShop{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		openDWS();
		Actions a=new Actions(driver);
		//keys. is an enum
		//keyDown-pess the key
		//keyUp-release the key
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		a.keyUp(Keys.PAGE_DOWN).build().perform();
		a.keyDown(Keys.PAGE_UP).build().perform();
		a.keyUp(Keys.PAGE_UP).build().perform();
		a.keyDown(Keys.F5).build().perform();
		a.keyUp(Keys.F5).build().perform();
	}

}
