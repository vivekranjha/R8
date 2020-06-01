package stepDefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.CreateNewClinicalStudyAction;

public class CreateNewClinicalStudyStepDef {
	
	CreateNewClinicalStudyAction CreateNewClinicalStudy = new CreateNewClinicalStudyAction();
	
	
    @And("^Click on Clinical Study link under DICTIONARY MANAGEMENT accordion$")
    public void click_on_clinical_study_link_under_dictionary_management_accordion() throws Throwable {
    	
    	CreateNewClinicalStudy.clickonClinicalStudyLink();
    }

    @And("^Enter clinical study details$")
    public void enter_clinical_study_details() throws Throwable {
    	
      	CreateNewClinicalStudy.selectStudyProductName();
    	CreateNewClinicalStudy.enterStudyId();
    	CreateNewClinicalStudy.enterStudyName();
    	CreateNewClinicalStudy.selectDiscipline();
    	CreateNewClinicalStudy.selectSubDisciplineCode();
    	CreateNewClinicalStudy.clickonDosageAddNewBtn();
    	CreateNewClinicalStudy.selectDosageForm();
    	CreateNewClinicalStudy.selectDosageStrength();
    	CreateNewClinicalStudy.selectRouteOfAdministration();
    	CreateNewClinicalStudy.clickonDosagePlusIcon();
    	CreateNewClinicalStudy.selectIndication();
    	CreateNewClinicalStudy.selectControlType();
    	CreateNewClinicalStudy.selectStudyPhase();
    	CreateNewClinicalStudy.selectClinicalReport();
    	CreateNewClinicalStudy.clickonSiteAddNewBtn();
    	CreateNewClinicalStudy.enterStudySite();
    	CreateNewClinicalStudy.selectInstituteName();
    	CreateNewClinicalStudy.enterPrincipalInvestigator();
    	CreateNewClinicalStudy.selectStudySiteGroupCode();
    	CreateNewClinicalStudy.clickonSitePlusIcon();
    
    }
    

    @And("^Search created clinical study$")
    public void search_created_clinical_study() throws Throwable {
    	
    	CreateNewClinicalStudy.searchCreatedStudyId();
    }



    @Then("^Verify the newly created clinical study$")
    public void verify_the_newly_created_clinical_study() throws Throwable {
    
         CreateNewClinicalStudy.verifyStudyID();
          
    }

}

