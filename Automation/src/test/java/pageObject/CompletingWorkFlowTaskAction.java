package pageObject;



import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import testInitiator.Base;

public class CompletingWorkFlowTaskAction extends Base {
	
	
	public static By User_profile_link = By.id("userAdminLink");
	public static By Logout_link = By.xpath("//*[@id='profileList']//*[contains(text(),'Logout')]");
	public static By Logout_Yesbtn = By.xpath("//*[@id='toast-container']//*[contains(text(),'Yes')]");
	public static By WorkFlow_Link = By.xpath("//*[@id='sidebarCollapse']/ul//*[@title='Workflows']");	
	public static By forApproval_Chkbx = By.xpath("//*[@for='forApproval']");
	public static By Doc_Select = By.xpath("//*[@class='k-grid-table-wrap']//tr[1]/td[1]");
	public static By Finish_Task = By.xpath("//*[contains(@class ,'iconMenu popUpShow')]//ul//*[contains(text(),'Finish Task')]");
	public static By Modal_Window = By.xpath("//*[contains(@class ,'dialogSlideInAppear')]");
	public static By Outcome_drpdwn = By.xpath("//*[contains(@formcontrolname,'Status')]//span[2]");
	public static By MeaningCode_drpdwn = By.xpath("//*[contains(@formcontrolname,'MeaningCode')]//span[2]");
	public static By Message_txtbox = By.xpath("//*[contains(@formcontrolname,'Comment')]");
	public static By eSignature_password = By.id("password"); 
	public static By Workflow_FinishBtn = By.xpath("//*[@class='modalBtn']/button[2]");
	public static By Search_Doc_Placeholder = By.xpath("//*[@placeholder='Search']");
	public static By SearchDoc_Btn = By.xpath("//*[@class='input-group-append']//*[@title='Search']");
	public static By Doc_Version = By.xpath("//*[@class='k-grid-table-wrap']//tr[1]/td[2]");
	public static By Doc_State = By.xpath("//*[@class='k-grid-table-wrap']//tr[1]/td[3]");
	
	
	
	
	public void Logout() {
		
		waitForElementToBeVisibile(User_profile_link).click();
		SleepWait(1);
		waitForElementToBeVisibile(Logout_link).click();
		SleepWait(2);
		waitForElementToBeVisibile(Logout_Yesbtn).click();
		Sync();
		SleepWait(1);
	}
	
	public void ApproverLogin() {
		

	 driver.findElement(By.id("username")).clear();
	 SleepWait(1);
	 driver.findElement(By.id("username")).sendKeys("cgupta32@dxc.com");
	 SleepWait(1);
	 driver.findElement(By.id("password")).clear();
	 SleepWait(1);
	 driver.findElement(By.id("password")).sendKeys("Admin@123");
	 SleepWait(1);
	 driver.findElement(By.xpath("//*[@type='submit']")).click();
	 Sync();
		
	}
	public void WorkflowLink() {
		 waitForElementToBeVisibile(WorkFlow_Link).click();
		 Sync();
	}
	
	public void forApprovalChkbx() {
		 waitForElementToBeVisibile(forApproval_Chkbx).click();
		 Sync();
		 SleepWait(5);
	}
	
	public void SelectDocument() {
		
		List<WebElement> list = driver.findElements(Doc_Select);
		Iterator<WebElement> iterator = list.iterator();
	    while (iterator.hasNext()) {
	        WebElement element = iterator.next(); 
	        if (element.getText().equals(CreateNewClinicalDocumentAction.DocName)) 
	        {
	     	   element.click();
	     	   SleepWait(1);
	     	   break;
	        } 
	    }
		 
		
	}
	public void FinishTask() {
		 waitForElementToBeVisibile(Finish_Task).click();
		 Sync();
	}
	public void ModalWindow() {
		 WebElement element = waitForElementToBeVisibile(Modal_Window);
		 Assert.assertTrue(element.isDisplayed(), "Modal window does not display");
	}
	public void selectOutcome() {
		 waitForElementToBeVisibile(Outcome_drpdwn).click();
		 SelectValueFromDropDown();
		 Sync();
	}
	public void selectMeaning() {
		 waitForElementToBeVisibile(MeaningCode_drpdwn).click();
		 SelectValueFromDropDown();
		 Sync();
	}
	public void Message() {
		 waitForElementToBeVisibile(Message_txtbox).sendKeys("Message Entered");
		 SleepWait(2);
	}
	public void eSignaturePassword() {
		 waitForElementToBeVisibile(eSignature_password).sendKeys("Admin@123");
		 SleepWait(2);
	}
	public void WorkflowFinishBtn() {
		 waitForElementToBeVisibile(Workflow_FinishBtn).click();
		 Sync();
	}
	
	public void SearchDocument() {
		 waitForElementToBeVisibile(Search_Doc_Placeholder).sendKeys(CreateNewClinicalDocumentAction.DocName);
		 SleepWait(3);
		 waitForElementToBeVisibile(SearchDoc_Btn).click();
		 Sync();
		 SleepWait(2);
	}
	
	public void DocStatusAfterFinishTask() {
		
		 WebElement element = waitForElementToBeVisibile(Doc_Version);
		 Assert.assertTrue(element.getText().equals("1.0"), "Document version does not change");
		 System.out.println("Document get approved with version 1.0");
		 WebElement element1 = waitForElementToBeVisibile(Doc_State);
		 Assert.assertTrue(element1.getText().equals("Approved"), "Document does not get Approved");
		 System.out.println("Documennt state change to Approved");

	}


}
