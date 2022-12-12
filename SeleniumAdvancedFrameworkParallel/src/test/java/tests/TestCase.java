package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;

public class TestCase extends TestBase {

	LoginPage login = new LoginPage();

	@Test
	public void TestCase1() {
		System.out.println("Test Case1");
		login.doLogin("administrator@localhost.com", "administrator");
		Assert.fail();
	}

	@Test
	public void TestCase2() {
		System.out.println("Test Case2");

	}

	@Test
	public void TestCase3() {
		System.out.println("Test Case3");
	
		

	}
}
