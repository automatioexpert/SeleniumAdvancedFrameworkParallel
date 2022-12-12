package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.DriverFactory;
import base.TestBase;
import pages.HomePageObjects;
import pages.LoginPage;

public class TestCase extends TestBase {

	LoginPage login = new LoginPage();
	HomePageObjects home = new HomePageObjects();

	@Test
	public void TestCase1() {
		System.out.println("Test Case1");
		login.doLogin("administrator@localhost.com", "administrator");
		System.out.println(DriverFactory.getInstance().getDriver().getTitle());
		home.checkIfDashBoardPageIsOpened();
		home.clickOnSideSubMenu("Tasks","Add Task");
			
	}

	@Test
	public void TestCase2() {
		System.out.println("Test Case2");
		login.doLogin("administrator@localhost.com", "administrator");
		System.out.println(DriverFactory.getInstance().getDriver().getTitle());
	}

	@Test
	public void TestCase3() {
		System.out.println("Test Case3");
		login.doLogin("administrator@localhost.com", "administrator");
		System.out.println(DriverFactory.getInstance().getDriver().getTitle());

	}
}
