package popUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium.UtilityForDemoWebShop;

public class FileUploadPopUpNaukri extends UtilityForDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		openNaukriPage();
		//click on register button
		driver.findElement(By.id("register_Layer")).click();
		Thread.sleep(1000);
		Actions a=new Actions(driver);
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		//uploading file using sendKeys() method by getting the path of the file
		driver.findElement(By.xpath("//input[@id='resumeUpload']")).sendKeys("C:\\Users\\hanu\\Desktop\\SoftwareTesting\\ModelResume_SoftwareTesting\\resume3.pdf");
		
	}

}
