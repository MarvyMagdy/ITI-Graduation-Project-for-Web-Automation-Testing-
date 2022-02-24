package Update_Account;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Bank_Pages.Home;
import Bank_Pages.UpdateContactInfo;
import Project.ParaBank.BankBaseTests;

public class UPdateAccountTests extends BankBaseTests
{
	@Test
	public void updateAccountFNameTest()
	{
		Home homepage = new Home(driver);
		
		UpdateContactInfo updateContactInfo = homepage.clickUpdateContactInfo();
		
		updateContactInfo.UpdateInfo("Marvy");
		updateContactInfo.clickUpdateBTN();
		
		assertEquals(updateContactInfo.getUpdatedComplete(), "Update Profile");
	}
}
