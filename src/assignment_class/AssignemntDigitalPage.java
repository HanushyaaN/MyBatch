package assignment_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignemntDigitalPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//open the browser
		String given_url= "https://demowebshop.tricentis.com/";
      WebDriver driver= new ChromeDriver();
      //maximise the browser
      driver.manage().window().maximize();
      //enter into page
      driver.get("https://demowebshop.tricentis.com/");
      if(given_url.equals(driver.getCurrentUrl())) {
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
    		driver.findElement(By.cssSelector("span[class='cart-label']")).click(); 
    		WebElement shoppingCart=  driver.findElement(By.cssSelector("div[class='page-title']"));
    		if(shoppingCart.isDisplayed()) {
    			System.out.println("you are in shopping cart page");
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
