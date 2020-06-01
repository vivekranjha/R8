Feature: Create New Collection

Scenario Outline: User should be able to login into LSCP

 Given User should be on LSCP login page
 Then Verify the title of LSCP login page
 When User should enter <Username> and <Password> and login

 Examples:
 
 |Username   				|Password	|
 |vranjha@dxc.com	        |Admin@123  |


Scenario: Create New collection

Given User should be on LSCP Home Page
When Click on 'COLLECTION' accordion on the left side bar
And Click on pluss icon under 'ALL COLLECTIONS' accordion
And Enter collection name
And Click on collection OK button
Then Verify successful message for collection created
Then Verify the newly created collection under 'ALL COLLECTIONS' accordion
When Search any document and select it
And Click on Document activity icon from action toolbar or context menu
And Select option 'Add to Collection'
And Select the checkbox of newly created collection
And Click on ADD button on Add to Collection window
Then Verify successful message for adding doucmnet to collection
When Click on the newly created collection
Then Verify document added to collection succesfully