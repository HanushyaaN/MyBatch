package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Testing {

	public static void main(String[] hanu) {
		// TODO Auto-generated method stub
		ChromeDriver chrome= new ChromeDriver();
		//FirefoxDriver fire=new FirefoxDriver();
		chrome.manage().window().maximize();
		//chrome.manage().window().minimize();
		chrome.get("https://demowebshop.tricentis.com/");
			}

}
