package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IndependentAndDependantTextPath extends UtilityForDemoWebShop{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
              ChromeBrowser();
              openDWS();
              Thread.sleep(2000);
             //driver.navigate().to("https://demowebshop.tricentis.com/digital-downloads");
           WebElement digitalDownloads= driver.findElement(By.xpath("(//a[contains(text(),'Digital downloads')])[1]"));
           digitalDownloads.click();
             //get the price text  of the 14 inch laptop
           // WebElement web= driver.findElement(By.xpath("//span[contains(text(),'1590.00')]"));
             Thread.sleep(2000);
             WebElement album = driver.findElement(By.xpath("//a[text()='3rd Album']/../../div[3]/div/span"));
             System.out.println(album.getText()); 
             Thread.sleep(2000);
             WebElement web2= driver.findElement(By.xpath("//a[text()='Music 2']/../../div[3]/div/span"));
             System.out.println(web2.getText());
             Thread.sleep(2000);
             WebElement web= driver.findElement(By.xpath("(//a[text()='Music 2'])[2]/../../div[3]/div/span"));
            System.out.println(web.getText());
           
          
          
          
	}

}
