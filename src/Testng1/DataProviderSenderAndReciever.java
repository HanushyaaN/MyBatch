package Testng1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import selenium.UtilityForDemoWebShop;

public class DataProviderSenderAndReciever extends BaseClass{

	@DataProvider(name="login")
	//object2d -2 dimension array-recievees 2 data-having 2 rows
	public Object[][] sender(){
		Object[][] obj=new Object[2][2];
				obj[0][0]="admin01@gmail.com";
				obj[0][1]="admin01";
				obj[1][0]="Hanu16@gmail.com";
				obj[1][1]="password123";
				return obj;
	}
	
	//data provider is a helper method
	@Test(dataProvider = "login")
	public void receiver(String email,String password) {
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	}
}
