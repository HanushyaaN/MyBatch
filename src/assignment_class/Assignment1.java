package assignment_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.honda2wheelersindia.com/");
       String url="https://www.honda2wheelersindia.com/";
       System.out.println(driver.getCurrentUrl());
       String currentUrl=driver.getCurrentUrl();
       if(url.equals(currentUrl))
       {
    	   System.out.println("you are on the honda page");
       }
       else {
    	   System.out.println("you are not on the honda page");
       }
       driver.close();
       
	}

}
