package ActionClass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.description.annotation.AnnotationList.Empty;
import selenium.UtilityForDemoWebShop;

public class DragAndDropAction extends UtilityForDemoWebShop{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] capital= {"Oslo","Stockholm","Washington","Copenhagen","Seoul","Rome","Madrid"};
      ChromeBrowser();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      //opends the dtml page for drag drop action
      openDTmlForDragDrop();
      Actions a=new Actions(driver);
      //webelement for source and target element
		/*
		 * WebElement capital=driver.findElement(By.id("box5")); WebElement
		 * countries=driver.findElement(By.id("box105")); a.dragAndDrop(capital,
		 * countries).perform();
		 * 
		 * WebElement capital2=driver.findElement(By.id("box3")); WebElement
		 * countries2=driver.findElement(By.id("box103")); a.dragAndDrop(capital2,
		 * countries2).perform();
		 * 
		 * WebElement capital3=driver.findElement(By.id("box6")); WebElement
		 * countries3=driver.findElement(By.id("box106")); a.dragAndDrop(capital3,
		 * countries3).perform(); //CloseBrowser();
		 */
      // listForCapitals=driver.findElements(By.id("dropContent"));
      List<WebElement> listForCapitals=driver.findElements(By.xpath("//div[@class='dragableBox']"));
      List<WebElement> listForcountries= driver.findElements(By.xpath("//div[@class='dragableBoxRight']"));
      for(WebElement web: listForCapitals) {
    	 //System.out.println("gets the size::: "+web.getSize()); 
    	// System.out.println("gets the text:::  "+web.getText()); 
    	 //System.out.println("gets the attribute value:::  "+web.getAttribute("dragableelement"));
    	  String arrayCapital=web.getText();
    	  char capitalId=web.getAttribute("id").charAt(3);
    	 if(!web.getText().isEmpty()) {
    		 System.out.println("prints the not null value ::: "+arrayCapital +   "get the index ::: "+capitalId);
    		// char capitalIdSorted=web.getAttribute("id").charAt(3);
    	 }
    	 
    	       }
      
      for(WebElement web2:listForcountries) {
 		 char countriesId=web2.getAttribute("id").charAt(5);
 		 System.out.println("prints the countries ID:::: "+countriesId);
 		
 	 }
      
     
    
	}

}
