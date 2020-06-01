package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.CompletingWorkFlowTaskAction;

public class CompletingWorkFlowTaskStepDef {
	
                
	   CompletingWorkFlowTaskAction CompletingWorkFlowTask = new CompletingWorkFlowTaskAction();
	
	   @Given("^User should be able to logut the applicaton$")
	    public void user_should_be_able_to_logut_the_applicaton() throws Throwable {
		   
		   CompletingWorkFlowTask.Logout();
		   
	    }
	      
	   @When("^Login with Approver$")
	    public void login_with_approver() throws Throwable {
		   
		   CompletingWorkFlowTask.ApproverLogin();
		   
	    }

	    @When("^Click on WORKFLOW link present on left side bar$")
	    public void click_on_workflow_link_present_on_left_side_bar() throws Throwable {
	    	
	    	CompletingWorkFlowTask.WorkflowLink();
	    }

	    @Then("^Select the checkbox against the 'For Approval' option under AWAITING ACTION accordion$")
	    public void select_the_checkbox_against_the_for_approval_option_under_awaiting_action_accordion() throws Throwable {
	    	
	    	CompletingWorkFlowTask.forApprovalChkbx();
	    }

	    @Then("^Select the document to finish task$")
	    public void select_the_document_to_finish_task() throws Throwable {
	    	
	    	CompletingWorkFlowTask.SelectDocument();
	    }

	    @Then("^Click on 'Finish Task' option$")
	    public void click_on_finish_task_option() throws Throwable {
	    	
	    	CompletingWorkFlowTask.FinishTask();
	    }

	    @Then("^Select the outcome as Approved$")
	    public void select_the_outcome_as_approved() throws Throwable {
	    	
	    	CompletingWorkFlowTask.selectOutcome();
	    }

	    @Then("^Select Meaning$")
	    public void select_meaning() throws Throwable {
	    	
	    	CompletingWorkFlowTask.selectMeaning();
	    }

	    @Then("^Fill the password in the e-signature field$")
	    public void fill_the_password_in_the_esignature_field() throws Throwable {
	    	
	    	CompletingWorkFlowTask.eSignaturePassword();
	    }

	    @Then("^Click on FINISH button to approved document$")
	    public void click_on_finish_button_to_approved_document() throws Throwable {
	    	
	    	CompletingWorkFlowTask.WorkflowFinishBtn();
	    }

	    @Then("^Search the document approved$")
	    public void search_the_document_approved() throws Throwable {
	    	
	    	CompletingWorkFlowTask.SearchDocument();
	    }

	    @Then("^Check the State and the Version of the approved document$")
	    public void check_the_state_and_the_version_of_the_approved_document() throws Throwable {
	    	
	    	CompletingWorkFlowTask.DocStatusAfterFinishTask();
	    	
	    	
	    }

}
