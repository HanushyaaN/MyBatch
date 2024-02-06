package DataProviderWithExternal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.plaf.synth.SynthScrollPaneUI;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Testng1.BaseClass;

public class DynamicRowCell extends BaseClass {

	@DataProvider(name = "login")
	public Object[][] dynamicRow() throws EncryptedDocumentException, IOException{
		
		 File f = new File("C:\\Selenium\\Login1FIle.xlsx");
		 FileInputStream fis = new FileInputStream(f);
		 Workbook wbf = WorkbookFactory.create(fis);
		 Sheet sheet = wbf.getSheet("Sheet1");
		 int row = sheet.getPhysicalNumberOfRows();
		 int coloum = sheet.getRow(0).getPhysicalNumberOfCells();
		 Object[][] obj= new Object[row][coloum];
		 for (int i = 0; i < row; i++) {
			 for (int j = 0; j < coloum; j++) {
				obj[i][j]=sheet.getRow(i).getCell(j).toString();
			}
			System.out.println(row);
			System.out.println(coloum);
		}
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
	}
}
