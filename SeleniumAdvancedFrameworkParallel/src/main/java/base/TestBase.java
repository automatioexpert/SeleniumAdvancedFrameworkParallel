package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.ActionEngine;
import utilities.PropertiesOperations;

public class TestBase  extends ActionEngine{
	BrowserFactory browser = new BrowserFactory();

	@BeforeMethod
	public void setUp() {
		WebDriver driverInstance = browser.createBrowserInstance("chrome");
		DriverFactory.getInstance().setDriver(driverInstance);
		WebDriver driver = DriverFactory.getInstance().getDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to(PropertiesOperations.getPropertyValue("url"));
	}

	@AfterMethod
	public void tearDown() {
		DriverFactory.getInstance().closeBrowser();

	}

}
