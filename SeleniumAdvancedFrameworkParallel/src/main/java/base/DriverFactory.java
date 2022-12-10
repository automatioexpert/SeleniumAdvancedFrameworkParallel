package base;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
	/*
	 * ThreadLocal - Present in java.lang package
	 * -->Mainly used for threading
	 * 
	 * Design Patterns-->represents best practices
	 * 
	 * Singleton design pattern
	 * -->Only one instance should exist
	 * -->Provide global access to that instance
	 * -->By creating getInstance method
	 * 
	 * Factory design pattern
	 * 
	 */
	
	//Private constructor so that no else can create 
	//Object of this class
	private DriverFactory() {
		
		
	}

	private static DriverFactory instance=new DriverFactory(); 
	ThreadLocal<WebDriver> driver= new ThreadLocal<>();
	

	public static DriverFactory getInstance() {
		return instance;
	}
	
	public WebDriver getDriver() {
		return driver.get();
	} 
	
	public void setDriver(WebDriver driverParam) {
		driver.set(driverParam);
	}
	
	public void closeBrowser() {
			driver.get().close();
		driver.remove();
	}
	
	
}
