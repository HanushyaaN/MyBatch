package select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import selenium.UtilityForDemoWebShop;

public class IssMultiipleMethod extends UtilityForDemoWebShop{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeBrowser();
        driver.navigate().to("file:///C:/Users/hanu/Downloads/demo-1.html");
        //store the drop dwon value
        WebElement singledrop=driver.findElement(By.xpath("//select[@id='standard_cars']"));
        WebElement Multidrop=driver.findElement(By.xpath("//select[@id='multiple_cars']"));
        Select s= new Select(singledrop);
        Select m= new Select(Multidrop);
        if(s.isMultiple()) {
        	List<WebElement> values=s.getOptions();
        	for(WebElement web: values) {
        		web.click();
        	}
        	
        }
        else {
        	System.out.println("you are in multi drop down");
        	List<WebElement> getmultiValue=m.getOptions();
        	for(WebElement web1: getmultiValue) {
        		web1.click();
        	}
        	m.deselectAll();
        }
        CloseBrowser();
	}

}
