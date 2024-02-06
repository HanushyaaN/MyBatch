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

public class FetchingRegisterDataFromExternal extends BaseClass{

	@Test
	public void Register() throws EncryptedDocumentException, IOException {
		driver.get("https://demowebshop.tricentis.com");
		File excel = new File("C:\\Selenium\\RegisterExcel.xlsx");
		 FileInputStream fis = new FileInputStream(excel);
		 Workbook wbf = WorkbookFactory.create(fis);
		 Sheet sheet = wbf.getSheet("Sheet1");
		 String Fname = sheet.getRow(0).getCell(0).toString();
		 String Lname = sheet.getRow(0).getCell(1).toString();
		 String email = sheet.getRow(0).getCell(2).toString();
		 String pwd = sheet.getRow(0).getCell(3).toString();
		 String confirmPwd = sheet.getRow(0).getCell(4).toString();
		 
		
		 driver.findElement(By.className("ico-register")).click();
		 driver.findElement(By.id("gender-female")).click();
		 driver.findElement(By.id("FirstName")).sendKeys(Fname);
	     driver.findElement(By.name("LastName")).sendKeys(Lname);
	     driver.findElement(By.id("Email")).sendKeys(email);
	     driver.findElement(By.name("Password")).sendKeys(pwd);
	     driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmPwd);
	     driver.findElement(By.id("register-button")).click();
	}
}
