package popUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import selenium.UtilityForDemoWebShop;

public class PromptAlert_popUp extends UtilityForDemoWebShop{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        String given_Text="Hello Hanu.. !! How are you today";
		ChromeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		openAlerPopUpPage();
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert al= driver.switchTo().alert();
		Thread.sleep(2000);
		//passing value inside pop up
		al.sendKeys("Hanu.. !!");
		al.accept();
		String curent_text=driver.findElement(By.id("demo1")).getText();
		if (given_Text.equals(curent_text)) {
			System.out.println("you are successfully printed the text");
			System.out.println(curent_text);
			CloseBrowser();
		} else {
			System.out.println("text printed unsuccesfull");
			CloseBrowser();
		}
	}

}
