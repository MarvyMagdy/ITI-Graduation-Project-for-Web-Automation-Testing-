package Bank_Pages;
import java.time.Duration;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TransferFundsPage {
	private WebDriver driver;
	private By amountfield = By.id("amount");
	private By Dropdownsendacc = By.id("fromAccountId");
	private By Dropdownreciveacc = By.id("toAccountId");
	private By transferbutton = By.cssSelector("#rightPanel input.button");

	
	public TransferFundsPage(WebDriver driver)
		{
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50, 1));
			//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			this.driver=driver;
		}
	
	public void SetAmount(String amount)
	{
		driver.findElement(amountfield).sendKeys(amount);
	}
	public Select FindDropdownElement(By object)
	{
		return new Select(driver.findElement(object));
	}
	public void SelectFromDropdownSender( int index)
	{
		 FindDropdownElement(Dropdownsendacc).selectByIndex(index);
	}
	public void SelectFromDropdownReciever( int index)
	{
		 FindDropdownElement(Dropdownreciveacc).selectByIndex(index);
	}
	public void SelectFromDropdownrecieve(String option)
	{
		 FindDropdownElement(Dropdownreciveacc).selectByVisibleText(option);
	}
	public void SelectFromDropdownsend(String option)
	{
		 FindDropdownElement(Dropdownsendacc).selectByVisibleText(option);
	}
	public TransferCompletePage ClickTransferButton()
	{
		driver.findElement(transferbutton).click();
		return new TransferCompletePage(driver);
		
		
	}
	

}
