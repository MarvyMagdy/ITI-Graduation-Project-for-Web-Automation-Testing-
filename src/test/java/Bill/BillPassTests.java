package Bill;


//import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Bank_Pages.BillPay;
import Bank_Pages.Home;
import Project.ParaBank.BankBaseTests;
import loan.LoanTests;

public class BillPassTests extends BankBaseTests
{
	
	@Test
	public void TestBillPass()
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
		
		String complete = bill.successText();
		System.out.println(complete);
		//assertEquals(complete,"Bill Payment Complete"); 
	}
}
