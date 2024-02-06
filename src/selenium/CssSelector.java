package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//open the browser
       WebDriver driver= new ChromeDriver();
       driver.manage().window().maximize();
       driver.navigate().to("https://demowebshop.tricentis.com/");
       Thread.sleep(2000);
       //driver.findElement(By.id("small-searchterms")).sendKeys("mobile");
       //enter the value inside the search text field
       driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("mobile");
       Thread.sleep(2000);
       driver.findElement(By.cssSelector("input[type='submit']")).click();
       Thread.sleep(2000);
       driver.findElement(By.cssSelector("input[id='As']")).click();
       Thread.sleep(2000);
       driver.findElement(By.cssSelector("input[id='As']")).click();
       
       
       
       
	}

}
