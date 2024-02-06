package select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import selenium.UtilityForDemoWebShop;

public class DeselectDropDownMenu extends UtilityForDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 ChromeBrowser();
	      driver.navigate().to("file:///C:/Users/hanu/Downloads/demo-1.html");
	      //store the drop  menu
	      WebElement multiDrop=driver.findElement(By.id("multiple_cars"));
	      //create a select class
	    	Select s_ref= new Select(multiDrop);
	    	s_ref.selectByIndex(1);
	    	s_ref.selectByIndex(2);
	    	Thread.sleep(2000);
	    	s_ref.deselectByIndex(1);
	    	
	}

}
