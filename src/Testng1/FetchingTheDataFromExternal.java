package Testng1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FetchingTheDataFromExternal extends BaseClass{

	@Test
	public void loginDWS() throws EncryptedDocumentException, IOException {
		driver.get("https://demowebshop.tricentis.com/login");
		File excel=new File("C:\\Selenium\\LoginExcel.xlsx");
		//make connection btw external and eclipse
		FileInputStream fis=new FileInputStream(excel);
		Workbook wbf=WorkbookFactory.create(fis);
		//gets the control over sheet
		 Sheet sheet = wbf.getSheet("Sheet1");
		 //to transfer the controller to particular cell- and to convert that to string-toString
		 //getRow(0).getCell(0)- is 0,0 matrix
		 String email = sheet.getRow(0).getCell(0).toString();
		 String pwd = sheet.getRow(0).getCell(1).toString();
		 
		 driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
	}
}
