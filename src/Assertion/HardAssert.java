package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import Testng1.BaseClass;

public class HardAssert extends BaseClass{

	@Test
	public void dws(){
		String given_url="https://demowebshop.tricentis.com/";
		String current_url = driver.getCurrentUrl();
		//Hard Assert
		//Assert.assertEquals(given_url, current_url);
		//Assert.assertNotEquals(given_url, current_url);
		
		//soft Assert- always use this assertAll() at the end for soft assert but for hard assert it is optional
		SoftAssert softAss = new SoftAssert();
		softAss.assertEquals(given_url, current_url);
		softAss.assertNotEquals(given_url, current_url);
		System.out.println("it is successfull...........");
		//useful for reporting
		softAss.assertAll();
		}
	
}
