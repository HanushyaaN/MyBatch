package popUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import selenium.UtilityForDemoWebShop;

public class CalederPopup_EaseMyTrip extends UtilityForDemoWebShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions ch_options= new ChromeOptions();
		ch_options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch_options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.easemytrip.com/");
		driver.findElement(By.id("ddate")).click();
		driver.findElement(By.id("30/01/2024")).click();
		driver.findElement(By.id("rdate")).click();
		WebElement click=driver.findElement(By.id("img2Nex"));
		/*
		 * click.click(); click.click(); click.click();
		 */
		/*
		 * Boolean flag=true; for(;flag ; ) { try {
		 * driver.findElement(By.xpath("//li[@id='frth_4_23/05/2024']")).click(); }
		 * catch (Exception e) { // TODO: handle exception click.click(); } }
		 */
		//or can try this
		for(; ;) {
			try {
				driver.findElement(By.xpath("//li[@id='frth_4_23/05/2024']")).click();
			}
			catch (Exception e) {
				// TODO: handle exception
				click.click();
			} 
		}
		
		
	}

}
