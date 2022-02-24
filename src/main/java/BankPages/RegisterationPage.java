package Bank_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterationPage {
	private WebDriver driver;
	private By Firstname = By.id("customer.firstName");
	private By Lastname = By.id("customer.lastName");
	private By Address = By.id("customer.address.street");
	private By City = By.id("customer.address.city");
	private By State = By.id("customer.address.state");
	private By Zip = By.id("customer.address.zipCode");
	private By Phone = By.id("customer.phoneNumber");
	private By Ssn = By.id("customer.ssn");
	private By Username = By.id("customer.username");
	private By Pass = By.id("customer.password");
	private By Confpass = By.id("repeatedPassword");
	private By Registerbutton = By.cssSelector("#customerForm input.button");
	
	
	
	public RegisterationPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void SetRegisterationData(String firstname , String lastname , String address , String city , String state
			,String zip , String phone , String ssn , String username , String pass , String confpass)
		
		{
			driver.findElement(Firstname).sendKeys(firstname);
			driver.findElement(Lastname).sendKeys(lastname);
			driver.findElement(Address).sendKeys(address);
			driver.findElement(City).sendKeys(city);
			driver.findElement(State).sendKeys(state);
			driver.findElement(Zip).sendKeys(zip);
			driver.findElement(Phone).sendKeys(phone);
			driver.findElement(Ssn).sendKeys(ssn);
			driver.findElement(Username).sendKeys(username);
			driver.findElement(Pass).sendKeys(pass);
			driver.findElement(Confpass).sendKeys(confpass);
		}
	
	
	public RegisterationCompletionPage ClickRegisterButton()
	{
		driver.findElement(Registerbutton).click();
		return new RegisterationCompletionPage(driver);
	}
		
}
