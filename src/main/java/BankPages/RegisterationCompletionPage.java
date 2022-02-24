package Bank_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterationCompletionPage {
	private WebDriver driver;
	private By welcomemsg = By.cssSelector("#rightPanel h1");
	
	public RegisterationCompletionPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String GetWelcomeMsg()
	{
		return driver.findElement(welcomemsg).getText();
	}

}
