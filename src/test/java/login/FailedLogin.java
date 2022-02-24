package login;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Bank_Pages.ErrorLoginPage;
import Bank_Pages.LoginPage;
import Project.ParaBank.BankBaseTests;

public class FailedLogin extends BankBaseTests 
{

	
	@Test
	public void testFailedLogin()
	{
		LoginPage loginpage = new LoginPage(driver);
		
		loginpage.SetUsername("test");
		loginpage.SetPassword("");
		ErrorLoginPage errpage = loginpage.ClickLoginButon();
		assertTrue(errpage.Geterrormessage().contains("Please enter a username and password."),"You Logged in Successfully");
	}
}
