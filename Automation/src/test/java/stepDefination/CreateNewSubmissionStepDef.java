package stepDefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.CreateNewSubmissionAction;

public class CreateNewSubmissionStepDef {
	
	CreateNewSubmissionAction CreateNewSubmission = new CreateNewSubmissionAction();
	
	

	    @And("^Click on MANAGE link under 'SUBMISSION' accordion$")
	    public void click_on_manage_link_under_submission_accordion() throws Throwable {
	    	
	    	CreateNewSubmission.clickonManageLink();
	    	
	    }

	    @And("^Click on ADD button$")
	    public void click_on_add_button() throws Throwable {

	    	CreateNewSubmission.clickonAddbtn();
	    	
	    }
	    

	    @And("^Enter submission deatils$")
	    public void enter_submission_deatils() throws Throwable {
	    	
	    	CreateNewSubmission.enterApplicationDesc();
	    	CreateNewSubmission.enterApplicationID();
	    	CreateNewSubmission.enterSequenceNumber();
	    	CreateNewSubmission.selectRegion();
	    	CreateNewSubmission.selectCountry();
	    	CreateNewSubmission.selectStatusDpDwn();
	    	CreateNewSubmission.selectProduct();
	    }
	    
	    @And("^Click on Submission SAVE button$")
	    public void click_on_submission_save_button() throws Throwable {
	    	
	    	CreateNewSubmission.clickonSubmissionSaveButton();
	    }

	    @And("^Search created submission$")
	    public void search_created_submission() throws Throwable {  
	    	
	    	CreateNewSubmission.searchCreatedSubmission();

        }
	    

	    @Then("^Verify the created submission on manage submission page$")
	    public void verify_the_created_submission_on_manage_submission_page() throws Throwable {
	    	
	    	CreateNewSubmission.verifySubmission();
	    }



}
