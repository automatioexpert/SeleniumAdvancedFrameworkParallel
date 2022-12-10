package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;

	@FindBy(css = "input[name='login[email]']")
	private WebElement email;

	@FindBy(css = "input[name='login[password]']")
	private WebElement password;

	@FindBy(xpath = "//button[contains(text(),'Login')]")
	private WebElement loginBtn;

	// Initialize all the page objects for the given driver instance
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	// Action methods
	public void doLogin(String emailId, String pwd) {
		email.sendKeys(emailId);
		password.sendKeys(pwd);
		loginBtn.click();
	}

	
}
