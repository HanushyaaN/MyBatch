package assignment_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium.UtilityForDemoWebShop;

public class AssignUtiltityLoginPage extends UtilityForDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     //open the browser
		//WebDriver driver=new ChromeDriver();
		//used Utility package for opening chrome driver and maximisnig it
	     ChromeBrowser();
		
		//maximise the browser
		//driver.manage().window().maximize();
		//enter into demo web page
		Thread.sleep(2000);
		//driver.get("https://demowebshop.tricentis.com/");
		//using utility class to open the url page
		openDWS();
		//verify the url
		String url="https://demowebshop.tricentis.com/";
		String currentUrl=driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		if(url.equals(currentUrl)) {
			System.out.println("enter into correct page");
			//click on login page
			
			driver.findElement(By.className("ico-login")).click();
			Thread.sleep(2000);
			
		//verify the login page by using title
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
			}
			
			//fill up the form using css selector
			else {
				System.out.println("login page title is not same");
			}
			}
			else {
				System.out.println("entered into wrong page");
				//driver.close();
				//used Utility package for closing browser
				CloseBrowser();
			}
		
		
}
}
