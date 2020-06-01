package pageObject;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import testInitiator.Base;

public class CreateNewClinicalStudyAction extends Base {

	public String StudyID;

	public static By admin_link = By.xpath("//*[@id='sidebarCollapse']/ul//*[@title='Admin']");
	public static By clinical_study_link = By
			.xpath("//*[@class='AdminMenuList']//*[contains(text(),'Clinical Study')]");
	public static By create_btn = By.xpath("//*[@id='searchPane']//*[@value='Create']");
	public static By Product_name_drpdwn = By.name("ProductId");
	public static By study_id = By.id("StudyId");
	public static By study_name = By.id("StudyName");
	public static By Discipline_Code_drpdwn = By.name("DisciplineCode");
	public static By SubDiscipline_Code_drpdwn = By.name("SubDisciplineCode");
	public static By Dosage_AddNew_btn = By.xpath("(//*[@class='ContentBar']//*[contains(text(),'Add new')])[1]");
	public static By DosageFormCode_drpdwn = By.name("DosageFormCode");
	public static By DosageStrengthCode_drpdwn = By.name("DosageStrengthCode");
	public static By RouteOfAdministrationCode_drpdwn = By.name("RouteOfAdministrationCode");
	public static By Dosage_Plus_btn = By.xpath("//*[@title='Add']");
	public static By IndicationCode_drpdwn = By.name("IndicationCode");
	public static By ControlType_drpdwn = By.name("ControlCode");
	public static By StudyPhaseCode_drpdwn = By.name("StudyPhaseCode");
	public static By ClinicalReportCode_drpdwn = By.name("ClinicalReportCode");
	public static By Site_AddNew_btn = By.xpath("(//*[@class='ContentBar']//*[contains(text(),'Add new')])[2]");
	public static By Study_Site = By.name("StudySite");
	public static By InstituteNameCode_drpdwn = By.name("InstituteNameCode");
	public static By Principal_Investigator = By.name("PrincipalInvestigator");
	public static By StudySiteGroupCode_drpdwn = By.name("StudySiteGroupCode");
	public static By SiteInformation_Plus_btn = By.xpath("//*[@title='Add']");
	public static By save_btn = By.xpath("(//*[@class='btn btn-primary'])[2]");
	public static By Study_Search_Bar = By.xpath("//*[@class='admincontainer']//*[@placeholder='Search']");
	public static By Study_Search_Btn = By.xpath("//*[@class='admincontainer']//*[@type='submit']");
	public static By Select_StudyId = By.xpath("//*[@class='k-grid-content k-virtual-content']//../..//table//tbody//td[2]");
	
	

	public CreateNewClinicalStudyAction() {

	}

	public void clickonClinicalStudyLink() {
		waitForElementToBeVisibile(clinical_study_link).click();
		Sync();

	}

	public void selectStudyProductName() {

		waitForElementToBeVisibile(Product_name_drpdwn).click();
		SelectValueFromDropDown();
		Sync();

	}

	public void enterStudyId() {
		StudyID = "Stdy" + randomValue();
		waitForElementToBeVisibile(study_id).sendKeys(StudyID);
		SleepWait(1);

	}

	public void enterStudyName() {

		waitForElementToBeVisibile(study_name).sendKeys("Std"+StudyID);
		SleepWait(1);
	}

	public void selectDiscipline() {

		waitForElementToBeVisibile(Discipline_Code_drpdwn).click();
		SelectValueFromDropDown();
		Sync();
	}

	public void selectSubDisciplineCode() {
		waitForElementToBeVisibile(SubDiscipline_Code_drpdwn).click();
		SelectValueFromDropDown();
		Sync();
	}

	public void clickonDosageAddNewBtn() {
		waitForElementToBeVisibile(Dosage_AddNew_btn).click();
		SleepWait(1);
	}

	public void selectDosageForm() {
		waitForElementToBeVisibile(DosageFormCode_drpdwn).click();
		SelectValueFromDropDown();
		Sync();
	}

	public void selectDosageStrength() {
		waitForElementToBeVisibile(DosageStrengthCode_drpdwn).click();
		SelectValueFromDropDown();
		Sync();
	}

	public void selectRouteOfAdministration() {
		waitForElementToBeVisibile(RouteOfAdministrationCode_drpdwn).click();
		SelectValueFromDropDown();
		Sync();
	}

	public void clickonDosagePlusIcon() {
		waitForElementToBeVisibile(Dosage_Plus_btn).click();
		SleepWait(1);
	}

	public void selectIndication() {
		waitForElementToBeVisibile(IndicationCode_drpdwn).click();
		SelectValueFromDropDown();
		Sync();
	}

	public void selectControlType() {
		waitForElementToBeVisibile(ControlType_drpdwn).click();
		SelectValueFromDropDown();
		Sync();
	}

	public void selectStudyPhase() {
		waitForElementToBeVisibile(StudyPhaseCode_drpdwn).click();
		SelectValueFromDropDown();
		Sync();
	}

	public void selectClinicalReport() {
		waitForElementToBeVisibile(ClinicalReportCode_drpdwn).click();
		SelectValueFromDropDown();
		Sync();
	}

	public void clickonSiteAddNewBtn() {
		waitForElementToBeVisibile(Site_AddNew_btn).click();
		SleepWait(1);
	}

	public void enterStudySite() {
		waitForElementToBeVisibile(Study_Site).sendKeys("StudySite");
		SleepWait(1);
	}

	public void selectInstituteName() {
		waitForElementToBeVisibile(InstituteNameCode_drpdwn).click();
		SelectValueFromDropDown();
		Sync();
	}

	public void enterPrincipalInvestigator() {
		waitForElementToBeVisibile(Principal_Investigator).sendKeys("PrincipalInvestigator");
		SleepWait(1);
	}

	public void selectStudySiteGroupCode() {
		waitForElementToBeVisibile(StudySiteGroupCode_drpdwn).click();
		SelectValueFromDropDown();
		Sync();
	}

	public void clickonSitePlusIcon() {
		waitForElementToBeVisibile(SiteInformation_Plus_btn).click();
		SelectValueFromDropDown();
		Sync();
	}
	
	public void searchCreatedStudyId() {
		
		System.out.println("Clinical StudyId "+ StudyID +"created Successfully");
		waitForElementToBeVisibile(Study_Search_Bar).sendKeys(StudyID);
		SleepWait(2);
		waitForElementToBeVisibile(Study_Search_Btn).click();
		Sync();	
	}

	public void verifyStudyID() {
		
	    WebElement element = waitForElementToBeVisibile(Select_StudyId);
		Assert.assertTrue(element.getText().contains(StudyID),"StudyId not verified");
		System.out.println("StudyId Verified successfully");

	}

}
