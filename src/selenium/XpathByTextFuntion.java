package selenium;

import org.openqa.selenium.By;

public class XpathByTextFuntion extends UtilityForDemoWebShop{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      ChromeBrowser();
      openDWS();
      //using Xpath by text -click on register link 
      driver.findElement(By.xpath("//a[text()='Register']")).click();
      Thread.sleep(2000);
      //click on back button
      driver.navigate().to("https://demowebshop.tricentis.com/");
      Thread.sleep(2000);
      //using Xpath by text -click on login link 
      driver.findElement(By.xpath("//a[text()='Log in']")).click();
      Thread.sleep(2000);
    //click on back button
      driver.navigate().to("https://demowebshop.tricentis.com/");
      Thread.sleep(2000);
      //using Xpath by text -click on shopping cart link 
      driver.findElement(By.xpath("//a[text()='Shopping cart']")).click();
      Thread.sleep(2000);
    //click on back button
      driver.navigate().to("https://demowebshop.tricentis.com/");
      Thread.sleep(2000);
      //using Xpath by text -click on wishlist link 
      driver.findElement(By.xpath("//a[text()='Wishlist']")).click();
      Thread.sleep(2000);
    //click on back button
      driver.navigate().to("https://demowebshop.tricentis.com/");
      Thread.sleep(2000);
      CloseBrowser();
	}

}
