package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import utilities.PropertiesOperations;

public class ExtentSetup {

	public static ExtentReports extent;

	public static ExtentReports setUpExtentReport() {
		ExtentSparkReporter spark = new ExtentSparkReporter("./extent.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setTheme(Theme.DARK);
		spark.config().setReportName("Automation Execution Report");

		extent.setSystemInfo("Executed on Environment", PropertiesOperations.getPropertyValue("url"));
		extent.setSystemInfo("Executed on Browser", PropertiesOperations.getPropertyValue("browser"));
		extent.setSystemInfo("Executed on OS", System.getProperty("os.name"));
		extent.setSystemInfo("Executed on User", System.getProperty("user.name"));

		return extent;

	}

}
