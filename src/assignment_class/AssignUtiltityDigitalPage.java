package assignment_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium.UtilityForDemoWebShop;

public class AssignUtiltityDigitalPage extends UtilityForDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//open the browser
		
    //  WebDriver driver= new ChromeDriver();
      //maximise the browser
     // driver.manage().window().maximize();
		//Using utility package to open and maximise the chrome driver
		UtilityForDemoWebShop.ChromeBrowser();
		
      //enter into page
      //driver.get("https://demowebshop.tricentis.com/");
		//using utility class to open the url page
		UtilityForDemoWebShop.openDWS();
		String given_url= "https://demowebshop.tricentis.com/";
		String currentUrl=driver.getCurrentUrl();
	//UtilityForDemoWebShop.openCurrentUrl();
		System.out.println("given url:: "+given_url);
		System.out.println("current url:: "+driver.getCurrentUrl());
      if(given_url.equals(currentUrl)) {
    	  System.out.println("you are in demo web shop");
    	  driver.findElement(By.partialLinkText("Digital downloads")).click();
    	  String given_title="Demo Web Shop. Digital downloads";
    	  if(given_title.contains(driver.getTitle())) {
    		  System.out.println("you are in digital download page");
    		  List<WebElement> digital_download= driver.findElements(By.cssSelector("input[value='Add to cart']"));
    		  //add the  digital download products
    		  for(WebElement web: digital_download) {
    			  web.click();
    			  Thread.sleep(3000);
    		  }
    		  //emtering into shoopping cart
    		driver.findElement(By.cssSelector("span[class='cart-label']")).click(); 
    		WebElement shoppingCart=  driver.findElement(By.cssSelector("div[class='page-title']"));
    		if(shoppingCart.isDisplayed()) {
    			System.out.println("you are in shopping cart page");
    			List<WebElement> remove_checkbox= driver.findElements(By.cssSelector("input[type='checkbox']"));
    			//clicking only 3 checkboc out of 4 
    			remove_checkbox.remove(remove_checkbox.size()-1);
    			for(WebElement checkBox : remove_checkbox) {
    				checkBox.click();
    				Thread.sleep(2000);
    			}
    			driver.findElement(By.cssSelector("input[name='updatecart']")).click();
    			//used Utility package for closing browser
    			UtilityForDemoWebShop.CloseBrowser();
    		}
    		else {
    			System.out.println("you are not in shopping cart page");
    		}
    	  }
    	  else{
    		  System.out.println("you are not in digital download page");
    	  }
      }
      else {
    	  System.out.println("you are not in demo web shop");
      }
      
	}
}
