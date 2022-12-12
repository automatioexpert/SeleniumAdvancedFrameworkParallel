package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.DriverFactory;
import base.TestBase;

public class LoginPage extends TestBase{

	private WebDriver driver;

	/*
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
	
	@FindBy(css = "input[name='login[email]']")
	private WebElement email;

	@FindBy(css = "input[name='login[password]']")
	private WebElement password;

	@FindBy(xpath = "//button[contains(text(),'Login')]")
	private WebElement loginBtn; */
	

	//Elements
	
	By email=By.cssSelector("input[name='login[email]']");
	By password=By.cssSelector("input[name='login[password]']");
	By loginBtn=By.xpath("//button[contains(text(),'Login')]");
	
	
	// Action methods
	public void doLogin(String emailId, String pwd) {
	sendkeys_custom(DriverFactory.getInstance().getDriver().findElement(email), emailId);
	sendkeys_custom(DriverFactory.getInstance().getDriver().findElement(password),pwd);
	click_custom(DriverFactory.getInstance().getDriver().findElement(loginBtn));
	
		
		
	}

	
}
