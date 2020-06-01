package stepDefination;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObject.CreateNewProductAction;
import testInitiator.Base;

public class CreateNewProductStepDef extends Base {
	
	CreateNewProductAction CreateNewProduct = new CreateNewProductAction();

    @When("^Click on the ADMIN link present on the left side bar$")
    public void click_on_the_admin_link_present_on_the_left_side_bar() throws Throwable {

    	     CreateNewProduct.clickOnAdminLink();
    }

    @And("^Click on PRODUCT link under the 'Dictionary Management' accordion$")
    public void click_on_product_link_under_the_dictionary_management_accordion() throws Throwable {
    
    	     CreateNewProduct.clickOnProductLink();
    }
    
    @And("^Click on CREATE button$")
    public void click_on_create_button() throws Throwable {
    	
    	CreateNewProduct.clickonCreateButton();
    }

    @And("^Enter product details$")
    public void enter_product_details() throws Throwable {
    	
    	CreateNewProduct.clickonAddNewButton();
    	CreateNewProduct.enterAliasName();
    	CreateNewProduct.selectAliasType();
    	CreateNewProduct.selectMarket();
    	CreateNewProduct.clickonPlusButton();
    	CreateNewProduct.enterProductCode();
    	CreateNewProduct.enterProductName();
    }
    

    @And("^Click on SAVE button$")
    public void click_on_save_button() throws Throwable {
    	
    	CreateNewProduct.clickonSaveButton();
    }
   
    @And("^Search the product$")
    public void search_the_product() throws Throwable {
   
    	CreateNewProduct.serachCreatedProduct();
    }
    
    @Then("^Verify newly created product on product search result page$")
    public void verify_newly_created_product_on_product_search_result_page() throws Throwable {
    	
    	CreateNewProduct.verifyProduct();
    }

 

}
