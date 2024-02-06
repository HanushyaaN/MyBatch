package assignment_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.UtilityForDemoWebShop;

public class AssignementXpathByAttribute extends UtilityForDemoWebShop{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeBrowser();
		openDWS();
		String given_url= "https://demowebshop.tricentis.com/";
		String current_url=driver.getCurrentUrl();
		//verifying url
		if(given_url.equals(current_url)) {
			System.out.println("entered into the same page");
			driver.findElement(By.xpath("//a[@href=\"/25-virtual-gift-card\"]")).click();
			WebElement given_title=driver.findElement(By.xpath("//h1[@itemprop=\"name\"]"));
			Thread.sleep(2000);
			//to verify the virtual gift title using isDisplayed
			if(given_title.isDisplayed()) {
				System.out.println("you have entered into virtual gift title");
				Thread.sleep(2000);
				//enter recipient name using XpathAttribute
				driver.findElement(By.xpath("//input[@class=\"recipient-name\"]")).sendKeys("Shrenika");
				Thread.sleep(2000);
				//enter recipient email using XpathAttribute
				driver.findElement(By.xpath("//input[@class=\"recipient-email\"]")).sendKeys("Shrenika@gmail.com");
				Thread.sleep(2000);
				//enter sender name using XpathAttribute
				driver.findElement(By.xpath("//input[@id=\"giftcard_2_SenderName\"]")).sendKeys("hanu");
				Thread.sleep(2000);
				//enter sender name using XpathAttribute
				driver.findElement(By.xpath("//input[@name=\"giftcard_2.SenderEmail\"]")).sendKeys("hanushyaa@gmail.com");
				Thread.sleep(2000);
				//enter Message using XpathAttribute
				driver.findElement(By.xpath("//textarea[@id=\"giftcard_2_Message\"]")).sendKeys("Hi ...");
				Thread.sleep(2000);
				//clearing default quantity using XpathAttribute
				driver.findElement(By.xpath("//input[@id=\"addtocart_2_EnteredQuantity\"]")).clear();
				Thread.sleep(2000);
				//adding 3  quantity using XpathAttribute
				driver.findElement(By.xpath("//input[@id=\"addtocart_2_EnteredQuantity\"]")).sendKeys("3");
				Thread.sleep(2000);
				//clicking on add to cart button using XpathAttribute
				driver.findElement(By.xpath("//input[@class=\"button-1 add-to-cart-button\"]")).click();
				Thread.sleep(5000);
				//click on shopping cart link using XpathAttribute
				//WebElement shopcarLink =  driver.findElement(By.xpath("//li[@id=\"topcartlink\"]"));
				driver.findElement(By.xpath("(//a[@class=\"ico-cart\"])[1]")).click();
				//driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[3]/a")).click();
				Thread.sleep(2000);
				//System.out.println("sopping cart link:::"+shopcarLink);
				System.out.println("clicked on shopping cart");
				WebElement ShoppingCart = driver.findElement(By.xpath("//div[@class=\"page-title\"]"));
				System.out.println("printing shopping cart title");
				//verifying shopping cart page title
				if(ShoppingCart.isDisplayed()) {
					System.out.println("Welcome...entered into shopping cart");
					driver.findElement(By.xpath("//td[@class=\"remove-from-cart\"]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@name=\"updatecart\"]")).click();
					Thread.sleep(2000);
					CloseBrowser();
				}
				else {
					System.out.println("you are not ont shopping cart title");
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
