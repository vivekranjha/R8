package pageObject;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import testInitiator.Base;

public class CreateNewClinicalDocumentAction extends Base{
	
	 static String DocName;
	 
	 
	
	public static By Clinical_Document_Link = By.xpath("//h4[@class='iconsBG myquickLink']//a/../..//li[1]");
	public static By Document_Type = By.name("Document Type");
	public static By Document_SubType = By.name("DocumentSubtype");
	public static By Document_Unit = By.name("DocumentUnit");
	public static By Document_Template = By.name("DocumentTemplate");
	public static By Restricted_Document = By.xpath("//*[@formcontrolname='isRestrictedDocument']");
	public static By Title = By.xpath("//*[@formcontrolname='Title']");
	public static By Desciption = By.xpath("//*[@formcontrolname='Description']");
	public static By Product = By.xpath("//*[@formcontrolname='Product']");
	public static By Associated_Product = By.xpath("//*[@formcontrolname='AssociatedProducts']");
	public static By Authoring_Site = By.xpath("//*[@formcontrolname='AuthoringSite']");
	public static By eTMFOutline_Node = By.xpath("//*[@formcontrolname='eTMFOutlineNode']");
	public static By Study_ID = By.xpath("//*[@formcontrolname='StudyID']");
	public static By StudySite_Group = By.xpath("//kendo-dropdownlist[@formcontrolname='StudySiteGroup']");
	public static By DocumentDate_Definition = By.xpath("//*[@formcontrolname='DocumentDateDefinition']");
	public static By Lab_Name = By.xpath("//*[@formcontrolname='LabName']");
	public static By Indication = By.xpath("//*[@formcontrolname='Indication']");
	public static By Institution_Name = By.xpath("//*[@formcontrolname='InstitutionName']");
	public static By Submission_AddNew_Btn = By.xpath("//*[contains(text(),'Add new')]");
	public static By Submission_Control = By.xpath("//*[contains(@class ,'submControl')]");
	public static By Submission_Plus_Btn = By.xpath("//*[@title='Add']");
	public static By Finish_Btn = By.xpath("//*[@name='Finish']");
	public static By Document_Im_Working_On_Tile = By.xpath("//h4[@class='iconsBG checkout']//a/../..//li");
	
	
	public CreateNewClinicalDocumentAction() {
		
	}
	
	public void clickonClinicalDocumentLink() {
		waitForElementToBeVisibile(Clinical_Document_Link).click();
		Sync();
		SleepWait(1);
	}
	
	public void selectDocumentType() {
		 waitForElementToBeVisibile(Document_Type).click();
		 SelectValueFromDropDown();
		 Sync();
	}
	public void selectDocumentSubType() {
		 waitForElementToBeVisibile(Document_SubType).click();
		 SelectValueFromDropDown();
		 Sync();
	
	}
	public void selectDocumentUnit() {
		 waitForElementToBeVisibile(Document_Unit).click();
		 SelectValueFromDropDown3();
		 Sync();
		
		
	}
	public void selectDocumentTemplate() {
		 waitForElementToBeVisibile(Document_Template).click();
		 SelectValueFromDropDown();
		 Sync();
	}
	public void selectRestrictedDocument() {
	     waitForElementToBeVisibile(Restricted_Document);
		 SelectValueFromDropDown();
		 Sync();
	}
   
	public void enterTitle() {
		 
		 DocName = "DOC"+ randomValue();
		 waitForElementToBeVisibile(Title).sendKeys(DocName);	
		 Sync();
		 SleepWait(1);
	}
	public void enterDescription() {
		 waitForElementToBeVisibile(Desciption).sendKeys("DESC");
		 Sync();
		 SleepWait(1);
		 
	}
	public void selectProduct() {
		 waitForElementToBeVisibile(Product).click();
		 SelectValueFromDropDown();
		 Sync();
		 SleepWait(1);
	}
	public void selectAssocitedProducts() {
		 waitForElementToBeVisibile(Associated_Product).click();
		 SelectValueFromDropDown();
		 Sync();
	}
	public void selectAuthoringSite() {
		 waitForElementToBeVisibile(Authoring_Site).click();
		 SelectValueFromDropDown();
		 Sync();
	}
	public void selectClinicalStudyID() {
		 waitForElementToBeVisibile(Study_ID).click();
		 SelectValueFromDropDown();
		 Sync();
	}
	public void selecteTMFOutlineNode() {
		 waitForElementToBeVisibile(eTMFOutline_Node).click();
		 SelectValueFromDropDown();
		 SleepWait(3);
	}
	public void selectStudySiteGroup() {
		 waitForElementToBeVisibile(StudySite_Group).click();
		 SelectValueFromDropDown();
		 Sync();
	}
	public void selectDocumentDateDefinition() {
	     waitForElementToBeVisibile(DocumentDate_Definition).click();
		 SelectValueFromDropDown();
		 Sync();
	}
	public void selectLabName() {
		 waitForElementToBeVisibile(Lab_Name).click();
		 SelectValueFromDropDown();
		 Sync();
	}
	public void selectIndication() {
		 waitForElementToBeVisibile(Indication).click();
		 SelectValueFromDropDown();
		 Sync();
	}
	public void selectInstitutionName() {
		 waitForElementToBeVisibile(Institution_Name).click();
		 SelectValueFromDropDown();
		 Sync();
		 
	}
	public void clickonSubmissionAddNewBtn() {
	     waitForElementToBeVisibile(Submission_AddNew_Btn).click();
		 Sync();
	}
	public void selectSubmControl() {
		 waitForElementToBeVisibile(Submission_Control).click();
		 SelectValueFromDropDown();
		 Sync();
	}

	public void clickonSubmissionPlusBtn() {
		 waitForElementToBeVisibile(Submission_Plus_Btn).click();
		 ScrollUp();
		 SleepWait(3);
	}
	public void clickonFinishBtn() {
	     waitForElementToBeVisibile(Finish_Btn).click();
		 Sync();
		 refreshPage();
		 Sync(); 
		 SleepWait(2);
		 }

    public void CheckoutDocTile() {
    
     System.out.println("Document Created " + DocName);
     waitForElementToBeVisibile(Document_Im_Working_On_Tile);
	 List<WebElement> list = driver.findElements(Document_Im_Working_On_Tile);
	 Iterator<WebElement> it = list.iterator();
	 while(it.hasNext()) {	 	 
	 WebElement element = it.next();
	 System.out.println(element.getText());
	   if (element.getText().equals(DocName +" , 0.1 , Draft")) {
			 System.out.println(DocName + " is present in checked out tile");
			 break;
		 }
		 }
		 
	 
	}

	
}
