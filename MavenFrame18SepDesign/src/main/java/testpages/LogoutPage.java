package testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends BaseClass {

	WebDriver driver;
	
	@FindBy(id="welcome")
	private WebElement btnDropDown;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	private WebElement logout;
	
	public LogoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logoutApp() throws InterruptedException {
		btnDropDown.click();
		waitFor(30);
		Thread.sleep(5000);
		logout.click();
	}
}
