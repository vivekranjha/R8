package pageObject;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import testInitiator.Base;

public class LoginPageAction extends Base {

	public static By UserName = By.id("username");
	public static By PassWord = By.id("password");
	public static By SubmitBtn = By.xpath("//*[@type='submit']");

	public LoginPageAction() {

	}
	
	public void launchURL()  throws FileNotFoundException {
		
		 driver.get(getURL());
		 Sync();
		 SleepWait(1);
		 	
	}
	
	public void verifyLoginPage(){
		
		Assert.assertEquals("https://qa.lscp-env.dxc.technology/login", getPageURL());
		System.out.println("User is on LSCP Login Page");
	}
	
	public void loginToLscpApplication(String username, String password) {
		
		waitForElementToBeVisibile(UserName).clear();
		waitForElementToBeVisibile(UserName).sendKeys(username);
		SleepWait(1);
		waitForElementToBeVisibile(PassWord).clear();
		waitForElementToBeVisibile(PassWord).sendKeys(password);
		SleepWait(2);
		waitForElementToBeVisibile(SubmitBtn).click();
		Sync();
		Sync();
		SleepWait(2);

	}

	public void verifyHomePage() {
	
	    
		Assert.assertEquals(driver.getCurrentUrl(), "https://qa.lscp-env.dxc.technology/home/dashboard");
		System.out.println("User is on LSCP Home Page");
		SleepWait(2);


	}

}
