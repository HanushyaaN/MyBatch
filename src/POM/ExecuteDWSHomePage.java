package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecuteDWSHomePage {

	@Test
	public void reciever() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.id("small-searchterms")).sendKeys("hanu");
		//to access the nnon static object inside a class then create object for homepage
		//as we dt when webleemnt will change so using POM
		DwsHomePage homepage = new DwsHomePage(driver);
		//homepage.searchField.sendKeys("hanu");
		//sending the value to the DWS home page class to the parameter present there
		homepage.searchField("hanu");
		//homepage.searchButton.click();
		homepage.searchButton();
	}
}
