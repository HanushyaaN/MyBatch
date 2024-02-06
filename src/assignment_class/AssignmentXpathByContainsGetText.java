package assignment_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium.UtilityForDemoWebShop;

public class AssignmentXpathByContainsGetText extends UtilityForDemoWebShop{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String given_text= "Featured products";
       ChromeBrowser();
       Thread.sleep(2000);
       openDWS();
       Thread.sleep(2000);
       //verification done for page url- do it later
       
       WebElement featuredProduct =driver.findElement(By.xpath("//strong[text()='Featured products']"));
       Thread.sleep(2000);
       String current_text=featuredProduct.getText();
       //equalIgnoreCase ignores the case and checks for the text
       	if(given_text.equalsIgnoreCase(current_text))
       	{
       		System.out.println("I am in DMS page");
       		Thread.sleep(2000);
       		List<WebElement> headerMenu=driver.findElements(By.xpath("/html/body/div[4]/div/div[2]/ul/li/a"));
       		Thread.sleep(2000);
			/*
			 * for(int i=0; i<headerMenu.size();i++ ) { //get the value of the index using get index method
			 *  String text =headerMenu.get(i).getText();
			 * Thread.sleep(2000); System.out.println(text); }
			 */
       		
//       		using for each loop
       		for(WebElement web:headerMenu) {
       			String text=web.getText();
       			Thread.sleep(2000); 
       			System.out.println(text);
       		}
       		CloseBrowser();
       	}
       	else {
       		System.out.println("entered into DMS unsuccessfull");
       	}
	}

}
