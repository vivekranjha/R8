Feature: SAVE and SAVE & CLOSE 

Scenario Outline: User should be able to login into LSCP

 Given User should be on LSCP login page
 Then Verify the title of LSCP login page
 When User should enter <Username> and <Password> and login

 Examples:
 
 |Username   				|Password	|
 |vranjha@dxc.com	        |Admin@123  |


Scenario: Verifying SAVE and SAVE & CLOSE 

Given User should be on LSCP Home Page
When Click on 'New Clinical Document' from 'QUICK LINKS' tile
And Fill the field in 'CLASSIFICATION' accordion
And Enter title	
And Click on FINISH button to create document
Then Verify toaster message should display
And Click on cross icon to Cancel the toaster 
When Click on 'SAVE' button
Then Verify successful message should display
Then Verify user should be on same page
When Click on 'SAVE & CLOSE' button
Then Verify user should be redirected to Dashboard
Then Verify the document in 'PENDING DOCUMENTS' tile on dashboard
When Click on the document present in 'PENDING DOCUMENTS' tile
And Fill all the mandatory fields to create document
And Click on FINISH button to create document
Then Verify document should not be present in 'PENDING DOCUMENTS' tile
Then Verify the document in 'DOCUMENT I'M WORKING ON' tile on dashboard