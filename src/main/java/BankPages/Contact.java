package Bank_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Contact 
{
	private WebDriver driver;
	private By name = By.id("name");
	private By email = By.id("email");
	private By phone = By.id("phone");
	private By message = By.id("message");
	private By sendBTN = By.xpath("//table [@class='form2']  // input [@value='Send to Customer Care']");
	private By careSuccess = By.xpath("//*[@id=\"rightPanel\"]/p[2]");
	private By errorEmail = By.id("email.errors");
	
	public Contact(WebDriver driver)
	{
		this.driver = driver;
	}
	
	/*public void FillContact(String Name, String Email, String Phone, String Message)
	{
		driver.findElement(name).sendKeys(Name);
		driver.findElement(email).sendKeys(Email);
		driver.findElement(phone).sendKeys(Phone);
		driver.findElement(message).sendKeys(Message);
	}*/
	
	public void FillName(String Name)
	{
		driver.findElement(name).sendKeys(Name);
	}
	public void FillEmail(String Email)
	{
		driver.findElement(email).sendKeys(Email);
	}
	public void FillPhone(String Phone)
	{
		driver.findElement(phone).sendKeys(Phone);
	}
	public void FillMessage(String Message)
	{
		driver.findElement(message).sendKeys(Message);
	}
	
	public void ClickSend()
	{
		driver.findElement(sendBTN).click();
	}
	
	public String getCareFinish()
	{
		return driver.findElement(careSuccess).getText();
	}
	
	public String getErrorText()
	{
		return driver.findElement(errorEmail).getText();
	}
}
