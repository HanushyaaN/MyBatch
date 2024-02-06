package popUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium.UtilityForDemoWebShop;

public class UseWindowHandle extends UtilityForDemoWebShop{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		openDWS();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Actions a=new Actions(driver);
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		WebElement twitter= driver.findElement(By.xpath("//a[text()='Twitter']"));
		Thread.sleep(2000);
		a.moveToElement(twitter).keyDown(Keys.SHIFT).click().build().perform();
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		child.remove(parent);
		for (String str : child) {
			driver.switchTo().window(str);
		}
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement child2_NotNow=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Not now']")));
		child2_NotNow.click();
		System.out.println("script is successfull");
		CloseBrowser();
		//driver.close();
		
		//System.out.println(child);
		//to close the child window need to remove the parent handle from set and then switch to child window handle
		/*
		 * child.remove(dWS); for(String str: child) { driver.switchTo().window(str); }
		 */
		//child.remove(dWS);
		//System.out.println(child);
		//driver.close();
	}

}
