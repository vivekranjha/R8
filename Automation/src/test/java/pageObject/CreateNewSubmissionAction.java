package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import testInitiator.Base;

public class CreateNewSubmissionAction extends Base {
	
	public String ApplicationDescription;
	public String StudyID;

	public static By admin_link = By.xpath("//*[@id='sidebarCollapse']/ul//*[@title='Admin']");
	public static By Manage_link = By.xpath("//*[@class='AdminMenuList']//*[contains(text(),'Manage')]");
	public static By Add_btn = By.xpath("//*[@id='searchPane']//*[@value='Add']");
	public static By Application_Description = By.name("submissionDescription");
	public static By application_ID = By.name("applicationID");
	public static By sequence_Number = By.name("sequenceNumber");
	public static By region_drpdwn = By.name("region");
	public static By country_drpdwn = By.name("country");
	public static By status_drpdwn = By.name("status");
	public static By product_drpdwn = By.name("productType");
	public static By save_btn = By.name("Save");
	public static By Submission_Search_Bar = By.xpath("//*[@class='admincontainer']//*[@placeholder='Search']");
	public static By Submission_Search_Btn = By.xpath("//*[@class='admincontainer']//*[@type='submit']");
	public static By Select_Submission = By.xpath("//*[@class='k-grid-content k-virtual-content']//../..//table//tbody//td[2]");
	

	public CreateNewSubmissionAction() {

	}

	public void clickonManageLink() {
		waitForElementToBeVisibile(Manage_link).click();
		Sync();
	}

	public void clickonAddbtn() {
		waitForElementToBeVisibile(Add_btn).click();
		Sync();
	}

	public void enterApplicationDesc() {
		String ApplicationDescription = "DESC_" + randomValue();
		waitForElementToBeVisibile(Application_Description).sendKeys(ApplicationDescription);
		SleepWait(1);
	}

	public void enterApplicationID() {
		waitForElementToBeVisibile(application_ID).sendKeys("App" + randomValue());
		SleepWait(1);
	}

	public void enterSequenceNumber() {
		waitForElementToBeVisibile(sequence_Number).sendKeys("sequence" + randomValue());
		SleepWait(1);
	}

	public void selectRegion() {
		waitForElementToBeVisibile(region_drpdwn).click();
		SelectValueFromDropDown();
		Sync();
	}

	public void selectCountry() {
		waitForElementToBeVisibile(country_drpdwn).click();
		SelectValueFromDropDown();
		Sync();
	}

	public void selectStatusDpDwn() {
		waitForElementToBeVisibile(status_drpdwn).click();
		SelectValueFromDropDown();
		Sync();
	}

	public void selectProduct() {
		waitForElementToBeVisibile(product_drpdwn).click();
		SelectValueFromDropDown();
		Sync();
	}
	
     public void clickonSubmissionSaveButton() {
	
    	 waitForElementToBeVisibile(save_btn).click();
    	 Sync();
     }
	
	public void searchCreatedSubmission() {

		System.out.println("Submission Created Successfully");
		waitForElementToBeVisibile(Submission_Search_Bar).sendKeys(ApplicationDescription);
		waitForElementToBeVisibile(Submission_Search_Btn).click();
		Sync();

	}

	public void verifySubmission() {
		
		WebElement element = waitForElementToBeVisibile(Select_Submission);
		Assert.assertTrue(element.getText().contains(ApplicationDescription), "Submission not verified successflully");
		System.out.println("Submission Verified Successfully");

	}
}
