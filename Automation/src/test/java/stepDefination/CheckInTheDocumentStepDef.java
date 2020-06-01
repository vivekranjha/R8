package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.CheckInTheDocumentAction;

public class CheckInTheDocumentStepDef {
	
	   CheckInTheDocumentAction CheckInTheDocument = new CheckInTheDocumentAction();
	

	    @When("^Search the newly created clinical type of document$")
	    public void search_the_newly_created_clinical_type_of_document() throws Throwable {
	    	
	    	CheckInTheDocument.SearchDocument();
	    	       
	    }

	    @Then("^Check the State and the Version of the newly created document$")
	    public void check_the_state_and_the_version_of_the_newly_created_document() throws Throwable {
	    	
	    	
	    	CheckInTheDocument.DocumentVersionAndState();
	    
	    }

	    @Then("^Check the 'key' icon in front of the document$")
	    public void check_the_key_icon_in_front_of_the_document() throws Throwable {
	      
	    	CheckInTheDocument.KeyIcon();
	    }

	    @Then("^Select the document$")
	    public void select_the_document() throws Throwable {
	    	
	    	CheckInTheDocument.DocSelect();
	    }
	    
	    @Then("^Click on Check-In/Checkout icon from action toolbar$")
	    public void click_on_checkincheckout_icon_from_action_toolbar() throws Throwable {
	    	
	    	CheckInTheDocument.CheckInCheckoutBtn();
	    	
	    }    
	    @Then("^Click on Check-In option$")
	    public void click_on_checkin_option() throws Throwable {
	    	
	    	CheckInTheDocument.CheckIn();
	    }
	    
	    @Then("^Enter comment description text box$")
	    public void enter_comment_description_text_box() throws Throwable {
	    	
	    	CheckInTheDocument.DescriptionTextbx();
	    }
	   
	    @Then("^Select the file$")
	    public void select_the_file() throws Throwable {
	    	
	    	CheckInTheDocument.SelectFile();
	    	
	    }
	    
	    @Then("^Click on OK button$")
	    public void click_on_ok_button() throws Throwable {
	    	
	    	CheckInTheDocument.OkBtn();

	    }    
	    @Then("^Check the State and the Version of the document after check-in$")
	    public void check_the_state_and_the_version_of_the_document_after_chechin() throws Throwable {
	    	
	    	
	    	CheckInTheDocument.DocStatusAfterChekIn();
	    	    
	    }
	    @Then("^Preview the selected the document$")
	    public void preview_the_selected_the_document() throws Throwable {
	    	
	    	CheckInTheDocument.PreviewCheckInDocument();
	    }
	   

}
