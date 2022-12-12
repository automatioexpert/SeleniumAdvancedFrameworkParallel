package base;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

public class ExtentFactory {
	private ExtentFactory() {

	}

	private static ExtentFactory instance = new ExtentFactory();
	ThreadLocal<ExtentTest> extent = new ThreadLocal<>();

	public static ExtentFactory getInstance() {
		return instance;
	}

	public ExtentTest getExtent() {
		return extent.get();
	}

	public void setExtent(ExtentTest extentTest) {
		extent.set(extentTest);
	}

	public void removeExtentObject() {
		extent.remove();
		
	}
}
