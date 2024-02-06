package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import selenium.UtilityForDemoWebShop;

public class ScreenShotDWS extends UtilityForDemoWebShop {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		openDWS();
		//downcasting -converting webDriver type into TakeScreenShot type
		TakesScreenshot ts=(TakesScreenshot) driver;
		//steps for taking sceeenshot
		//we need in a file format type and store it in a File
		File from=ts.getScreenshotAs(OutputType.FILE);
		//to find the path of the file to get stored
		File to=new File("C:\\photos&vidoes\\demoWebPage.jpg");
		//to store the data From - To folder-using FileHandler()-which throws IO exception
		FileHandler.copy(from, to);
		
		
		
	}

}
