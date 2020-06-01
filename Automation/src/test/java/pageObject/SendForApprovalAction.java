package pageObject;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import testInitiator.Base;

public class SendForApprovalAction extends Base{
	
	public static By Doc_Select = By.xpath("//*[@class='k-grid-table-wrap']//tr[1]/td[2]");
	public static By WorkFlow_Btn = By.xpath("//*[@title='Workflow Management']");
	public static By Send_for_approval = By.xpath("//*[contains(@class ,'iconMenu popUpShow')]//ul//*[contains(text(),'Send for Approval')]");
	public static By Approver_drpdwn = By.xpath("//*[@class='k-multiselect-wrap k-floatwrap']");
	public static By Message_To_Approver = By.id("message");
	public static By Priority_drpdwn = By.xpath("//*[@formcontrolname='Priority']");
	public static By Due_Date = By.xpath("//*[@formcontrolname='DueDate']//input");
	public static By Toggle_calendar = By.xpath("//*[@title='Toggle calendar']/span");
	public static By Today_calender = By.xpath("//*[@class='k-today']");
	public static By eSignature = By.xpath("//*[@for='ac']");
	public static By Approver_list = By.xpath("//*[@class='k-animation-container k-animation-container-shown']//li");
	public static By Doc_Version = By.xpath("//*[@class='k-grid-table-wrap']//tr[1]/td[2]");
	public static By Doc_State = By.xpath("//*[@class='k-grid-table-wrap']//tr[1]/td[3]");
	public static By Send_btn = By.xpath("//*[@class='modalBtn']//button[2]");
	
	
	
	
	
	public void WorkFlowManagementIcon() {
		 waitForElementToBeVisibile(WorkFlow_Btn).click();
		 Sync();
	}
	public void Sendforapproval() {
		 waitForElementToBeVisibile(Send_for_approval).click();
		 Sync();
	}
	
	public void SelectApprover() {
         
		 driver.findElement(Approver_drpdwn).click();
		 List <WebElement> approverlist = driver.findElements(Approver_list);	
		 Iterator<WebElement> iterator = approverlist.iterator();
		    while (iterator.hasNext()) {
		        WebElement element = iterator.next(); 
		        System.out.println(element.getText());
		        if (element.getText().equals("gupta, chirag")) 
		        {
		     	   element.click();
		     	   SleepWait(1);
		     	   System.out.println("User selected in approver field");
		     	   SleepWait(1);
		     	   break;
		        } 
		    }
	}
	public void MessageToApprover() {
		 waitForElementToBeVisibile(Message_To_Approver).sendKeys("Hey");
		 SleepWait(1);
	}
	public void selectPriority() {
		 waitForElementToBeVisibile(Priority_drpdwn).click();
		 SelectValueFromDropDown();
		 Sync();
	}
	public void selectDueDate() {
	
		 waitForElementToBeVisibile(Toggle_calendar).click();
		 SleepWait(1);
		 waitForElementToBeVisibile(Today_calender).click();
		 SleepWait(2);
	}
	public void eSignature() {
		 waitForElementToBeVisibile(eSignature).click();
		  Sync();
	}
	public void SendBtn() {
		 waitForElementToBeVisibile(Send_btn).click();
		 Sync();
		 SleepWait(3);
	}
	
   public void VerifyForApprovalDoc() {
	   
		 WebElement element1 = waitForElementToBeVisibile(Doc_State);
		 Assert.assertTrue(element1.getText().equals("For Approval"), "Document State does not change to for approval");
		 System.out.println("Documennt State is change to for approval");
   }
}
