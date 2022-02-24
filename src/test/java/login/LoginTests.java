package login;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import Bank_Pages.Home;
import Bank_Pages.LoginPage;
import Project.ParaBank.BankBaseTests;


public class LoginTests extends BankBaseTests 
{
	
	@Test
	public void Successfullogin()
	{
		LoginPage loginpage = new LoginPage(driver);
		Home homepage = new Home(driver);
		
		loginpage.SetUsername(user);
		loginpage.SetPassword(pass);
		homepage = loginpage.ClickLoginButton();
		assertTrue(homepage.checkWelcomeMessage().contains("Welcome"),"Failed to login with that user");
		
		
	}
	
	
	

}
