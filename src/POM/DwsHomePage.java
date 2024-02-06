package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsHomePage {
	 public DwsHomePage(WebDriver driver){
		//every class having an address- initElement is present inside pagefactory
		//this to get the current address
		 
		 //use to connect the page object model-because of constructor only it is connecting
		PageFactory.initElements(driver, this);
	}
	 //storing the webelement
	@FindBy(id="small-searchterms")
	WebElement searchField;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement searchButton;
	
	@FindBy(xpath = "//a[@class='ico-register']")
	WebElement registerLink;
	
	@FindBy(className = "ico-login")
	WebElement loginLink;
	
	@FindBy(xpath = "(//a[@class='ico-cart'])[1]")
	WebElement shoppingCartLink;
	
	@FindBy(xpath = "(//a[@class='ico-wishlist'])[1]")
	WebElement wishListLink;
	
	@FindBy(xpath = "//ul[@class='top-menu']/li[1]")
	WebElement bookMenu;
	@FindBy(xpath = "//ul[@class='top-menu']/li[2]")
	WebElement computerMenu;
	@FindBy(xpath = "//ul[@class='top-menu']/li[3]")
	WebElement electronicsMenu;
	@FindBy(xpath = "//ul[@class='top-menu']/li[4]")
	WebElement apparaelshoeMenu;
	@FindBy(xpath = "//ul[@class='top-menu']/li[5]")
	WebElement digitalDownloadMenu;
	@FindBy(xpath = "//ul[@class='top-menu']/li[6]")
	WebElement jewelryMenu;
	@FindBy(xpath = "//ul[@class='top-menu']/li[7]")
	WebElement giftgardsMenu;
	@FindBy(id = "newsletter-email")
	WebElement newletterEmail;
	@FindBy(id = "newsletter-subscribe-button")
	WebElement newsletterSubsButton;
	@FindBy(className = "product-picture")
	WebElement virtualGiftImageButton;
	public void register() {
		registerLink.click();
	}
	public void login() {
		loginLink.click();
	}
	public void searchField(String value) {
		searchField.sendKeys(value);
	}
	public void searchButton() {
		searchButton.click();
	}
	
}
