package Parameterized;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DiifferentBrowser {

	WebDriver driver;
	@Parameters("Driver")
	@Test
	public void browser(String drive) {
		if(drive.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			System.out.println("printing from chrome");
			Reporter.log("loging report in chrome");
		}
		else if(drive.equalsIgnoreCase("edge")){
			driver=new EdgeDriver();
			System.out.println("printing from edge");
			Reporter.log("loging report in edge");
		}
		else if(drive.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			System.out.println("printing from firefox");
			Reporter.log("loging report in firefox");
		}
		else {
			System.out.println("your driver is not found");
		}
	}
}
