package listerner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listerner.StartListerner.class)
public class TestMethod{
	@Test
	public void login() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//maximise the browser
		driver.manage().window().maximize();
		//enter into demo web page
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		String url="https://demowebshop.tricentis.com/";
		String currentUrl=driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		if(url.equals(currentUrl)) {
			System.out.println("enter into correct page");
			driver.findElement(By.className("ico-login")).click();
			Thread.sleep(2000);
		String register_title="Demo Web Shop. Login";
		System.out.println(driver.getTitle());
		String current_title=driver.getTitle();
		if(register_title.equals(current_title)) {
			System.out.println("login page title is same");
			driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("Hanu16@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("password123");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[type='checkbox']")).click();
			Thread.sleep(2000);
				driver.findElement(By.cssSelector("input[value='Log in']")).click();
				Assert.fail();
				driver.close();
			}
			else {
				System.out.println("login page title is not same");
			}
			}
			else {
				System.out.println("entered into wrong page");
				driver.close();
			}
		
	}
}
