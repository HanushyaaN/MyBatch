package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium.UtilityForDemoWebShop;

public class SendKeysMethodKeyboard extends UtilityForDemoWebShop{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String given_url="https://demowebshop.tricentis.com/";
		ChromeBrowser();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		openDWS();
		//verify the home page of DWS
		String current_url=driver.getCurrentUrl();
		if(given_url.equals(current_url)) {
			System.out.println("you are in demo shop page");
			WebElement searchStore= driver.findElement(By.id("small-searchterms"));
			Actions a= new Actions(driver);
			if(searchStore.isEnabled())
			{
				System.out.println("search field is enabled");
				//first moving the elemtn to the search- then click on the search field and then enteringthe data
				a.moveToElement(searchStore).click().sendKeys("books").build().perform();
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				System.out.println("script is successfull");
			}
			else {
				System.out.println("search field is disabled");
			}
		}
		else {
			System.out.println("you are not  in demo shop page");
			CloseBrowser();
		}
		
	}

}
