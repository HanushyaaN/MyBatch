package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class getAttributeMethod extends UtilityForDemoWebShop{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String value="mobile";
        ChromeBrowser();
        openDWS();
        Thread.sleep(2000);
        WebElement searchField=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        searchField.sendKeys("mobile");
        Thread.sleep(2000);
         String attribute_value=searchField.getAttribute("value");
         Thread.sleep(2000);
         if(value.equals(attribute_value)) {
        	 System.out.println("you have fetched correct value");
        	 System.out.println(attribute_value);
         }
         else {
        	 System.out.println("you have fetched incorrect value");
         }
         CloseBrowser();
	}

}
