package stepDefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.CreateNewClinicalDocumentAction;

public class CreateNewClinicalDocumentStepDef {
	
	CreateNewClinicalDocumentAction CreateNewClinicalDocument = new CreateNewClinicalDocumentAction();
	

    @When("^Click on 'New Clinical Document' from 'QUICK LINKS' tile$")
    public void click_on_new_clinical_document_from_quick_links_tile() throws Throwable {
    	
    	CreateNewClinicalDocument.clickonClinicalDocumentLink();
       
    }

    @And("^Fill all the mandatory fields to create document$")
    public void fill_all_the_mandatory_fields_to_create_document() throws Throwable {
    	
    	CreateNewClinicalDocument.selectDocumentSubType();
    	CreateNewClinicalDocument.selectDocumentUnit();
    	CreateNewClinicalDocument.enterTitle();
    	CreateNewClinicalDocument.selectProduct();
    //	CreateNewClinicalDocument.selecteTMFOutlineNode();
   	    CreateNewClinicalDocument.selectClinicalStudyID();
    	CreateNewClinicalDocument.selectStudySiteGroup();
   	    CreateNewClinicalDocument.selectDocumentDateDefinition();
    	CreateNewClinicalDocument.selectLabName();
    	CreateNewClinicalDocument.clickonSubmissionAddNewBtn();
     	CreateNewClinicalDocument.selectSubmControl();
    	CreateNewClinicalDocument.clickonSubmissionPlusBtn();
        
    }

    @And("^Click on FINISH button to create document$")
    public void click_on_finish_button_to_create_document() throws Throwable {
    	
     	CreateNewClinicalDocument.clickonFinishBtn();
    	
       
    }
    

    @Then("^Verify the document under the 'DOCUMENT IM WORKING ON' tile on 'Dashboard'$")
    public void verify_the_document_under_the_document_im_working_on_tile_on_dashboard() throws Throwable {
    	
    	CreateNewClinicalDocument.CheckoutDocTile();
    	
        
    }


}


