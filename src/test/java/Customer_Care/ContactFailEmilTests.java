package Customer_Care;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Bank_Pages.Contact;
import Bank_Pages.Home;
import Project.ParaBank.BankBaseTests;

public class ContactFailEmilTests extends BankBaseTests
{
	
	@Test
	public void contactFailEmail()
	{
		Home homepage = new Home(driver);
		
		Contact contact = homepage.clickContactImg();
		
		contact.FillName("Marvy");
		contact.FillPhone("+021546973");
		contact.FillMessage("Thank You");
		contact.ClickSend();
		
		assertEquals(contact.getErrorText(), "Email is required.");
	}
}
