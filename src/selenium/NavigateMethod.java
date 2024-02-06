package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver= new ChromeDriver();
       driver.manage().window().maximize();
       //enter into webpage using navigate method
       driver.navigate().to("https://www.ktmindia.com/");
       String current_titlektm=driver.getTitle();  //title of the page
       driver.get("https://www.royalenfield.com/");  //moving to royal enfield
       driver.navigate().back(); //moving to ktm
       String given_titlektm="KTM | READY TO RACE | Explore the range in India – Models, Features, Price, Colors";
       //
    		   if(current_titlektm.equals(given_titlektm))
    		   {
    			   System.out.println("you are in KTM webpage");
    		   }
    		   else
    		   {
    			   System.out.println("you are in royalenfield page");
    			   driver.navigate().forward();
    		   }
	}

}
