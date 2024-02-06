package selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UtilityForDemoWebShop{

	//globally assigning chrome variable
	public static WebDriver driver;
	
	public static void ChromeBrowser() {
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public static void EdgeBrowser() {
		driver =  new EdgeDriver();
		driver.manage().window().maximize();
		
	}
	public static void FireFox() {
		driver =  new FirefoxDriver();
		driver.manage().window().maximize();
		
	}
	
	public static void CloseBrowser() {
		driver.close();
	}
	
	public static void QuitBrowser() {
		driver.quit();
	}
	
	public static void openDWS() {
		driver.get("https://demowebshop.tricentis.com/");
	}
	public static void openShopperstack() {
		driver.get("https://www.shoppersstack.com/");
	}
	public static void openKalkiFashionWeb() {
		driver.get("https://www.kalkifashion.com/in/");
	}
	public static void openRedBus() {
		driver.get("https://www.redbus.in/");
	}
	public static void openDream11() {
		driver.get("https://www.dream11.com/");
	}
	public static void openAuthenticatePopUp() {
		driver.get("https://the-internet.herokuapp.com/basic_auth");
	}
	public static void openAlerPopUpPage() {
		driver.get("https://demo.automationtesting.in/Alerts.html");
	}
	public static void openOmayoBlog() {
		driver.get("http://omayo.blogspot.com/");
	}
	public static void openDemoGuru99() {
		driver.get("https://www.demo.guru99.com/test/simple_context_menu.html");
	}
	public static void openSpeedTestIFrameWeb() {
		driver.get("https://www.speedtest.net/");
	}
	public static void openAgodaBookingWeb() {
		driver.get("https://www.agoda.com/en-in");
	}
	public static void openAutomationDemoRegister() {
		driver.get("https://demo.automationtesting.in/Register.html");
	}
	public static void openDTmlForDragDrop() {
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	}
	
	public static void openMyntraPage() {
		driver.get("https://www.myntra.com/");
	}
	public static void openNaukriPage() {
		driver.get("https://www.naukri.com/");
	}
	public static void openSkillRaryPage() {
		driver.get("https://skillrary.com/");
	}
	
	public static void openOracleDownloadsPage() {
		driver.get("https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html");
	}
	public static void openInstagramPage() {
		driver.get("https://www.instagram.com/");
	}
	public static void openFacebookPage() {
		driver.get("https://www.facebook.com/");
	}
	
	public static void openCurrentUrl(){
		driver.getCurrentUrl();
	}
	
	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub
  // WebDriver driver=new ChromeDriver();//precondition
   //driver.manage().window().maximize();//pre condition
   //driver.get("https://demowebshop.tricentis.com/");//test script
  // driver.close();//post condition
		ChromeBrowser();//precondition
		openDWS();//Test script
		CloseBrowser();//postcondition
   }

}
