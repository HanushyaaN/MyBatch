package select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import selenium.UtilityForDemoWebShop;

public class FacebookUsingSelectClass extends UtilityForDemoWebShop{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeBrowser();
        openFacebookPage();
        //
        String userData="9625879625";
        String phNo="9625879625";
        String email="Shrenika@gmail.com";
        if(Character.isDigit(userData.charAt(0))){
        	System.out.println("by using mobile number");
        	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(phNo);
        	driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("PasswordStrong@879");
        	Thread.sleep(1000);
        	 WebElement selectDay=driver.findElement(By.xpath("//select[@aria-label='Day']"));
    		 Thread.sleep(1000);
    		 Select s_ref_day= new Select(selectDay);
    		 s_ref_day.selectByVisibleText("23");
    		 
    		 WebElement selectMonth=driver.findElement(By.xpath("//select[@name='birthday_month']"));
    		 Thread.sleep(1000);
    		 Select s_ref_month= new Select(selectMonth);
    		 Thread.sleep(1000);
    		 s_ref_month.selectByIndex(5);
    		 
    		 WebElement selectYear=driver.findElement(By.xpath("//select[@title='Year']"));
    		 Thread.sleep(1000);
    		 Select s_ref_year= new Select(selectYear);
    		 Thread.sleep(1000);
    		 s_ref_year.selectByValue("2000");
    		 
    		 Thread.sleep(1000);
    		 //click on the female radio button
    		 driver.findElement(By.xpath("//input[@value='1']")).click();
    		 Thread.sleep(5000);
    		//click on the sign Up button
    		 driver.findElement(By.xpath("//button[@name='websubmit']")).click();
    		 Thread.sleep(2000);
        }
        else {
        	System.out.println("by using email ID ");
        	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(email);
        	driver.findElement(By.xpath("//input[@name=name='reg_email_confirmation__]")).sendKeys(email);
        	driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("PasswordStrong@879");
        	Thread.sleep(1000);
        	 WebElement selectDay=driver.findElement(By.xpath("//select[@aria-label='Day']"));
    		 Thread.sleep(1000);
    		 Select s_ref_day= new Select(selectDay);
    		 s_ref_day.selectByVisibleText("23");
    		 
    		 WebElement selectMonth=driver.findElement(By.xpath("//select[@name='birthday_month']"));
    		 Thread.sleep(1000);
    		 Select s_ref_month= new Select(selectMonth);
    		 Thread.sleep(1000);
    		 s_ref_month.selectByIndex(5);
    		 
    		 WebElement selectYear=driver.findElement(By.xpath("//select[@title='Year']"));
    		 Thread.sleep(1000);
    		 Select s_ref_year= new Select(selectYear);
    		 Thread.sleep(1000);
    		 s_ref_year.selectByValue("2000");
    		 
    		 Thread.sleep(1000);
    		 //click on the female radio button
    		 driver.findElement(By.xpath("//input[@value='1']")).click();
    		 Thread.sleep(5000);
    		//click on the sign Up button
    		 driver.findElement(By.xpath("//button[@name='websubmit']")).click();
    		 Thread.sleep(2000);
        	
        }
	}

}
