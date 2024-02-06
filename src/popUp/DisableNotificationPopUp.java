package popUp;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import selenium.UtilityForDemoWebShop;

public class DisableNotificationPopUp extends UtilityForDemoWebShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions ch_options= new ChromeOptions();
		ch_options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch_options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
	}

}
