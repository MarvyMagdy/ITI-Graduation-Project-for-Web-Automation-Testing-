package loan;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.testng.annotations.Test;

import Bank_Pages.Home;
import Bank_Pages.LoanCompletionPage;
import Bank_Pages.RequesLoanPage;
import Project.ParaBank.BankBaseTests;


public class LoanTests extends BankBaseTests
{
	public static String acc;
	@Test
	public void RequestLoanSuccessfully() 
	{
		Home homepage = new Home(driver);
		
		RequesLoanPage requestloan = homepage.ClickRequestloanLink();
		//requestloan.SelectFromDropdown("15675");
		requestloan.SetAmount("7");
		requestloan.SetDownPayment("1");
		LoanCompletionPage loancompletion = requestloan.ClickApplyButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3, 1));
		acc = loancompletion.AccountNumber();
		assertTrue(loancompletion.GetConfirmationmsg().contains("Approved"),"Failed to Request Loan");
		
		
		
	}

}
