package DataProviderWithExternal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Testng1.BaseClass;

public class DataProviderWithExternall extends BaseClass{

	@DataProvider(name = "login")
	// object2d -2 dimension array-recievees 2 data-having 2 rows
	public Object[][] sender() throws EncryptedDocumentException, IOException {
		Object[][] obj = new Object[2][2];
		File excel = new File("C:\\Selenium\\LoginExcel.xlsx");
		FileInputStream fis = new FileInputStream(excel);
		Workbook wbf = WorkbookFactory.create(fis);
		Sheet sheet = wbf.getSheet("Sheet1");
		obj[0][0] = sheet.getRow(0).getCell(0).toString();
		obj[0][1] = sheet.getRow(0).getCell(1).toString();
		obj[1][0] = sheet.getRow(1).getCell(0).toString();
		obj[1][1] = sheet.getRow(1).getCell(1).toString();
		return obj;
	}

	// data provider is a helper method
	@Test(dataProvider = "login")
	public void receiver(String email, String password) {
		
		 driver.get("https://demowebshop.tricentis.com/login");
		 driver.findElement(By.id("Email")).sendKeys(email);
		 driver.findElement(By.id("Password")).sendKeys(password);
		 driver.findElement(By.id("RememberMe")).click();
		 driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		 
		//System.out.println(email);
		//System.out.println(password);
	}
}
