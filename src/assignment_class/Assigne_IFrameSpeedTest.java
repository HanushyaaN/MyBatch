package assignment_class;

import java.time.Duration;

import selenium.UtilityForDemoWebShop;

public class Assigne_IFrameSpeedTest extends UtilityForDemoWebShop{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		openSpeedTestIFrameWeb();
		
		//trying with different IFrame
	}

}
