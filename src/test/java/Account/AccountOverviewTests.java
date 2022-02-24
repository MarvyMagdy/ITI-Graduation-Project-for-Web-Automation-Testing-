package Account;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Bank_Pages.AccountDetails;
import Bank_Pages.AccountsOverview;
import Bank_Pages.Home;
import Project.ParaBank.BankBaseTests;

public class AccountOverviewTests extends BankBaseTests
{
	
	@Test
	public void getTableRows()
	{
		Home homepage = new Home(driver);
		
		AccountsOverview accountsOverview = homepage.clickAccountsOverview();
		List<WebElement> rows = accountsOverview.getTableRows();
		assertNotEquals(rows, 0);
		AccountDetails accountDetails = accountsOverview.clickAccount();
		//assertEquals(accountDetails.GetAccountNum(), "14121");
		
		accountDetails.AcivityPeriod("All");
		accountDetails.ActivityType("All");
		accountDetails.ClickGo();
		boolean tableCase = accountDetails.DisplayedTable();
		assertEquals(tableCase, true);
		
		accountDetails.AcivityPeriod("May");
		accountDetails.ActivityType("All");
		accountDetails.ClickGo();
		boolean nocase = accountDetails.DisplyedNoTransaction();
		assertEquals(nocase, true);
	}
}
