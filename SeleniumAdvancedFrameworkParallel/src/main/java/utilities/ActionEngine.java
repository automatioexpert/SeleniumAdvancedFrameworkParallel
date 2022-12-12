package utilities;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import base.ExtentFactory;
import io.netty.handler.codec.http.HttpContentEncoder.Result;

public class ActionEngine {
	/*
	 * sendKeys() click() select class Mouse hover
	 * 
	 */

	public void sendkeys_custom(WebElement element, String valueToBeSent) {

		try {
			element.sendKeys(valueToBeSent); // log success msg in extent report
			ExtentFactory.getInstance().getExtent().log(Status.PASS, "value entered is: " + valueToBeSent);
		} catch (Exception e) {
			// log failure in extent report
			ExtentFactory.getInstance().getExtent().log(Status.FAIL,
					"value entered failed due to Exception: " + e.getMessage());
		}

	}

	public void click_custom(WebElement element) {

		try {
			element.click(); // log success msg in extent report
			ExtentFactory.getInstance().getExtent().log(Status.PASS, "value clicked");
		} catch (Exception e) {
			// log failure in extent report
			ExtentFactory.getInstance().getExtent().log(Status.FAIL, "value click failed" + e.getMessage());
		}

	}
	
	

}
