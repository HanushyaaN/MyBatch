package selenium;

import org.openqa.selenium.By;

public class AbXpathRegisterPage extends UtilityForDemoWebShop {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
      ChromeBrowser();
      openDWS();
      Thread.sleep(2000);
      ///using XPath click on register page
      driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[1]/a")).click();
      //using Xpath enter the details in register page
      driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div/div[2]/div/div[2]")).click();
      Thread.sleep(2000);
      //using Xpath enter the first name in register page
      driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div/div[2]/div[2]/input")).sendKeys("hanu");
      Thread.sleep(2000);
    //using Xpath enter the last name in register page
      driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div/div[2]/div[3]/input")).sendKeys("Nachi");
      Thread.sleep(2000);
    //using Xpath enter the email ID in register page
      driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div/div[2]/div[4]/input")).sendKeys("nachi@gmail.com");
      Thread.sleep(2000);
    //using Xpath enter the password in register page
      driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div/input")).sendKeys("Shrenika@12");
      Thread.sleep(2000);
    //using Xpath enter the confirm password in register page
      driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/input")).sendKeys("Shrenika@12");
      Thread.sleep(2000);
    //using Xpath click on register button
      driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[4]/input")).click();
      Thread.sleep(2000);
      CloseBrowser();
      
	}

}
