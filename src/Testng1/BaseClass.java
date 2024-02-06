package Testng1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	//globally declaring
	public static WebDriver driver;
	@BeforeClass
	public void precondition() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@BeforeMethod
	public void login() {
		System.out.println("login is succesfull............");
	}
	
	@AfterMethod
	public void logOut() {
		System.out.println("logout is susccesfull.........");
	}
	@AfterClass
	public void postCondition() {
		System.out.println("close the browser......");
		driver.quit();
	}
}
