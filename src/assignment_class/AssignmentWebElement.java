package assignment_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentWebElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String given_Url = "https://demowebshop.tricentis.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement Tricentris = driver.findElement(By.cssSelector("div[class='nivoSlider']"));
		// System.out.println(Tricentris);
		System.out.println("found tricentris");
		if (Tricentris.isDisplayed()) {
			System.out.println("you are in Tricentis Demo web shop page");
			List<WebElement> featured_Products = driver.findElements(By.cssSelector("input[value='Add to cart']"));
			System.out.println("featured products");
			WebElement virtual_gift = driver.findElement(By.partialLinkText("$25 Virtual Gift Card"));
			System.out.println("virtual gits");
			for (WebElement web : featured_Products) {
				System.out.println("enter into webelement list");
				web.click();
				System.out.println("looped");
				 if(virtual_gift.isDisplayed()) {
				  System.out.println("entered into virtual gift");
					/*
					 * driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("Shrenika");
					 * System.out.println("recipeint name"); Thread.sleep(2000);
					 * driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys(
					 * "Shrenika@gmail.com"); Thread.sleep(2000);
					 * driver.findElement(By.id("giftcard_2_SenderName")).sendKeys("hanu");
					 * Thread.sleep(2000);
					 * driver.findElement(By.id("giftcard_2_SenderEmail")).sendKeys(
					 * "hanushyaa@gmail.com");
					 */
					/*
					 * Thread.sleep(2000);
					 * driver.findElement(By.id("add-to-cart-button-2")).click();
					 */
				 } 
				 else 
				 { 
					 System.out.println("not entered into virtual gift"); 
					 }
				 
			}	
		} else {
			System.out.println("you are not into Tricentris demo web shop page");
			driver.close();
		}

	}
}
