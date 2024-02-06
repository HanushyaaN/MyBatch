package select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import selenium.UtilityForDemoWebShop;

public class SingleSelectDropDownMenu extends UtilityForDemoWebShop{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeBrowser();
		openDWS();
		driver.navigate().to("file:///C:/Users/hanu/Downloads/demo-1.html");
		
		// WebElement digitalDownloads= driver.findElement(By.xpath("(//a[contains(text(),'Digital downloads')])[1]")); 
		 //digitalDownloads.click();
		
		Thread.sleep(5000);
		WebElement single_select=driver.findElement(By.cssSelector("select[id='standard_cars']"));
		System.out.println(single_select);
		//WebElement single_select=driver.findElement(By.cssSelector("select[id='products-orderby']"));
		Thread.sleep(2000);
		Select s_ref =new Select(single_select);
		Thread.sleep(5000);
		System.out.println("trying to click on the drop down");
		//using select by visibble text
		s_ref.selectByVisibleText("Mercedes");
		//s_ref.selectByVisibleText("Price: Low to High");
		System.out.println("clicked on drop down");
		Thread.sleep(2000);
		//using select by value
		s_ref.selectByValue("bmw");
		Thread.sleep(2000);
		s_ref.selectByIndex(9);
		Thread.sleep(2000);
		
		CloseBrowser();
	}

}
