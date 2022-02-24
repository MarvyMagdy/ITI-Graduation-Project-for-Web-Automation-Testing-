package Bank_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferCompletePage {
	private WebDriver driver;
//	private By transferComplete = By.cssSelector(".ng-scope h1");
	private By transferComplete = By.cssSelector("h1.title");

	
	public TransferCompletePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String GetCompletionMsg()
	{
		return driver.findElement(transferComplete).getText();
	}
}
