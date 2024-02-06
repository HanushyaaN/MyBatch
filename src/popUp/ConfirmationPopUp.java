package popUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import selenium.UtilityForDemoWebShop;

public class ConfirmationPopUp extends UtilityForDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		openAlerPopUpPage();
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		Alert a=driver.switchTo().alert();
		Thread.sleep(2000);
		//for click on OK button
		a.accept();
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		Thread.sleep(2000);
		//for click on cancel button on pop up
		a.dismiss();	
		CloseBrowser();
	}

}
