package New_Account;

import org.testng.annotations.Test;

import Bank_Pages.Home;
import Project.ParaBank.BankBaseTests;

public class OpenNewAccountTests extends BankBaseTests
{
	@Test
	public void openNewAccountTest()
	{
		Home homepage = new Home(driver);
		
		homepage.clickOpenNewAccount().AccountType("SAVINGS").clickOpenNewAccountBTN();
	}
}
