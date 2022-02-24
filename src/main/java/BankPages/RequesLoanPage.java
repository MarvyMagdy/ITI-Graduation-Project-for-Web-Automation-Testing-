package Bank_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RequesLoanPage {
	private WebDriver driver;
	private By loanAmount = By.id("amount");
	private By downpayment = By.id("downPayment");
	private By fromAccount = By.id("fromAccountId");
	private By Applybutton = By.cssSelector("input.button");
	
	
	
	public RequesLoanPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void SetAmount(String amount)
	{
		driver.findElement(loanAmount).sendKeys(amount);
	}

	public void SetDownPayment(String amount)
	{
		driver.findElement(downpayment).sendKeys(amount);
	}
	
	public Select FindDropdownElement(By object)
	{
		return new Select(driver.findElement(object));
	}
	
	public void SelectFromDropdown(String option)
	{
		 FindDropdownElement(fromAccount).selectByVisibleText(option);
	}
	public LoanCompletionPage ClickApplyButton()
	{
		driver.findElement(Applybutton).click();
		return new LoanCompletionPage(driver);
	}
	
}
