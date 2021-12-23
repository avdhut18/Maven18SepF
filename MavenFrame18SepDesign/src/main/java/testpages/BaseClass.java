package testpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	protected WebDriverWait waiting;
	public static WebDriver driver;
	protected ChromeOptions options;
	protected LoginPage login;
	protected LogoutPage logout;
	
	public void waitFor(int seconds) {
		waiting = new WebDriverWait(driver,50);
		waiting.withTimeout(seconds, TimeUnit.SECONDS);
	}
}
