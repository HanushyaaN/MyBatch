package popUp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import assignment_class.AssignUtiltityDigitalPage;
import selenium.UtilityForDemoWebShop;

public class CalenderPopUp extends UtilityForDemoWebShop{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		openAgodaBookingWeb();
		//no thanks pop up is displayed after 3-4 seconds..so applying explicit wait condition and then clicking on no thanks button
		WebElement no_thanks=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='No thanks']")));
		no_thanks.click();
		//click on the check in date 
		driver.findElement(By.xpath("//div[@data-selenium='checkInBox']")).click();
		//click on 17 date for check in
		driver.findElement(By.xpath("//span[@data-selenium-date='2024-02-17']")).click();
		//driver.findElement(By.xpath("//div[@aria-label='Thu May 23 2024']")).click();
		//button[@aria-label='Next Month']
		
	List<WebElement> calender_arrow=driver.findElements(By.xpath("//button[@aria-label='Next Month']"));
	
	int i=0;
	for (WebElement web : calender_arrow) {
		System.out.println("entered into Loop condition....");
		web.click();
		//web.click();
		WebElement return_date=driver.findElement(By.xpath("//div[@aria-label='Thu May 23 2024']"));
		String returnDate="Thu May 23 2024";
		String returnDate_fetching=return_date.getAccessibleName();
		if(returnDate.equals(returnDate_fetching)) {
			System.out.println("entered into If condition...........");
			return_date.click();
		}
		i++;
		
		}
	//calender_arrow.click();
	//calender_arrow.click();
	//click on arrow button of calender for check out date
	//WebElement return_date=driver.findElement(By.xpath("//div[@aria-label='Thu May 23 2024']"));
			//for (WebElement web : calender_arrow) {
				//if(return_date.getText() != null) {
					
				//}
			}
		
			
		
	}
	
		
		
	
