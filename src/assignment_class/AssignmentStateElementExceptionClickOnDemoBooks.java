package assignment_class;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import selenium.UtilityForDemoWebShop;

public class AssignmentStateElementExceptionClickOnDemoBooks extends UtilityForDemoWebShop {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
     ChromeBrowser();
     openDWS();
     driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
     Thread.sleep(2000);
     WebElement sortBy= driver.findElement(By.xpath("//select[@id='products-orderby']"));
     Select s=new Select(sortBy);
     List<WebElement> options= s.getOptions();
     int i=0;
     for(WebElement web: options) {
    	 //to avoid the state element exception -while selecting the drop down menu for each webelemt the page gets refreshed-so the inner element get
    	 //gets vanished or the old element gets scale state- so passing the element again 
    	 sortBy= driver.findElement(By.xpath("//select[@id='products-orderby']"));
    	 s=new Select(sortBy);
    	 s.selectByIndex(i++);
    	 Thread.sleep(2000);
     }
     Thread.sleep(3000);
     WebElement display= driver.findElement(By.xpath("//select[@id='products-pagesize']"));
     Thread.sleep(2000);
     Select s_display= new Select(display);
     List<WebElement> listOption= s.getOptions();
     int j=0;
     for(WebElement web1: listOption) {
    	 display= driver.findElement(By.xpath("//select[@id='products-pagesize']"));
    	 s_display= new Select(display);
    	 s_display.selectByIndex(j++);
    	 Thread.sleep(2000);
     }
     
     
	}

}
