package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         //open my browser
		WebDriver driver=new ChromeDriver();
		//maximise the browser
		driver.manage().window().maximize();
		//enter into the webpage
		driver.get("https://demowebshop.tricentis.com/");
		//if you want to see the automation testing in slow motion then use thread
		Thread.sleep(2000);
		//name locator
		driver.findElement(By.name("q")).sendKeys("mobile");
		Thread.sleep(2000);
		driver.close();
		
	}

}
