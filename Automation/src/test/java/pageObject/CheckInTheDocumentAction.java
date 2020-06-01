package pageObject;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import testInitiator.Base;

public class CheckInTheDocumentAction extends Base{
	
	public static By Search_Doc_Placeholder = By.xpath("//*[@placeholder='Search']");
	public static By SearchDoc_Btn = By.xpath("//*[@class='input-group-append']//*[@title='Search']");
	public static By Doc_Version = By.xpath("//*[@class='k-grid-table-wrap']//tr[1]/td[2]");
	public static By Doc_State = By.xpath("//*[@class='k-grid-table-wrap']//tr[1]/td[3]");
	public static By Key_Icon = By.xpath("//*[contains(@class ,'iconsBG iconKey')]");
	public static By Doc_Select = By.xpath("//*[@class='k-grid-table-wrap']//tr[1]/td[2]");
	public static By Chk_in_out_Btn = By.xpath("//*[@title='Check-in/Check out']");
	public static By CheckIn_btn = By.xpath("//*[@id='checkinmenuPopUp']//ul//*[contains(text(),'Check-in')]");
	public static By CheckOut_btn = By.xpath("//*[@id='checkinmenuPopUp']//ul//*[contains(text(),'Check out')]");
	public static By Description_Textbx = By.name("Comment");
	public static By Select_File = By.xpath("//*[@aria-label='Select file']");
	public static By Ok_Btn = By.xpath("//*[@class='modalBtn']//button[2]");
	public static By toaster_Yes = By.xpath("//*[@class='toastBtns ng-star-inserted']/button[1]");
	public static By Context_menu = By.xpath("//*[@class='k-animation-container k-animation-container-fixed ng-star-inserted k-animation-container-shown']//li");
	
	
  
	
	public CheckInTheDocumentAction(){
		
	}
	
	public void SearchDocument() {
		 waitForElementToBeVisibile(Search_Doc_Placeholder).sendKeys(CreateNewClinicalDocumentAction.DocName);
		 SleepWait(3);
		 waitForElementToBeVisibile(SearchDoc_Btn).click();
		 Sync();
		 SleepWait(2);
	}
	public void DocumentVersionAndState() {
		
		 WebElement element =  waitForElementToBeVisibile(Doc_Version);
		 Assert.assertTrue(element.getText().equals("0.1"), "Document version is not 0.1");
		 System.out.println("Document version is 0.1");
		 
		 WebElement element1 = waitForElementToBeVisibile(Doc_State);
		 Assert.assertTrue(element1.getText().equals("Draft"), "Document State is not Draft");
		 System.out.println("Documennt State is Draft");
	}
	public void KeyIcon() {
		WebElement element = waitForElementToBeVisibile(Key_Icon);
		Assert.assertTrue(element.isDisplayed(), "A key icon is not displayed");
		System.out.println("A key icon is present");
	}
	public void DocSelect() {
		 waitForElementToBeVisibile(Doc_Select).click();
		 Sync();
	}
	public void CheckInCheckoutBtn() {
		 waitForElementToBeVisibile(Chk_in_out_Btn).click();
		 Sync();
	}
	public void CheckIn() {
		 waitForElementToBeVisibile(CheckIn_btn).click();
		 Sync();
	}
	public void CheckOut() {
		 waitForElementToBeVisibile(CheckOut_btn).click();
		 Sync();
	}
	public void DescriptionTextbx() {
		 waitForElementToBeVisibile(Description_Textbx).sendKeys("Test");
		 Sync();
	}
	public void SelectFile() throws IOException {
		 waitForElementToBeVisibile(Select_File).click();
		 SleepWait(5);
		 Runtime.getRuntime().exec("D:\\AutoIt.exe");
		 SleepWait(10);
	}
	public void OkBtn() {
		 waitForElementToBeVisibile(Ok_Btn).click();
		 Sync();
		 SleepWait(1);
	}
	
	public void DocStatusAfterChekIn() {
		
		 WebElement element = waitForElementToBeVisibile(Doc_Version);
		 Assert.assertTrue(element.getText().equals("0.2"), "Document version does not change");
		 System.out.println("Document micro version incerase to 0.2 after check-in");
		 WebElement element1 = waitForElementToBeVisibile(Doc_State);
		 Assert.assertTrue(element1.getText().equals("Draft"), "Document State is not Draft");
		 System.out.println("Documennt State is Draft after Check-In document");
		 
//		 Assert.assertTrue(!((WebElement) Key_Icon).isDisplayed(), "A key icon is present displayed");
//		 System.out.println("A key icon is not present, Document Checked-In Successfully");
						
	}
 	 public void PreviewCheckInDocument() {
 		 DocSelect();
 		 RightClick();
 		 SleepWait(2);
 		 driver.switchTo().activeElement();
 		 List<WebElement> list = driver.findElements(Context_menu);
 		 Iterator<WebElement> it = list.iterator();
 		 while(it.hasNext()) {	 	 
 		 WebElement element = it.next();
 		 
 		   if (element.getText().equals("Preview")) {
 				 element.click();
 				 SleepWait(2);
 				 System.out.println("Arender get opened");
 				 SleepWait(2);
		     	 break;
 			 }
 			 }
		 Sync();
	}

}
