package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchByUpcasting {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		//given url
     String s="https://www.qspiders.com/";
     WebDriver web= new ChromeDriver();
    web.manage().window().maximize();
    web.get("https://www.qspiders.com/"); 
    //current url
    System.out.println(web.getCurrentUrl());
    String s1=web.getCurrentUrl();
    //verifying the url with current url
    //url is a string so we need to use equals to compare
    if(s.equals(s1)) 
    {
    	System.out.println("url same");
    }
    else {
    	System.out.println("url not same");
    }
    web.close();
   
  
  
	}

}
