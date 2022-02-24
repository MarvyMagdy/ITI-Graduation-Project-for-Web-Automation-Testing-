package Bank_Pages;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoanCompletionPage {
	private WebDriver driver;
	private By confirmationmsg = By.id("loanStatus");
	String NewAccountnumber ;
	
	public LoanCompletionPage(WebDriver driver)
		{
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50, 1));
			//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			this.driver=driver;
		}
	
	public String GetConfirmationmsg()
	{
		return driver.findElement(confirmationmsg).getText();
	}
	
	public By Account()
	{
		return By.id("newAccountId");
	}
	
	public String AccountNumber()
	{
		return driver.findElement(Account()).getText();
	}
	
}
