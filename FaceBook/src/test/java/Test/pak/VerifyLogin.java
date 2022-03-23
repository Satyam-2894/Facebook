package Test.pak;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.pak.pojo;
import pom.pak.Home_page;
import pom.pak.Login_page;

public class VerifyLogin extends pojo {
	WebDriver driver;
	Login_page loginpage ;
	Home_page header;

	@BeforeTest()
	@Parameters("browser")
	public void Lauchbrowser(String browser) {

		if(browser.equals("Chrome"))
		{
			driver= openChromeBrowser();
		}
		if(browser.equals("Firefox"))
		{
			driver= openFirefoxBrowser();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@BeforeClass()
	public void beforeclass() {
		loginpage = new Login_page (driver);
		header = new Home_page (driver);
		driver.get("http://www.facebook.com/");
	}

	@BeforeMethod ()
	public void beforemethod() {
		loginpage.Enteremail();
		loginpage.Enterpassword();
		loginpage.ClikonLoginButton();

	}
	@Test()
	public void test() {
		header.clickongroup();
		System.out.println("gropClicked");
	}

	@Test()
	public void testA() {
		header.clickonnotification();
		System.out.println("notificationClicked");
	}

	@AfterMethod()
	public void aftermethod (){
		header.clickonaccount();
		System.out.println("accclicked");
		header.clickonlogout();
		System.out.println("logoutClicked");

	}
	@AfterClass()
	public void afterclass (){
		loginpage=null;
		header=null;
	}

	@AfterTest()
	public void aftertest() {
		driver.quit();
		System.gc();
	}

}

