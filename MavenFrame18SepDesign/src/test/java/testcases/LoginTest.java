package testcases;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test
	public void verifyLoginWithCorrectCred() {
		login.loginApp();
	}
}
