package Bank_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenNewAccount 
{
	private WebDriver driver;
	private By accountType = By.id("type");
	private By openBTN = By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div/input");
	
	public OpenNewAccount(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public OpenNewAccount AccountType(String option)
	{
		findDropDownElement().selectByVisibleText(option);
		return this;
	}
	
	private Select findDropDownElement()
	{
		return new Select(driver.findElement(accountType));
	}
	
	public void clickOpenNewAccountBTN()
	{
		driver.findElement(openBTN).click();
	}
}
