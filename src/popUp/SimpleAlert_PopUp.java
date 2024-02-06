package popUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import selenium.UtilityForDemoWebShop;

public class SimpleAlert_PopUp extends UtilityForDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeBrowser();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		openDWS();
		//click on search button without providing any data
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		Alert al= driver.switchTo().alert();
		System.out.println("alert text:: "+al.getText());
		Thread.sleep(2000);
		//to press OK button in alert pop up message
		al.accept();
		//click on register button
		driver.findElement(By.linkText("Register")).click();
		CloseBrowser();
	}

}
