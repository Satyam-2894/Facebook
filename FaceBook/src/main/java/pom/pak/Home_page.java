package pom.pak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {

//	@FindBy (xpath ="(//div[@class='bp9cbjyn j83agx80 byvelhso l9j0dhe7'])[1]")         
//	private WebElement Home ;

	@FindBy (xpath ="(//span[@class='l9j0dhe7'])[2]")
	private WebElement group  ;

	@FindBy (xpath ="(//div[@role='button'])[5]")
	private WebElement messenger ;

	@FindBy (xpath ="(//div[@class='rq0escxv l9j0dhe7 du4w35lb'])[2]")
	private WebElement notification ;

	@FindBy (xpath ="//div[@aria-label='Account']")
	private WebElement account ;
	
	@FindBy (xpath ="(//div[@data-visualcompletion='ignore-dynamic'])[6]")
	private WebElement logout ;

	public Home_page (WebDriver driver)
	{
		PageFactory.initElements (driver, this);
	}

	
//	public void clickonhome ()
//	{
//		Home.click();
//	}

	public void clickongroup ()
	{
		group.click();
	}

	
	public void clickonmessenger ()
	{
		messenger.click();
	}

	public void clickonnotification ()
	{
		notification.click();
	}
	public void clickonaccount() {
		account.click();
		
	}

	public void clickonlogout ()
	{
		logout.click();
	}

   
}
