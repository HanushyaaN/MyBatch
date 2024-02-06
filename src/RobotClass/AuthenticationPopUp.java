package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import selenium.UtilityForDemoWebShop;

public class AuthenticationPopUp extends UtilityForDemoWebShop{

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		openAuthenticatePopUp();
		Robot r=new Robot();
		//key press for 
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		
		//key release for all keys atleast one time
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
