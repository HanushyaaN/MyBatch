package assignment_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium.UtilityForDemoWebShop;

public class AssignUtiltityRegisterPage extends UtilityForDemoWebShop {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//open the browser
     // WebDriver driver= new ChromeDriver();//upcasting
      //driver.manage().window().maximize();
		UtilityForDemoWebShop.ChromeBrowser();
      //enter into demo web shop
      //driver.get("https://demowebshop.tricentis.com/");
		//using utility class to open the url page
		UtilityForDemoWebShop.openDWS();
		String url="https://demowebshop.tricentis.com/";
		String currentUrl=driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		if(url.equals(currentUrl)) {
			System.out.println("enter into correct page");
			//click on Register page
      driver.findElement(By.className("ico-register")).click();
      //verify the Register page by using title
		String register_title="Demo Web Shop. Register";
		System.out.println(driver.getTitle());
		String current_title=driver.getTitle();
		if(register_title.equals(current_title)) {
			System.out.println("Register page title is same");
      driver.findElement(By.id("gender-female")).click();
      Thread.sleep(2000);
     driver.findElement(By.id("FirstName")).sendKeys("Hanu");
     Thread.sleep(2000);
     driver.findElement(By.name("LastName")).sendKeys("Nachi");
     Thread.sleep(2000);
     driver.findElement(By.id("Email")).sendKeys("Malathy@gmail.com");
     Thread.sleep(2000);
     driver.findElement(By.name("Password")).sendKeys("password123");
     Thread.sleep(2000);
     driver.findElement(By.id("ConfirmPassword")).sendKeys("password123");
     Thread.sleep(2000);
     driver.findElement(By.id("register-button")).click();
     Thread.sleep(2000);
     //driver.findElement(By.className("ico-login")).click();
   
		}
		else {
			System.out.println("login page title is not same");
		}
		}
		else {
			System.out.println("entered into wrong page");
			//driver.close();
			//used Utility package for closing browser
			UtilityForDemoWebShop.CloseBrowser();
		}
	}

}
