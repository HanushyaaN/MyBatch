package selenium;

import org.openqa.selenium.By;

public class XpathByAttribute extends UtilityForDemoWebShop{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     ChromeBrowser();
     openDWS();
     Thread.sleep(2000);
     //click the login link
     driver.findElement(By.xpath("//a[@class=\"ico-cart\"]")).click();
     Thread.sleep(2000);
//     driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();
//     Thread.sleep(2000);
//     driver.findElement(By.xpath("//input[@class=\"email\"]")).sendKeys("hanushyaa@gmail.com");
//     Thread.sleep(2000);
//     driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Password@123");
//     Thread.sleep(2000);
//     driver.findElement(By.xpath("//input[@id=\"RememberMe\"]")).click();
//     Thread.sleep(2000);
//     driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click();
     
	}

}
