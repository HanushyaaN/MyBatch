package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium.UtilityForDemoWebShop;

public class DoubleClickAction extends UtilityForDemoWebShop{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//enter into Guru 99 page
		openDemoGuru99();
		//object for action class
		Actions action= new Actions(driver);
		WebElement doubleClick= driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		//using double click action
		action.doubleClick(doubleClick).perform();
		//handling the pop-up for unhandled alert exception- now the pop up is opened and closed faster
           try {
        	   //to check whether the doubleclick button is enabled or not after the pop is displayed-actually it should be disabled after pop up displayed
			doubleClick.isEnabled();
			System.out.println("my script is unsuccessful");
		}
		catch(Exception e){
			//printing the unhandled exception
			System.out.println(e);
			System.out.println("my script is successful");
		}
		CloseBrowser();
		
	}

}
