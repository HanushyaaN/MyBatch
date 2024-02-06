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

public class PerformActionOnMulitpleWindow extends UtilityForDemoWebShop{

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
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement twitter=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Twitter']")));
		//WebElement twitter= driver.findElement(By.xpath("//a[text()='Twitter']"));
		a.moveToElement(twitter).keyDown(Keys.SHIFT).click().build().perform();
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		child.remove(parent);
		for (String str : child) {
			driver.switchTo().window(str);
		}
		Thread.sleep(2000);
		WebElement child2_NotNow=driver.findElement(By.xpath("//span[text()='Not now']"));
		child2_NotNow.click();
		System.out.println("script is successfull");
		QuitBrowser();

	}

}
