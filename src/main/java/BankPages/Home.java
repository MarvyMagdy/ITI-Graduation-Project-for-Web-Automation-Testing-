package Bank_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Home 
{
	private WebDriver driver;
	private By contact = By.xpath("//ul[@class='button'] // li[@class='contact'] // a[@href='contact.htm']");
	private By welcomMessage = By.cssSelector("p.smallText");
	
	public Home(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public AccountsOverview clickAccountsOverview()
	{
		clickLink("Accounts Overview");
		return new AccountsOverview(driver);
	}
	
	public BillPay clickPayBill()
	{
		clickLink("Bill Pay");
		return new BillPay(driver);
	}
	
	public Contact clickContactImg()
	{
		driver.findElement(contact).click();
		return new Contact(driver);
	}
	
	public RequesLoanPage ClickRequestloanLink()
	{
		clickLink("Request Loan");
		return new RequesLoanPage(driver);
	}
	
	public TransferFundsPage ClickTransferfundsLink()
	{
		clickLink("Transfer Funds");
		return new TransferFundsPage(driver);
		
	}
	
	public String checkWelcomeMessage()
	{
		return driver.findElement(welcomMessage).getText();
		
	}
	
	public void clickLogout()
	{
		clickLink("Log Out");
	}
	
	public OpenNewAccount clickOpenNewAccount()
	{
		clickLink("Open New Account");
		return new OpenNewAccount(driver);
	}
	
	public UpdateContactInfo clickUpdateContactInfo()
	{
		clickLink("Update Contact Info");
		return new UpdateContactInfo(driver);
	}
	
	private void clickLink(String linktext) 
	{
		driver.findElement(By.linkText(linktext)).click();
	}
}
