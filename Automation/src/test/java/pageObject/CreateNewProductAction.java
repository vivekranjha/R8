package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import testInitiator.Base;

public class CreateNewProductAction extends Base {

	public static String ProductName;
	

	public static By admin_link = By.xpath("//*[@id='sidebarCollapse']/ul//*[@title='Admin']");
	public static By product_link = By.xpath("//*[@id='filterPane']//*[contains(text(),'Products')]");
	public static By create_btn = By.xpath("//*[@id='searchPane']//*[@value='Create']");
	public static By documentsystem_btn = By.xpath("//*[@name='DocumentSystemCode']");
	public static By usr_link = By.xpath("//*[@id=\"filterPane\"]/div[9]/ul/li/a");
	public static By doc_link = By.xpath("//*[@class='k-multiselect-wrap k-floatwrap']");
	public static By inp_txt = By.xpath("//*[@class=\"k-multiselect-wrap k-floatwrap\"]//input");
	public static By AddNew_Btn = By.xpath("//*[@class='k-button k-grid-add-command']");
	public static By Alias_name = By.name("AliasName");
	public static By Alias_type = By.xpath("//kendo-dropdownlist[@name='AliasType']");
	public static By Mrkt_drpdn = By.name("Market");
	public static By Plus_btn = By.xpath("//*[@title='Add']");
	public static By Product_code = By.id("ProductCode");
	public static By Product_Name = By.id("ProductName");
	public static By save_btn = By.xpath("//*[@id='searchPane']//*[contains(text(),'Save')]");
	public static By Product_Search_Bar = By.xpath("//*[@class='admincontainer']//*[@placeholder='Search']");
	public static By Product_Serach_Btn = By.xpath("//*[@class='admincontainer']//*[@type='submit']");
	public static By Select_product = By.xpath("//*[@class='k-grid-content k-virtual-content']//../..//table//tbody//tr//td");
	
	

	public CreateNewProductAction() {

	}

	public void clickOnAdminLink() {

		waitForElementToBeVisibile(admin_link).click();
		Sync();
	}

	public void clickOnProductLink() {

		waitForElementToBeVisibile(product_link).click();
		Sync();
	}

	public void clickonCreateButton() {
		
		waitForElementToBeVisibile(create_btn).click();
		Sync();
	
	}

	public void clickonAddNewButton() {
		
		waitForElementToBeVisibile(AddNew_Btn).click();
		Sync();
	}

	public void enterAliasName() {
		
		waitForElementToBeVisibile(Alias_name).sendKeys("PD");
		Sync();

	}
	public void selectAliasType() {
		
		waitForElementToBeVisibile(Alias_type).click();
		SleepWait(1);
		SelectValueFromDropDown();
		Sync();

	}
	public void selectMarket() {
		
		waitForElementToBeVisibile(Mrkt_drpdn).click();
		SleepWait(1);
		SelectValueFromDropDown();
		Sync();

	}

	public void clickonPlusButton() {
		
		waitForElementToBeVisibile(Plus_btn).click();
		Sync();
	}

	public void enterProductCode() {

		waitForElementToBeVisibile(Product_code).sendKeys("PDCode" + randomValue());
		SleepWait(2);
	}

	public void enterProductName() {
		
		ProductName = "Prod" + randomValue();
		waitForElementToBeVisibile(Product_Name).sendKeys(ProductName);
		System.out.println("Entered Product Name is : " + ProductName);
		SleepWait(1);
	}

	public void clickonSaveButton() {
		
		waitForElementToBeVisibile(save_btn).click();
		Sync();
		SleepWait(5);
	}

	public void serachCreatedProduct() {
		
		System.out.println("Product saved sucessfully");
		waitForElementToBeVisibile(Product_Search_Bar).sendKeys(ProductName);
		waitForElementToBeVisibile(Product_Serach_Btn).click();
		Sync();
			
	}
	
    public void verifyProduct() {
    	
    WebElement element = waitForElementToBeVisibile(Select_product);  
    Assert.assertTrue(element.getText().contains(ProductName),"Created product not verified successfully"); 
    System.out.println("Created product verified successfully");

			
	}

}