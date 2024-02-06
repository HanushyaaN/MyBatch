package Testng1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProovvider_RegisterPageDWS extends BaseClass{
	
    @DataProvider(name = "Register")
    /*public Object[][] sender(){
    	ArrayList<String> InputFill=new ArrayList<String>();
    	InputFill.add("Shrenika");
    	InputFill.add("HanuS");
    	InputFill.add("Shrenika@gmail.com");
    	InputFill.add("Password@123");
    	InputFill.add("Password@123");
		return new Object[][] {InputFill};
    	
    }*/
    
    /*public List<String> sender(){
    	
    	return Arrays.asList("Shrenika","HanuS","Shrenika@gmail.com","Password@123","Password@123");
    }*/
	/*
	  public Object[][] sender(){ 
	  Object[][] obj= new Object[2][2];
	 obj[0][0]="Shrenika"; 
	 obj[0][1]="HanuS"; 
	 obj[0][2]="Shrenika@gmail.com";
	 obj[0][3]="Password@123"; 
	 obj[0][4]="Password@123"; 
	 return obj;
	  }
	 */
	
	@Test(dataProvider = "Register")
	public void Receiver(ArrayList<String> list) {
		//String[] inputDetails= {"Shrenika","HanuS","Shrenika@gmail.com","Password@123","Password@123"};
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-female")).click();
		List<WebElement> registerFillUp=driver.findElements(By.xpath("//div[@class='inputs']/input"));
		for (WebElement web : registerFillUp) {
			//web.sendKeys(InputDetails);
		}
	}
}
