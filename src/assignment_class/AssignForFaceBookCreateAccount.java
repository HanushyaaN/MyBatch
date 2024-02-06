package assignment_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import selenium.UtilityForDemoWebShop;

public class AssignForFaceBookCreateAccount extends UtilityForDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//String[] details= {"shrenikaHanu","SaH","9739495287"};
     ChromeBrowser();
     openFacebookPage();
     String given_url="https://www.facebook.com/";
     String current_url=driver.getCurrentUrl();
     //verifying the facebook page by url
     if(given_url.equals(current_url)) {
    	 System.out.println("successfully entered the facebook page");
    	 Thread.sleep(2000);
    	// click on create account button
    	 driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
    	 Thread.sleep(5000);
    	 WebElement signUp_Text=driver.findElement(By.xpath("//div[text()='Sign Up']"));
    	 Thread.sleep(2000);
    	 //verifying the create account  page using webelement 
    	 if(signUp_Text.isDisplayed()) {
    		 System.out.println("signup page verified successfully");
    		 //filling up the deatils using Xpath
    		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("shrenikahanu");
    		
    		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("sah");
    		  String userData="Shrenika@gmail.com";
    	        String phNo="9625879625";
    	        String email="Shrenika@gmail.com";
    	        if(Character.isDigit(userData.charAt(0))){
    			System.out.println("user enetered emailaddress condition");
    			 Thread.sleep(5000);
    			 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(email);
    			 Thread.sleep(2000);
    	        	driver.findElement(By.xpath("//input[@name=name='reg_email_confirmation__]")).sendKeys(email);
    			 Thread.sleep(2000);
    			
    			 driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("PasswordStrong@879");
        		 Thread.sleep(2000);
        		 //selecting the day drop down using single select drop down by using selectvisibleText()
        		 WebElement selectDay=driver.findElement(By.xpath("//select[@aria-label='Day']"));
        		 Thread.sleep(2000);
        		 Select s_ref_day= new Select(selectDay);
        		 Thread.sleep(2000);
        		 s_ref_day.selectByVisibleText("6");
        		 Thread.sleep(2000);
        		 
        		 //selecting the month drop down using single select drop down by using selectByIndex()
        		 WebElement selectMonth=driver.findElement(By.xpath("//select[@name='birthday_month']"));
        		 Thread.sleep(2000);
        		 Select s_ref_month= new Select(selectMonth);
        		 Thread.sleep(2000);
        		 s_ref_month.selectByIndex(5);
        		 Thread.sleep(2000);
        		 
        		//selecting the year drop down using single select drop down by using selectByValue()
        		 WebElement selectYear=driver.findElement(By.xpath("//select[@title='Year']"));
        		 Thread.sleep(2000);
        		 Select s_ref_year= new Select(selectYear);
        		 Thread.sleep(2000);
        		 s_ref_year.selectByValue("2000");
        		 Thread.sleep(2000);
        		 //click on the female radio button
        		 driver.findElement(By.xpath("//input[@value='1']")).click();
        		 Thread.sleep(5000);
        		//click on the sign Up button
        		 driver.findElement(By.xpath("//button[@name='websubmit']")).click();
        		 Thread.sleep(2000);
        		
    		}
    		else {
    			System.out.println("user enetered mobile number");
    			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(phNo);
    			driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("PasswordStrong@879");
    			Thread.sleep(2000);
    			 //selecting the day drop down using single select drop down by using selectvisibleText()
       		 WebElement selectDay=driver.findElement(By.xpath("//select[@aria-label='Day']"));
       		 Thread.sleep(2000);
       		 Select s_ref_day= new Select(selectDay);
       		 Thread.sleep(2000);
       		 s_ref_day.selectByVisibleText("6");
       		 Thread.sleep(2000);
       		 
       		 //selecting the month drop down using single select drop down by using selectByIndex()
       		 WebElement selectMonth=driver.findElement(By.xpath("//select[@name='birthday_month']"));
       		 Thread.sleep(2000);
       		 Select s_ref_month= new Select(selectMonth);
       		 Thread.sleep(2000);
       		 s_ref_month.selectByIndex(5);
       		 Thread.sleep(2000);
       		 
       		//selecting the year drop down using single select drop down by using selectByValue()
       		 WebElement selectYear=driver.findElement(By.xpath("//select[@title='Year']"));
       		 Thread.sleep(2000);
       		 Select s_ref_year= new Select(selectYear);
       		 Thread.sleep(2000);
       		 s_ref_year.selectByValue("2000");
       		 Thread.sleep(2000);
       		 //click on the female radio button
       		 driver.findElement(By.xpath("//input[@value='1']")).click();
       		 Thread.sleep(5000);
       		//click on the sign Up button
       		 driver.findElement(By.xpath("//button[@name='websubmit']")).click();
       		 Thread.sleep(2000);
    		}
    		 //driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9759495287");
    		
    		
    		
    	 }
    	 else {
    		 System.out.println("signup page unsuccessfull");
    	 }
     }
     
     
     else {
    	 System.out.println("unsuccessfull while entering FB page");
     }
     
    

	}

}
