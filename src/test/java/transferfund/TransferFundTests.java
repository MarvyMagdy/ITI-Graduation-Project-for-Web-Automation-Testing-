package transferfund;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import Bank_Pages.Home;
import Bank_Pages.TransferCompletePage;
import Bank_Pages.TransferFundsPage;
import Project.ParaBank.BankBaseTests;
import loan.LoanTests;


public class TransferFundTests extends BankBaseTests 
{
	
	@Test
	public void TransferfundSuccessfully()
	{
		Home homepage = new Home(driver);
		
		TransferFundsPage transferpage = homepage.ClickTransferfundsLink();
	
		transferpage.SelectFromDropdownrecieve(LoanTests.acc);
		transferpage.SetAmount("9");
		TransferCompletePage transfercompletion = transferpage.ClickTransferButton();
		assertTrue(transfercompletion.GetCompletionMsg().contains("Transfer"),"Transfer Failed !!");
	}
	
}
