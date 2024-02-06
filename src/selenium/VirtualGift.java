package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VirtualGift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/25-virtual-gift-card");
    driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("Shrenika");
    driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("Shrenika@gmail.com");
    driver.findElement(By.id("giftcard_2_SenderName")).sendKeys("hanu");
    driver.findElement(By.id("giftcard_2_SenderEmail")).sendKeys("hanushyaa@gmail.com");
    driver.findElement(By.id("add-to-cart-button-2")).click();
	}

}
