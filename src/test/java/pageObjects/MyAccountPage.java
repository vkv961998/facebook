package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//span[contains(text(),'Vardhan Vadrevu')]")
	WebElement myAccount;
	@FindBy(xpath="//span[normalize-space()='Log Out']")
	WebElement logout;
	@FindBy(xpath="//div[@class='x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z'][@xpath='1']")
	WebElement myProfile;
	public boolean isMyAccountPageExists()
	{
		try 
		{
			if(myAccount.isDisplayed()==true)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public void clickLogout()
	{
		logout.click();
	}
	public void myProfileClick()
	{
		myProfile.click();
	}
}
