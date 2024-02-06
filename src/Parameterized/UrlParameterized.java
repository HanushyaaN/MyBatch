package Parameterized;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Testng1.BaseClass;

public class UrlParameterized extends BaseClass{

	@Parameters("URL")
	@Test
	public void dws(String dUrl) {
		//driver.get("https://demowebshop.tricentis.com/");
		driver.get(dUrl);
	}
	@Parameters("URL")
	@Test
	public void dws1(String dUrl) {
		//driver.get("https://demowebshop.tricentis.com/");
		driver.get(dUrl);
	}
}
