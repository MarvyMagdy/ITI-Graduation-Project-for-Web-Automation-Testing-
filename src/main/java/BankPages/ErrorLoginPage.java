package Bank_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ErrorLoginPage {
	
	private WebDriver driver;
	protected By errormsg = By.cssSelector("p.error");
	
	public ErrorLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String Geterrormessage()
	{
		return driver.findElement(errormsg).getText();
	}

}
