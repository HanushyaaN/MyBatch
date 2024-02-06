package Testng1;

import java.time.Duration;

import org.testng.Reporter;
import org.testng.annotations.Test;

import selenium.UtilityForDemoWebShop;

public class DWS extends UtilityForDemoWebShop{

@Test
public void dws() {
	System.out.println("hi hello");
	/*
	 * ChromeBrowser();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); openDWS();
	 * CloseBrowser();
	 */
	Reporter.log("dws",true);
}

@Test
public void test1() {
	//doesnt print if there is no testNg method-@Test and if there is no main method if it is not TestNg
	System.out.println("hi i m from test 1");
}
@Test
public void cat() {
	//prints based on ASCII code -alphabetical order
	System.out.println("hi I'm from cat");
}
@Test
public void allpha() {
	Reporter.log("check the print order",true);
}
}
