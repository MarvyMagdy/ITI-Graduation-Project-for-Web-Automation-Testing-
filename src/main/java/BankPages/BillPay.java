package Bank_Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BillPay 
{
	private WebDriver driver;
	private By payeeName = By.xpath("//table[@class='form2'] // input[@name='payee.name']");
	private By address = By.xpath("//table[@class='form2'] // input[@name='payee.address.street']");
	private By city = By.xpath("//table[@class='form2'] // input[@name='payee.address.city']");
	private By state = By.xpath("//table[@class='form2'] // input[@name='payee.address.state']");
	private By zipCode = By.xpath("//table[@class='form2'] // input[@name='payee.address.zipCode']");
	private By phone = By.xpath("//table[@class='form2'] // input[@name='payee.phoneNumber']");
	private By accountNumber = By.xpath("//table[@class='form2'] // input[@name='payee.accountNumber']");
	private By verifyAccount = By.xpath("//table[@class='form2'] // input[@name='verifyAccount']");
	private By amount = By.xpath("//table[@class='form2'] // input[@name='amount']");
	private By fromAccount = By.xpath("//table[@class='form2'] // select[@name='fromAccountId']");
	private By sendPaymentBtN = By.xpath("//table[@class='form2'] // input[@value='Send Payment']");
	private By succ = By.xpath("//div[@ng-show='showResult']/h1[@class='title']");
	private By errorName = By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[1]/td[3]/span");
	private By errorVerify = By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[9]/td[3]/span[3]");
	
	public BillPay(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public void setName(String PayeeName)
	{
		driver.findElement(payeeName).sendKeys(PayeeName);
	}
	public void setAddress(String Address)
	{
		driver.findElement(address).sendKeys(Address);
	}
	public void setCity(String City)
	{
		driver.findElement(city).sendKeys(City);
	}
	public void setState(String State)
	{
		driver.findElement(state).sendKeys(State);
	}
	public void setZipCode(String ZipCode)
	{
		driver.findElement(zipCode).sendKeys(ZipCode);
	}
	public void setPhone(String Phone)
	{
		driver.findElement(phone).sendKeys(Phone);
	}
	public void setAccountNum(String AccountNum)
	{
		driver.findElement(accountNumber).sendKeys(AccountNum);
	}
	public void setVerifyAccountNum(String AccountNum)
	{
		driver.findElement(verifyAccount).sendKeys(AccountNum);
	}
	public void setAmount(String Amount)
	{
		driver.findElement(amount).sendKeys(Amount);
	}
	public void setFromAccount(String FromAccount)
	{
		findDropDownElement().selectByVisibleText(FromAccount);
	}
	
	private Select findDropDownElement()
	{
		return new Select(driver.findElement(fromAccount));
	}
	
	public void ClickSendBTN()
	{
		driver.findElement(sendPaymentBtN).click();
	}
	
	
	public String successText()
	{
		 return driver.findElement(succ).getText();
	}
	
	public String getRequiredNameText()
	{
		return driver.findElement(errorName).getText();
	}
	
	public String getRequiredVerifyText()
	{
		return driver.findElement(errorVerify).getText();
	}
}


