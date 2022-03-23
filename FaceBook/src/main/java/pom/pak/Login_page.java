package pom.pak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	@FindBy (xpath ="//input[@id='email']")
	private WebElement email ;

	@FindBy (xpath ="//input[@id='pass']")
	private WebElement password ;

	@FindBy (xpath ="//button[@name='login']")
	private WebElement LoginButton ;
	
	public Login_page (WebDriver driver)
	{
		PageFactory.initElements (driver, this);
	}
	
	
	public void Enteremail ()
	{
       email.sendKeys("8805005136");
	}
	
	public void Enterpassword ()
	{
		password.sendKeys("satyam28944");
	}

	public void ClikonLoginButton ()
	{
	LoginButton.click();
	}

}
