package assignment_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentUsingCssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     //open the browser
		WebDriver driver= new ChromeDriver();
		//maximise the browser
		driver.manage().window().maximize();
		//enter the demo web shop page
		driver.get("https://demowebshop.tricentis.com/");
		//verify the url of the page
		String url="https://demowebshop.tricentis.com/";
		String currentUrl=driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		if(url.equals(currentUrl)) {
			System.out.println("enter into correct page");
		}
		else {
			System.out.println("entered into wrong page");
			driver.close();
		}
		//click the register link
		 Thread.sleep(2000);
		driver.findElement(By.className("ico-register")).click();
		//verify register page by using title
		String register_title="Demo Web Shop. Register";
		System.out.println(driver.getTitle());
		String current_title=driver.getTitle();
		if(register_title.equals(register_title)) {
			System.out.println("registered page title is same");
		}
		else {
			System.out.println("register page title is not same");
		}
		//fill the form by css selector
		Thread.sleep(2000);
	      driver.findElement(By.cssSelector("input[value='F']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.cssSelector("input[name='FirstName']")).sendKeys("Hanu");
	      Thread.sleep(2000);
	      driver.findElement(By.cssSelector("input[name='LastName']")).sendKeys("Nachiyappan");
	      Thread.sleep(2000);
	      driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("Hanu16@gmail.com");
	      Thread.sleep(2000);
	      driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("password123");
	      Thread.sleep(2000);
	      driver.findElement(By.cssSelector("input[id='ConfirmPassword']")).sendKeys("password123");
	      Thread.sleep(2000);
	      driver.findElement(By.cssSelector("input[id='register-button']")).click();
	      Thread.sleep(2000);
	      driver.close();
	      	}

}
