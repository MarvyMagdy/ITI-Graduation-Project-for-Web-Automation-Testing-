package Bank_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	private By usernamefield = By.cssSelector("div.login [name|='username']");
	private By passwordfield = By.cssSelector("div.login [name|='password']");
	private By loginbutton = By.cssSelector("input.button");
	
	public LoginPage(WebDriver driver)
		{
			this.driver=driver;
		}
	
	public void SetUsername(String username)
	{
		driver.findElement(usernamefield).sendKeys(username);
	}
	
	public void SetPassword(String password)
	{
		driver.findElement(passwordfield).sendKeys(password);
	}
	public Home ClickLoginButton()
	{
		driver.findElement(loginbutton).click();
		return new Home(driver);
	}
	
	public ErrorLoginPage ClickLoginButon()
	{
		driver.findElement(loginbutton).click();
		return new ErrorLoginPage(driver);
	}
	public void clicklink(String linkText)
	{
		driver.findElement(By.linkText(linkText)).click();
	}
	public RegisterationPage ClickRegisterButton()
	{
		clicklink("Register");
		return new RegisterationPage(driver);
		
	}
}
