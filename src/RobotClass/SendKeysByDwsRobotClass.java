package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Keys;

import selenium.UtilityForDemoWebShop;

public class SendKeysByDwsRobotClass extends UtilityForDemoWebShop{

	public static void main(String[] args) throws AWTException, InterruptedException  {
		// TODO Auto-generated method stub

		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		openDWS();
		Robot r=new Robot();
		//VK-virtuL Key- keypress tab and   by pressing the tab keyboard moving to search input text fieldx	
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB); 
		Thread.sleep(1000); 
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB); 
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB); 
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_CAPS_LOCK); 
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_O);
		r.keyPress(KeyEvent.VK_B);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_L);
		r.keyPress(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_ENTER);
		//VK-after trying to key press always to key release- one key release is enough for many kewy press
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_CAPS_LOCK); 
		r.keyRelease(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_O);
		r.keyRelease(KeyEvent.VK_B);
		r.keyRelease(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_L);
		r.keyRelease(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
