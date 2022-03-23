//package pom.pak;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class Create_Account {
//	
//	@FindBy (xpath ="//input[@name='firstname']")         
//	private WebElement firstname ;
//
//	@FindBy (xpath ="//input[@name='lastname']")
//	private WebElement lastname ;
//
//	@FindBy (xpath ="//input[@name='reg_email__']")
//	private WebElement mail ;
//
//	@FindBy (xpath ="//input[@name='reg_passwd__']")
//	private WebElement password ;
//
//	@FindBy (xpath ="//select[@title='Day']")
//	private WebElement day ;
//
//	@FindBy (xpath ="//select[@title='Month']")
//	private WebElement month  ;
//	
//	@FindBy (xpath ="//select[@title='Year']")
//	private WebElement year ;
//	
//	@FindBy (xpath ="(//span[@class='_5k_2 _5dba'])[2]")
//	private WebElement gender ;
//	
//	@FindBy (xpath ="(//button[@type='submit'])[2]")
//	private WebElement signup ;
//	
//	
//	public Create_Account (WebDriver driver)
//	{
//		PageFactory.initElements (driver, this);
//	}
//
//	
//	public void ClickonFirstname ()
//	{
//		firstname.sendKeys("satyam");
//	}
//
//	public void ClickonLastname ()
//	{
//		lastname.sendKeys("kute");
//	}
//
//	public void ClickonMail ()
//	{
//		mail.sendKeys("8805005136");
//	}
//
//	public void ClickonPassword ()
//	{
//		password.sendKeys("satyam28944");
//	}
//
//	public void ClickonDay ()
//	{
//		day.sendKeys("2");
//	}
//
//	public void ClickonMonth ()
//	{
//		month.sendKeys("8");
//	}
//
//	public void ClickonYear ()
//	{
//		year.sendKeys("1994");
//	}
//	public void ClickonGender ()
//	{
//		gender.click();
//	}
//	public void clickonsignup ()
//	{
//		signup.click();
//	}
//}
