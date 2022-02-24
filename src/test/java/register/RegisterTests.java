package register;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Bank_Pages.LoginPage;
import Bank_Pages.RegisterationCompletionPage;
import Bank_Pages.RegisterationPage;
import Project.ParaBank.BankBaseTests;

public class RegisterTests extends BankBaseTests 
{
	
	
	
	@Test
	public void RegisterSuccessfully()
	{
		LoginPage loginpage = new LoginPage(driver);
		
		RegisterationPage registeratiopagePage = loginpage.ClickRegisterButton();
		registeratiopagePage.SetRegisterationData("AA", "AA", "AA", "AA", "AA", "AA", "AA", "AA", user, pass, pass);
		RegisterationCompletionPage registerComplete = registeratiopagePage.ClickRegisterButton();
		assertTrue(registerComplete.GetWelcomeMsg().contains("Welcome"),"Failed To register");
		
	}

}
