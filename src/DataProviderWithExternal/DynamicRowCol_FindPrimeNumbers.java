package DataProviderWithExternal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.codec.language.ColognePhonetic;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Testng1.BaseClass;

public class DynamicRowCol_FindPrimeNumbers{

	@DataProvider(name = "numbers")
	public Object[][] sender() throws EncryptedDocumentException, IOException {
	
		File file = new File("C:\\Selenium\\NumberExcel.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wbf = WorkbookFactory.create(fis);
		Sheet sheet = wbf.getSheet("Sheet1");
		/*int val1 = sheet.getRow(3).getPhysicalNumberOfCells();
		int val2 = sheet.getRow(2).getPhysicalNumberOfCells();
		System.out.println("prints sender value1..:"+val1);
		System.out.println("prints sender value2..:"+val2);*/
		int row = sheet.getPhysicalNumberOfRows();
		int column = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] obj=new Object[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
		     obj[i][j]=sheet.getRow(i).getCell(j);
		     if(row % 1==0 || column %1==0) {
		    	 System.out.println("to check for prime number....");
		    	 i++;
		    	 j++;
		     }
		    
			}
			
		}
		System.out.println(row);
		System.out.println(column);
		
		return obj;
	}
	
	@Test(dataProvider = "numbers")
	public void receiver(int value, int value2) {
		System.out.println(value);
		System.out.println(value2);
	}
}
