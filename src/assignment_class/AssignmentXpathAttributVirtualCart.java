package assignment_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.UtilityForDemoWebShop;

public class AssignmentXpathAttributVirtualCart extends UtilityForDemoWebShop{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeBrowser();
		openDWS();
		String given_url= "https://demowebshop.tricentis.com/";
		String current_url=driver.getCurrentUrl();
		String[] name= {"hanu","hanu@gmail.com","Shrenika","Shreni@gmail.com"};
		//verifying url
		if(given_url.equals(current_url)) {
			System.out.println("entered into the same page");
			driver.findElement(By.xpath("//a[@href='/25-virtual-gift-card']")).click();
			WebElement given_title=driver.findElement(By.xpath("//h1[@itemprop='name']"));
			Thread.sleep(2000);
			//to verify the virtual gift title using isDisplayed
			if(given_title.isDisplayed()) {
				System.out.println("you have entered into virtual gift title");
				List<WebElement> fillDetails= driver.findElements(By.xpath("//div[@class='giftcard']/div/input"));
               int i=0;
				for(WebElement loopDetails: fillDetails) {
					System.out.println("entered into looping concept ");
					loopDetails.sendKeys(name[i++]);
					Thread.sleep(2000);
				}
				driver.findElement(By.xpath("//textarea[@id='giftcard_2_Message']")).sendKeys("Hi ...");
				Thread.sleep(2000);
				//clearing default quantity and adding the quantity using XpathAttribute
				WebElement quantity= driver.findElement(By.xpath("//input[@id='addtocart_2_EnteredQuantity']"));
				quantity.clear();
				Thread.sleep(2000);
				quantity.sendKeys("3");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='add-to-cart-button-2']")).click();
				Thread.sleep(5000);
				//driver.findElement(By.xpath("(//a[@class='ico-cart'])[1]")).click();
				driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
				WebElement checkBox =driver.findElement(By.xpath("//input[@name='removefromcart']"));
				checkBox.click();
				Thread.sleep(2000);
				//using isSelected() checking if it is selected or not
				if(checkBox.isSelected()) {
					System.out.println("the shopping  item checkbox is selected");
				WebElement	checkBoxEnabled = driver.findElement(By.xpath("//input[@name='updatecart']"));
				Thread.sleep(2000);
				//using isEnanled() checking if it is enabled or not
				if(checkBoxEnabled.isEnabled()) {
					System.out.println("the update cart button is enabled");
					checkBoxEnabled.click();
					Thread.sleep(2000);
					CloseBrowser();
				}
				else {
					System.out.println("the update cart button not enabled");
				}
				}
				else {
					System.out.println("the shopping  item checkbox not selected");
				}
				
	}
			else {
				System.out.println("you have entered into virtual gift title");
			}
		}
		else {
			System.out.println("entered into the wrong page");
			CloseBrowser();
		}

}
}