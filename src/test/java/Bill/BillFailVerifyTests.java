package Bill;

//import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Bank_Pages.BillPay;
import Bank_Pages.Home;
import Project.ParaBank.BankBaseTests;
import loan.LoanTests;

public class BillFailVerifyTests extends BankBaseTests
{
	
	@Test
	public void TestBillFailVerify()
	{
		Home homepage = new Home(driver);
		
		BillPay bill = homepage.clickPayBill();
		
		bill.setName("marvy");
		bill.setAddress("USA");
		bill.setCity("Florida");
		bill.setState("Florida");
		bill.setZipCode("00000");
		bill.setPhone("+021546973");
		bill.setAccountNum("14010");
		bill.setVerifyAccountNum("14010");
		bill.setAmount("7");
		bill.setFromAccount(LoanTests.acc);
		bill.ClickSendBTN();
		
		//assertEquals(bill.getRequiredNameText(), "The account numbers do not match.");
	}
}
