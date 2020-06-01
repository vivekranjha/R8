Feature:  Create New Product

Scenario Outline: User should be able to login into LSCP

 Given User should be on LSCP login page
 Then Verify the title of LSCP login page
 When User should enter <Username> and <Password> and login


 
 Examples:
 
 |Username   				|Password	|
 |vranjha@dxc.com	        |Admin@123  |

Scenario: User is able to create new product

Given Verify user should be on LSCP Home Page
When Click on the ADMIN link present on the left side bar
And Click on PRODUCT link under the 'Dictionary Management' accordion
And Click on CREATE button
And Enter product details
And Click on SAVE button
And Search the product
Then Verify newly created product on product search result page