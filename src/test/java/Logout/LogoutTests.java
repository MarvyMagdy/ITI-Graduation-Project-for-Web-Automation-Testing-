package Logout;

import org.testng.annotations.Test;

import Bank_Pages.Home;
import Project.ParaBank.BankBaseTests;

public class LogoutTests extends BankBaseTests
{
	@Test
	public void logoutCheck()
	{
		Home homepage = new Home(driver);
		
		homepage.clickLogout();
	}
}
