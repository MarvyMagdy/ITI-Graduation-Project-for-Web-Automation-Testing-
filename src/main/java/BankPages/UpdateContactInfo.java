package Bank_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UpdateContactInfo 
{
	private WebDriver driver;
	private By FirstName = By.id("customer.firstName");
	private By LastName = By.id("customer.lastName");
	private By Address = By.id("customer.address.street");
	private By City = By.id("customer.address.city");
	private By State = By.id("customer.address.state");
	private By ZipCode = By.id("customer.address.zipCode");
	private By Phone = By.id("customer.phoneNumber");
	private By updateBTN = By.xpath("//*[@id=\"rightPanel\"]/div/div/form/table/tbody/tr[8]/td[2]/input");
	private By updated = By.xpath("//*[@id=\"rightPanel\"]/div/div/h1");
	
	public UpdateContactInfo(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void UpdateInfo(String fname)
	{
		driver.findElement(FirstName).sendKeys(fname);
		driver.findElement(LastName).sendKeys(fname);
		driver.findElement(Address).sendKeys("Cairo");
		driver.findElement(City).sendKeys("Cairo");
		driver.findElement(State).sendKeys("AA");
		driver.findElement(ZipCode).sendKeys("00000");
		driver.findElement(Phone).sendKeys("+20123654789");
	}
	
	public void clickUpdateBTN()
	{
		driver.findElement(updateBTN).click();
	}
	
	public String getUpdatedComplete()
	{
		return driver.findElement(updated).getText();
	}
}
