package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.SendForApprovalAction;

public class SendForApprovalStepDef {
	
	SendForApprovalAction SendForApproval = new SendForApprovalAction();
	
	 

    @Then("^Click on Workflow Management Icon from action toolbar$")
    public void click_on_workflow_management_icon_from_action_toolbar() throws Throwable {

    	       SendForApproval.WorkFlowManagementIcon();
    }

    @Then("^Click on Send for Approval option$")
    public void click_on_send_for_approval_option() throws Throwable {
    	
    	       SendForApproval.Sendforapproval();
    }

    
    @Then("^Select the approver$")
    public void select_the_approver() throws Throwable {

    	SendForApproval.SelectApprover();
    }
	    	
	    	
    @Then("^Select Task Priority$")
    public void select_task_priority() throws Throwable {
    	
    	SendForApproval.selectPriority();
    }

    @Then("^Select Due Date$")
    public void select_due_date() throws Throwable {
    	
    	SendForApproval.selectDueDate();
    }

    @Then("^Select the esignature checkbox$")
    public void select_the_esignature_checkbox() throws Throwable {
    
            SendForApproval.eSignature();
    }

	@Then("^Click on SEND button$")
	public void click_on_send_button() throws Throwable {
		
		SendForApproval.SendBtn();
	       
	    }


    @Then("^Check the State and Version after document send for Approval$")
    public void check_the_state_and_version_after_document_send_for_approval() throws Throwable {

    	SendForApproval.VerifyForApprovalDoc();

}
}