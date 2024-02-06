package select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import selenium.UtilityForDemoWebShop;

public class MultiSelectDropDown extends UtilityForDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//String[] selectOption= {"Audi","BMW","Ford"};
      ChromeBrowser();
      driver.navigate().to("file:///C:/Users/hanu/Downloads/demo-1.html");
      //store the drop  menu
      Thread.sleep(2000);
      WebElement multiDrop=driver.findElement(By.id("multiple_cars"));
      //create a select class
      Thread.sleep(2000);
    	Select s_ref= new Select(multiDrop);
    	 List<WebElement> web=s_ref.getOptions();
    	 for(WebElement allList: web) {
    		 allList.click();
    		 System.out.println("prints the drop down list  :  "+allList.getText());
      }
    	// s_ref.deselectAll();
		/*
		 * for(int i=1; i<3;i++) {
		 * 
		 * }
		 */
     
	}

}
