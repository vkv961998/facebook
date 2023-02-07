package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountLogin;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_001_LoginTest extends BaseClass{
	
	@Test
	void test_Login()
	{
		logger.debug("application logs");
		logger.info("*** Starting TC_001_LoginTest ***");
		try 
		{	
			AccountLogin acclogin=new AccountLogin(driver);
			acclogin.setEmail(rb.getString("email"));
			logger.info("Entered email");
			acclogin.setPassword(rb.getString("password"));
			logger.info("Entered password");
			acclogin.clickLogin();
			logger.info("Clicked on login");
			/*WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement icon=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Vardhan Vadrevu')]")));
			boolean displayed=icon.isDisplayed();*/
			MyAccountPage account=new MyAccountPage(driver);
			boolean displayed=account.isMyAccountPageExists();
			logger.info("Validating expected message");
			Assert.assertEquals(displayed, true);
		}
		catch(Exception e)
		{
			logger.info("Test failed");
			Assert.fail();
		}
		logger.info("Finished this login test");
	}
}
