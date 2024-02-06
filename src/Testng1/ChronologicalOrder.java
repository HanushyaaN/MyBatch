package Testng1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronologicalOrder {
@BeforeSuite
public void beforeSuite() {
	System.out.println("before Suite");
}
@BeforeTest
public void beforeTest() {
	System.out.println("before Test");
}
@AfterMethod
public void afterMethod() {
	System.out.println("after Method");
}
@BeforeClass
public void beforeClass() {
	System.out.println("before Class");
}
@BeforeMethod
public void beforeMethod() {
	System.out.println("before Method");
}
@AfterSuite
public void afterSuite() {
	System.out.println("after Suite");
}
@Test
public void test1() {
	System.out.println("Hi hello I'm from test case 1");
}
@Test
public void test2() {
	System.out.println("Hi hello I'm from test case 2");
}
@AfterClass
public void afterClass() {
	System.out.println("after class");
}
@AfterTest
public void afterTest() {
	System.out.println("afterClass");
}

}
