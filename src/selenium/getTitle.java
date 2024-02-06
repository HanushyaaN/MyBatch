package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//open the browser
		WebDriver driver= new ChromeDriver();
		//maximise the browser
		driver.manage().window().maximize();
		//enter into a demo webshop
		driver.get("https://demowebshop.tricentis.com/");
		String given_title= "Demo Web Shop";
		System.out.println(driver.getTitle());
		String current_title= driver.getTitle();
		if(given_title.equals(current_title))
		{
			System.out.println("given title and current title is same");
		}
		else {
			System.out.println("the title and current title is not same");
			driver.close();
		}
		
	}

}
