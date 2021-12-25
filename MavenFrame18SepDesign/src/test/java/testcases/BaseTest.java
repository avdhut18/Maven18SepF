package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import testpages.BaseClass;
import testpages.LoginPage;
import testpages.LogoutPage;

public class BaseTest extends BaseClass {


	@BeforeSuite
	public void initializeWebEnv() {
		WebDriverManager.chromedriver().setup();
		options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@BeforeClass
	public void allPgeObj(){
		login = new LoginPage(driver);
		logout = new LogoutPage(driver);
	}
	
	@AfterSuite
	public void tearDownEnv() {
		driver.quit();
	}
}
