package assignment_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentRegister {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//open the browser
      WebDriver driver= new ChromeDriver();//upcasting
      driver.manage().window().maximize();
      //enter into demo web shop
      driver.get("https://demowebshop.tricentis.com/");
      //click the register button
      driver.findElement(By.className("ico-register")).click();
      //Thread.sleep(2000);
      //driver.findElement(By.id("gender-male")).click();
      Thread.sleep(2000);
      driver.findElement(By.id("gender-female")).click();
      Thread.sleep(2000);
     driver.findElement(By.id("FirstName")).sendKeys("Hanu");
     Thread.sleep(2000);
     driver.findElement(By.name("LastName")).sendKeys("Nachi");
     Thread.sleep(2000);
     driver.findElement(By.id("Email")).sendKeys("Hanushyaanachi@gmail.com");
     Thread.sleep(2000);
     driver.findElement(By.name("Password")).sendKeys("password123");
     Thread.sleep(2000);
     driver.findElement(By.id("ConfirmPassword")).sendKeys("password123");
     Thread.sleep(2000);
     driver.findElement(By.id("register-button")).click();
     Thread.sleep(2000);
     driver.findElement(By.className("ico-login")).click();
    
      
	}

}
