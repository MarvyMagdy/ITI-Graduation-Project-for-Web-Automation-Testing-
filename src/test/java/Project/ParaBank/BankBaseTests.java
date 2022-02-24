package Project.ParaBank;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;

import Bank_Pages.Home;
import Bank_Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BankBaseTests 
{
	public static  WebDriver driver;
	protected Home homepage;
	public LoginPage loginpage;
	
	public String user = "islam16";
    public String pass = "123456";
	
	@BeforeSuite
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//div[@class='login']/input[@name='username']")).sendKeys("islam13");
//		driver.findElement(By.xpath("//div[@class='login']/input[@name='password']")).sendKeys("123456");
//		driver.findElement(By.xpath("//div[@class='login']/input[@type='submit']")).click();
		
		//homepage = new Home(driver);
	}
	
	
	@AfterClass
	public void tearDown() 
	{
		//driver.quit();
	}
	
	
}
