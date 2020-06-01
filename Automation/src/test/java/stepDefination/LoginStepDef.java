package stepDefination;



import java.io.IOException;


import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObject.LoginPageAction;
import testInitiator.Base;


public class LoginStepDef  {
	
	     LoginPageAction loginPage = new LoginPageAction();
	     
	     @Given("^User should be on LSCP login page$")
	     public void user_should_be_on_lscp_login_page() throws Throwable {
	    	 
	    	 loginPage.launchURL();
	    	 
	     } 

	     @Then("^Verify the title of LSCP login page$")
	     public void verify_the_title_of_lscp_login_page() throws Throwable {
	    	 
	    	 loginPage.verifyLoginPage();
	     }
	     
	     @When("^User should enter (.+) and (.+) and login$")
	     public void user_should_enter_and_and_login(String username, String password) throws Throwable {
	    	 
	    	 loginPage.loginToLscpApplication(username, password);
	     }

	     @Then("^Verify user should be on LSCP Home Page$")
	     public void verify_user_should_be_on_lscp_home_page() throws Throwable {
	    	 
	    	 loginPage.verifyHomePage();
	     }
}
