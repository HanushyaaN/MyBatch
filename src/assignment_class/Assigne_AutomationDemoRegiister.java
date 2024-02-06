package assignment_class;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import selenium.UtilityForDemoWebShop;

public class Assigne_AutomationDemoRegiister extends UtilityForDemoWebShop{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		openAutomationDemoRegister();
		String[] inputfill= {"Hanushyaa","Nachi","Hanushyaa@gmail.com","9606593879","Password123","Password123"};
		String[] lang_List= {"English","Hindi","Malay","Serbian","Korean","Finnish"};
		Actions a=new Actions(driver);
		List<WebElement> inputDetails=driver.findElements(By.xpath("//form[@id='basicBootstrapForm']/div/div/input"));
		//looping to fill the input details of Fname, Lname, Email,ph no,pwd,confirmPwd
		int i=0;
		for (WebElement web : inputDetails) {
			web.sendKeys(inputfill[i++]);
			//Thread.sleep(2000);
		}
		WebElement address=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		address.sendKeys("Door no:51A, Erumpukaadu post,");
		a.keyDown(Keys.ENTER).build().perform();
		address.sendKeys("Rajakamangalam, Nagercoil, TN-6500009");
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		driver.findElement(By.id("checkbox2")).click();
		//multi select drop for language input
		driver.findElement(By.id("msdd")).click();
		//clicks on particular language given in the array-gets the land_list[] of 6 languages
		List<WebElement> Mutlti_lang=driver.findElements(By.xpath("(//div[@class='form-group'])[7]/div/multi-select/div[2]/ul/li"));
		for (int j = 0; j < lang_List.length; j++) {
			System.out.println("list of lannguages:: : "+lang_List.length);
			//driver.findElements(By.name(lang_List)).c
		}
		//clicks on  all the options from multi drop down list
		//	for (WebElement web : Mutlti_lang) {
			//	web.click();
				//i++;
			//}  
//single select- skills 
			WebElement skills=driver.findElement(By.id("Skills"));
			Select s=new Select(skills);
		s.selectByValue("Analytics");
		//select country drop down;
	  driver.findElement(By.xpath("//span[@role='combobox']")).click();
	  //entered "IN" send keys insise country input
	  WebElement countryList=driver.findElement(By.xpath("//input[@type='search']"));
	  countryList.sendKeys("in");
	  //selecting the India value from drop down
	  driver.findElement(By.xpath("//li[text()='India']")).click();
	  //select DOB- year drop down
	WebElement year=driver.findElement(By.id("yearbox"));
	Select s_year=new Select(year);
	s_year.selectByVisibleText("1992");
	 //select DOB- month drop down
	WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
	Select s_month=new Select(month);
	s_month.selectByValue("April");
	//select DOB- date drop down
		WebElement date=driver.findElement(By.id("daybox"));
		Select s_date=new Select(date);
		s_date.selectByValue("16");
		//upload file
		WebElement file_upload=driver.findElement(By.xpath("//input[@type='file']"));
		a.moveToElement(file_upload).build().perform();
		file_upload.sendKeys("C:\\Users\\hanu\\Desktop\\ModelResume_SoftwareTesting\\resume formate 12.pdf");
		//submit button
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		a.keyUp(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.id("submitbtn")).click();
		
//close browser
		CloseBrowser();
	}

}
