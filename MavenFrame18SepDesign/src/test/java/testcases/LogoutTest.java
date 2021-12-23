package testcases;

import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {

	@Test
	public void verifyLogout() throws InterruptedException {
		logout.logoutApp();
	}
}
