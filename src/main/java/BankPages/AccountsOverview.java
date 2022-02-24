package Bank_Pages;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AccountsOverview 
{
	private WebDriver driver;
	
	public AccountsOverview(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public List<WebElement> getTableRows()
	{		
		List<WebElement> rows = driver.findElements(By.cssSelector("#accountTable tr"));
		return rows;
	}
	
	public AccountDetails clickAccount()
	{
		By acc = By.xpath("//*[@id=\"accountTable\"]/tbody/tr[1]/td[1]/a");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5, 1));
		driver.findElement(acc).click();
		return new AccountDetails(driver);
	}
}
